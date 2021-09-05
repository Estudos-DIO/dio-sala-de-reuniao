package exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class DetalhesDoErro {

    private Date timestamp;
    private String mensagem;
    private String detalhes;

    public DetalhesDoErro() {
        super();
    }

    public DetalhesDoErro(Date timestamp, String mensagem, String detalhes) {
        super();
        this.timestamp = timestamp;
        this.mensagem = mensagem;
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "DetalhesDoErro [" +
                "timestamp='" + timestamp + "'" +
                ", mensagem='" + mensagem + "'" +
                ", detalhes='" + detalhes + " ]";
    }
}
