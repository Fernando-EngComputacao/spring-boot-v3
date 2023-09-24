package med.api.assets.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.api.assets.dto.details.Especialidade;
import med.api.assets.model.Endereco;

public record InputFormDoctor(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid
        Endereco endereco
) {
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String crm() {
        return crm;
    }

    @Override
    public Especialidade especialidade() {
        return especialidade;
    }

    @Override
    public Endereco endereco() {
        return endereco;
    }
}
