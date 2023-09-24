package med.api.assets.controller;

import jakarta.validation.Valid;
import med.api.assets.dto.input.InputFormDoctor;
import med.api.assets.dto.ouput.ListingDoctor;
import med.api.assets.model.Doctor;
import med.api.assets.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class MedController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping("/search")
    public void register(@RequestBody @Valid InputFormDoctor data){
        doctorRepository.save(new Doctor(data));
    }

    @GetMapping
    public Page<ListingDoctor> findAll(@PageableDefault(size = 10, sort = {"nome"}) Pageable page){
        return doctorRepository.findAll(page).map(ListingDoctor::new);
    }
}
