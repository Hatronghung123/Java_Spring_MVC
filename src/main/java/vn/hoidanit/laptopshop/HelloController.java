package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Hello World From Spring Boot With 1 !";
    }
    @GetMapping("/user")
    public String userPage(){
        return "Hello World From Spring Boot With User!";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "Hello World From Spring Boot With Admin 1s223s !";
    }
}
