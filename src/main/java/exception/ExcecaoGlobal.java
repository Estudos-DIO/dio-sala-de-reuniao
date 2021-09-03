package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ExcecaoGlobal {

    public ExcecaoGlobal(Date date, String message, String description) {
    }

    @ExceptionHandler(ExcecaoRecursoNaoEncontrado.class)
    public ResponseEntity<?> recursoNaoEncontradoException(ExcecaoRecursoNaoEncontrado ex, WebRequest request) {
        DetalhesDoErro detalhesDoErro = new DetalhesDoErro( new Date(), ex.getMessage(), request.getDescription( false ) );
        return new ResponseEntity<>( detalhesDoErro, HttpStatus.NOT_FOUND );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> tratadorExcecaoGlobal( Exception ex, WebRequest request ) {
        DetalhesDoErro detalhesDoErro = new DetalhesDoErro( new Date(), ex.getMessage(), request.getDescription( false ) );
        return new ResponseEntity<>( detalhesDoErro, HttpStatus.INTERNAL_SERVER_ERROR );
    }

}
