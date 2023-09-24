package med.api.assets.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.api.assets.dto.input.InputFormDoctor;
import med.api.assets.dto.input.UpdateFormDoctor;
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

    @GetMapping("/status")
    public Page<ListingDoctor> findAllByAtivo(@PageableDefault(size = 10, sort = {"nome"}) Pageable page){
        return doctorRepository.findAllByAtivoTrue(page).map(ListingDoctor::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public void update(@RequestBody @Valid UpdateFormDoctor data){
        var doctor = doctorRepository.getReferenceById(data.id());
        doctor.updateInformations(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        doctorRepository.deleteById(id);
    }

    @DeleteMapping("/logical/{id}")
    @Transactional
    public void logicalDelete(@PathVariable Long id) {
        var doctor = doctorRepository.getReferenceById(id);
        doctor.desable();
    }
}
