package controller;

import exception.ExcecaoRecursoNaoEncontrado;
import model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.SalaRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/v1")
public class SalaController {

    @Autowired
    private SalaRepository repositorioSala;

    @GetMapping(value="/salas")
    public List<Sala> obterTodasAsSalas() {
        return repositorioSala.findAll();
    }

    @GetMapping(value="/sala/{idSala}")
    public ResponseEntity<Object> obterPorId(@PathVariable(value="idSala") Long idSala) throws ExcecaoRecursoNaoEncontrado {

        Sala sala = repositorioSala.findById( idSala )
                .orElseThrow( () -> new ExcecaoRecursoNaoEncontrado( "Sala NÃO encontrada -> " + idSala ) );

        return ResponseEntity.ok().body( sala );
    }

    @PostMapping(value="/sala")
    public Sala criarSala( @RequestBody Sala sala ) {
        Sala novaSala = repositorioSala.save( sala );
        return novaSala;
    }

    @PutMapping(value="/sala/{idSala}")
    public ResponseEntity<Sala> atualizarDadosSala( @PathVariable(value="idSala") Long idSala, @RequestBody Sala sala ) throws ExcecaoRecursoNaoEncontrado {

        Sala salaExistente = repositorioSala.findById( idSala )
                .orElseThrow( () -> new ExcecaoRecursoNaoEncontrado( "Sala NÃO encontrada -> " + idSala ) );

        salaExistente.setNome( sala.getNome() );
        salaExistente.setDataHora( sala.getDataHora() );

        salaExistente = repositorioSala.save( salaExistente );

        return ResponseEntity.ok( salaExistente );
    }

    @DeleteMapping(value="/sala/{idSala}")
    public Map< String, Boolean > removerDadosSala( @PathVariable(value="idSala") Long idSala ) throws ExcecaoRecursoNaoEncontrado {

        Sala sala = repositorioSala.findById( idSala )
                .orElseThrow( () -> new ExcecaoRecursoNaoEncontrado( "Sala NÃO encontrada -> " + idSala ) );

        repositorioSala.deleteById( idSala );

        Map<String, Boolean> mapaResposta = new HashMap<>();
        mapaResposta.put( "Removido!", Boolean.TRUE );

        return mapaResposta;
    }

}
