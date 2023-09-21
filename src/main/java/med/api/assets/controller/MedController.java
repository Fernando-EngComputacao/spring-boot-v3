package med.api.assets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class MedController {

    @GetMapping
    public String helloWorld(){
        return "Hello World, Fernando Furtado!!! ";
    }
}
