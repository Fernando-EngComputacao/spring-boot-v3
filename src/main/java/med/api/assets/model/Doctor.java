package med.api.assets.model;

import jakarta.persistence.*;
import lombok.*;
import med.api.assets.dto.InputFormDoctor;
import med.api.assets.dto.details.Especialidade;

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
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Doctor(InputFormDoctor form) {
        this.nome = form.nome();
        this.crm = form.crm();
        this.email = form.email();
        this.especialidade = form.especialidade();
        this.endereco = new Endereco(form.endereco());

    }
}
