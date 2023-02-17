import { Component, OnInit } from '@angular/core';
import { Products } from '../../products';
import { ProductService } from '../../products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products:Products=new Products();
  a=sessionStorage.getItem("vendorId");
  constructor(private productservice:ProductService,
    private router: Router) {
      console.log(this.products);
     }

  ngOnInit(): void 
  {
   console.log("vendor id : "+sessionStorage.getItem('vendorId'));
  }
  
  saveEmployee(){
    this.productservice.createEmployee(this.products).subscribe(data =>{
      console.log(data);
      this.goToEmployeeList();
    });
  }
  goToEmployeeList(){
    this.router.navigate(['/signup']);
  }
  
  onSubmit()
  {
    console.log(this.products.vendorid);  
   // this.products.vendorid=sessionStorage.getItem("vendorId");
    console.log(sessionStorage.getItem("vendorId"));
    this.saveEmployee();
  }
}
