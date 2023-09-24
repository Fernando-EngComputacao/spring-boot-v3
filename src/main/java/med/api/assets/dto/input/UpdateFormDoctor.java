package med.api.assets.dto.input;

import jakarta.validation.constraints.NotNull;
import med.api.assets.dto.Endereco;

public record UpdateFormDoctor(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco
) {
}
