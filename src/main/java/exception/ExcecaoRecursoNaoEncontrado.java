package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ExcecaoRecursoNaoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 3303881552042623952L;

    private String message;

    public ExcecaoRecursoNaoEncontrado( String mensagem ) {
        super( mensagem );
        this.message = mensagem;
    }

    public ExcecaoRecursoNaoEncontrado( String message, Throwable cause ) {
        super( message, cause );
        this.message = message;
    }

}
