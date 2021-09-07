import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Sala } from '../sala';
import { SalaService } from '../sala.service';

@Component({
  selector: 'app-detalhes-sala',
  templateUrl: './detalhes-sala.component.html',
  styleUrls: ['./detalhes-sala.component.css']
})
export class DetalhesSalaComponent implements OnInit {

  id!: number;
  sala!: Sala;

  constructor( private ativarRota: ActivatedRoute, private rota: Router, private servicoSala: SalaService ) { 
  }

  ngOnInit() {
    this.sala = new Sala();
  
    this.id = this.ativarRota.snapshot.params['id'];
      
    this.servicoSala.obterSala( this.id )
      .subscribe( data => { console.log( data )
                            this.sala = data;
                          }, 
                  error => console.log( error )
                );
  }
  
  listar(){
    this.rota.navigate(['salas']);
  }

}
