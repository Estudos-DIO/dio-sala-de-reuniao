import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Sala } from '../sala';
import { SalaService } from '../sala.service';

@Component({
  selector: 'app-atualizar-sala',
  templateUrl: './atualizar-sala.component.html',
  styleUrls: ['./atualizar-sala.component.css']
})
export class AtualizarSalaComponent implements OnInit {
  
  id!: number;
  sala!: Sala;
  enviado = false;

  constructor(private rota: ActivatedRoute, private router: Router,
    private servicoSala: SalaService) { }

  ngOnInit() {
    this.sala = new Sala();
    this.id = this.rota.snapshot.params['id'];
    
    this.servicoSala.obterSala( this.id )
      .subscribe( data => {
                            console.log( data )
                            this.sala = data;
                          }, 
                  error => console.log( error ) 
                );
  }

  atualizarSala() {
    this.servicoSala.atualizarSala( this.id, this.sala )
      .subscribe( data => console.log( data ), 
                  error => console.log( error ) );

    this.sala = new Sala();
    this.irParaLista();
  }

  onSubmit() {
    this.atualizarSala();
  }

  irParaLista() {
    this.router.navigate( ['/salas'] );
  }

}
