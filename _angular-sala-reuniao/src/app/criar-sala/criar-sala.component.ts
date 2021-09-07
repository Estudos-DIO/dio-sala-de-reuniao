import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Sala } from '../sala';
import { SalaService } from '../sala.service';

@Component({
  selector: 'app-criar-sala',
  templateUrl: './criar-sala.component.html',
  styleUrls: ['./criar-sala.component.css']
})
export class CriarSalaComponent implements OnInit {

  sala: Sala = new Sala();
  enviado = false;

  constructor( private servicoSala : SalaService, private rota : Router ) {  
  }

  ngOnInit() {
  }

  novaSala(): void {
    this.enviado = false;
    this.sala = new Sala();
  }

  salvar() {
    this.servicoSala.criarSala( this.sala )
      .subscribe( data => console.log( data ),
                  error => console.log( error ) );

    this.sala = new Sala();
    this.irParaLista();
  }

  onSubmit() {
    this.enviado = true;
    this.salvar();
  }

  irParaLista() {
    this.rota.navigate( ['/salas'] );
  }

}
