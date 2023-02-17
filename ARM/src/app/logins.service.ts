import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import {Logins} from './logins';
import {Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private baseURL = "http://localhost:8088/api/v1/login";

  constructor(private httpClient: HttpClient) { }

  createEmployee(logins: Logins): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, logins);
  } 
  getProdById(id: number): Observable<Logins>{
    return this.httpClient.get<Logins>(`${this.baseURL}/${id}`);
  } 
  
}
