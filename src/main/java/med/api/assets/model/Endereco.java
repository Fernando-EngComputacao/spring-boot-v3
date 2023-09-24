package med.api.assets.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;



    public Endereco(Endereco data) {
        this.logradouro = data.getLogradouro();
        this.bairro = data.getBairro();
        this.cep = data.getCep();
        this.cidade = data.getCidade();
        this.uf = data.getUf();
        this.complemento = data.getComplemento();
        this.numero = data.getNumero();
    }

    public void updateAddress(med.api.assets.dto.Endereco data) {
        if (data.logradouro() != null)
            this.logradouro = data.logradouro();
        if (data.bairro() != null)
            this.bairro = data.bairro();
        if (data.cep() != null)
            this.cep = data.cep();
        if (data.cidade() != null)
            this.cidade = data.cidade();
        if (data.uf() != null)
            this.uf = data.uf();
        if (data.complemento() != null)
            this.complemento = data.complemento();
        if (data.numero() != null)
            this.numero = data.numero();
    }
}
