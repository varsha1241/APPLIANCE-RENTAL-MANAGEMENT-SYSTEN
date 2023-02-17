import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import {Products} from './products';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseURL = "http://localhost:8088/api/v1/product";

  constructor(private httpClient: HttpClient,private router: Router) { }

  getEmployeesList(): Observable<Products[]>{
    return this.httpClient.get<Products[]>(`${this.baseURL}`);
  }
  createEmployee(products: Products): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, products);
  }
  getProdById(id: number): Observable<Products>{
    return this.httpClient.get<Products>(`${this.baseURL}/${id}`);
  } 
  getProductsById(id: number): Observable<Products>{
    return this.httpClient.get<Products>(`${this.baseURL}/pro/${id}`);
  }
  updateEmployee(id: number, products: Products): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, products);
  }
  deleteEmployee(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

}
