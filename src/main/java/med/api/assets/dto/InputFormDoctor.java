package med.api.assets.dto;

import med.api.assets.dto.details.Especialidade;

public record InputFormDoctor(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        Endereco endereco
) {
}
