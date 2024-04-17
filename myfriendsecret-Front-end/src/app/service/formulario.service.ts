import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Amigos } from '../formulario/amigos';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FormularioService {

  url: string = "http://localhost:8080/api"
  constructor(private http: HttpClient) { }

  save(amigo: Amigos): Observable<any> {
    return this.http.post<any>(`${this.url}/participantes`, amigo);
  }
}
