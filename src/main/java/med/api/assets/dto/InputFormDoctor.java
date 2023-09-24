package med.api.assets.dto;

import lombok.Getter;
import med.api.assets.dto.details.Especialidade;
import med.api.assets.model.Endereco;

public record InputFormDoctor(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
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
