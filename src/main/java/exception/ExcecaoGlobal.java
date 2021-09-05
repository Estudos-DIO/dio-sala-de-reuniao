package exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@SuppressWarnings({"unchecked","rawtypes"})
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ExcecaoGlobal extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value={ExcecaoRecursoNaoEncontrado.class})
    public ResponseEntity<Object> excecaoRecursoNaoEncontrado( ExcecaoRecursoNaoEncontrado ex, WebRequest request ) {
        DetalhesDoErro detalhesDoErro = new DetalhesDoErro( new Date(), ex.getMessage(), request.getDescription(false) );
        ResponseEntity<Object> resposta = new ResponseEntity<>( detalhesDoErro, HttpStatus.NOT_FOUND );
        return resposta;
    }

    @ExceptionHandler(value=Exception.class)
    public ResponseEntity<Object> excecaoRecursoNaoEncontrado( Exception ex, WebRequest request ) {
        DetalhesDoErro detalhesDoErro = new DetalhesDoErro( new Date(), ex.getMessage(), request.getDescription(false) );
        ResponseEntity<Object> resposta = new ResponseEntity<>( detalhesDoErro, HttpStatus.NOT_FOUND );
        return resposta;
    }

}
