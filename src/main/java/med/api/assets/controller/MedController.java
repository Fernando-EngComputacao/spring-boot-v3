package med.api.assets.controller;

import med.api.assets.dto.InputFormDoctor;
import med.api.assets.model.Doctor;
import med.api.assets.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class MedController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping("/search")
    public InputFormDoctor register(@RequestBody InputFormDoctor data){

        doctorRepository.save(new Doctor(data));
        return data;
    }

    @GetMapping
    public String helloWorld(){
        return "Hello World, Fernando Furtado!!! ";
    }
}
