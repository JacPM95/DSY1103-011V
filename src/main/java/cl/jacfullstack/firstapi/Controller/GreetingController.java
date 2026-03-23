package cl.jacfullstack.firstapi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String saludo(){
        return "Hola, esta es mi primera API REST";
    }
}
