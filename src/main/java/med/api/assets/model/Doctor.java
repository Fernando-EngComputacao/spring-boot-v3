package med.api.assets.model;

import jakarta.persistence.*;
import lombok.*;
import med.api.assets.dto.input.InputFormDoctor;
import med.api.assets.dto.details.Especialidade;
import med.api.assets.dto.input.UpdateFormDoctor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "doctors")
@Entity(name = "Doctor")
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
    private Boolean ativo;

    public Doctor(InputFormDoctor form) {
        this.ativo = true;
        this.nome = form.nome();
        this.crm = form.crm();
        this.email = form.email();
        this.telefone = form.telefone();
        this.especialidade = form.especialidade();
        this.endereco = new Endereco(form.endereco());

    }

    public void updateInformations(UpdateFormDoctor data) {
        if (data.nome() != null)
            this.nome = data.nome();
        if (data.telefone() != null)
            this.telefone = data.telefone();
        if (data.endereco() != null)
            this.endereco.updateAddress(data.endereco());
    }

    public void desable() {
        this.ativo = false;
    }
}
