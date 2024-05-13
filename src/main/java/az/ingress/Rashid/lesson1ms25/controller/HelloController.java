package az.ingress.Rashid.lesson1ms25.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {


    @GetMapping
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("/v2")
    public String getHello2(){
        return "Hello Ms-25";
    }

}
