import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Sala } from '../sala';
import { SalaService } from '../sala.service';

@Component({
  selector: 'app-listar-sala',
  templateUrl: './listar-sala.component.html',
  styleUrls: ['./listar-sala.component.css']
})
export class ListarSalaComponent implements OnInit {

  salas : Observable<Sala[]>;

  constructor( private servicoSala : SalaService, private rota: Router ) {    
    this.salas = servicoSala.listarTodasAsSalas();
  }

  recarregarDados() {
    this.salas = this.servicoSala.listarTodasAsSalas();
  }

  ngOnInit() {
    this.recarregarDados();
  }

  removerSala( id: number ) {
    this.servicoSala.removerSala( id )
      .subscribe(
        data => {
          console.log( data );
          this.recarregarDados();
        },
        
        error => console.log( error ));
  }

  detalhesDaSala( id: number ){
    this.rota.navigate( ['details', id] );
  }

  atualizarSala( id: number ){
    this.rota.navigate( ['update', id] );
  }

}
