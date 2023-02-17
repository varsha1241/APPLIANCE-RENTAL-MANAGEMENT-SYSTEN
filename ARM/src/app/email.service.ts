import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs';
import {Email} from './email';
@Injectable({
  providedIn: 'root'
})
export class EmailService {

  private baseURL = "http://localhost:8089/api/v1/email";

  constructor(private httpClient: HttpClient) { }

  createEmail(sign: Email): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, sign);
  } 
}
