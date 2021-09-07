import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AtualizarSalaComponent } from './atualizar-sala/atualizar-sala.component';
import { CriarSalaComponent } from './criar-sala/criar-sala.component';
import { DetalhesSalaComponent } from './detalhes-sala/detalhes-sala.component';
import { ListarSalaComponent } from './listar-sala/listar-sala.component';

const routes: Routes = [
  { path: '', redirectTo: 'salas', pathMatch: 'full' },
  { path: 'salas', component: ListarSalaComponent },
  { path: 'add', component: CriarSalaComponent },
  { path: 'update/:id', component: AtualizarSalaComponent },
  { path: 'details/:id', component: DetalhesSalaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
