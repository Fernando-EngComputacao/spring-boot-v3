package med.api.assets.dto.ouput;

import med.api.assets.dto.details.Especialidade;
import med.api.assets.model.Doctor;

public record ListingDoctor(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public ListingDoctor(Doctor doctor){
        this(doctor.getId(), doctor.getNome(), doctor.getEmail(), doctor.getCrm(), doctor.getEspecialidade());
    }
}
