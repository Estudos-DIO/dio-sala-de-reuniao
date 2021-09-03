package model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="SALA_REUNIAO")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private Timestamp dataHora;

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }

}
