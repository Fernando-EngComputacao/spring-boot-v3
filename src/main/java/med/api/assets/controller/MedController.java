package med.api.assets.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class MedController {


    @PostMapping("/search")
    public String register(@RequestBody String json){
        return json;
    }

    @GetMapping
    public String helloWorld(){
        return "Hello World, Fernando Furtado!!! ";
    }
}
