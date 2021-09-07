import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CriarSalaComponent } from './criar-sala/criar-sala.component';
import { ListarSalaComponent } from './listar-sala/listar-sala.component';
import { AtualizarSalaComponent } from './atualizar-sala/atualizar-sala.component';
import { DetalhesSalaComponent } from './detalhes-sala/detalhes-sala.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CriarSalaComponent,
    ListarSalaComponent,
    AtualizarSalaComponent,
    DetalhesSalaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
