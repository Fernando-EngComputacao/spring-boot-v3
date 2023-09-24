package med.api.assets.controller;

import med.api.assets.dto.InputFormDoctor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class MedController {


    @PostMapping("/search")
    public InputFormDoctor register(@RequestBody InputFormDoctor data){
        System.out.println(data.toString());
        return data;
    }

    @GetMapping
    public String helloWorld(){
        return "Hello World, Fernando Furtado!!! ";
    }
}
