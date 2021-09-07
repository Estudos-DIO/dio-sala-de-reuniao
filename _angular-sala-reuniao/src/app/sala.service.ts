import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SalaService {

  private urlBase = 'http://localhost:8080/api/v1/sala';

  constructor( private http : HttpClient ) { 
  }

  obterSala( id: number ): Observable<any> {
    return this.http.get( `${this.urlBase}/${id}` );
  }

  criarSala( sala: Object ): Observable<Object> {
    return this.http.post( `${this.urlBase}`, sala );
  }

  atualizarSala( id: number, valor: any): Observable<Object> {
    return this.http.put( `${this.urlBase}/${id}`, valor );
  }

  removerSala( id: number ): Observable<any> {
    return this.http.delete( `${this.urlBase}/${id}`, { responseType: 'text' } );
  }

  listarTodasAsSalas(): Observable<any> {
    return this.http.get( `${this.urlBase}s` );
  }

}
