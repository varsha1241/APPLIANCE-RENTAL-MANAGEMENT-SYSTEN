import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import {Sign} from './sign';
import {Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SignService {

  private baseURL = "http://localhost:8088/api/v1/signup";

  constructor(private httpClient: HttpClient) { }

  createEmployee(sign: Sign): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, sign);
  } 
  getAllProducts(): Observable<Sign[]>{
    return this.httpClient.get<Sign[]>(`${this.baseURL}`);
  }
}
