package tech.zaibaq.dockermavenplugin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello(){
        return "Test";
    }
    @GetMapping("/{name}")
    public String helloName(@PathVariable String name){
        return "Hello "+name+" <h1>  Yesssssss</h1>";
    }
}
