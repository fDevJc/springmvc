package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping
    public String users() {
        log.info("users()");
        return "ok";
    }

    @PostMapping
    public String addUser() {
        log.info("addUser()");
        return "ok";
    }

    @GetMapping("{userId}")
    public String findUser(@PathVariable String userId) {
        log.info("findUser: data: userId="+ userId);

        return "ok";
    }

    @PatchMapping("{userId}")
    public String patchUser(@PathVariable String userId) {
        log.info("patchUser: data: userId="+ userId);

        return "ok";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable String userId) {
        log.info("deleteUser: data: userId="+ userId);

        return "ok";
    }
}
