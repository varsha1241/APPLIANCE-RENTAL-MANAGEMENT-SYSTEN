import { Component, OnInit } from '@angular/core';
import { Products } from '../../products';
import { ProductService } from '../../products.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  id!:number;
  vendor:any=sessionStorage.getItem('vendorId');
  constructor(private productService: ProductService,
    private router: Router) { }

    ngOnInit(): void {
      
    } 
    employeeDetails()
    {
      var id:number=this.id;
      console.log(this.vendor);
      console.log(this.id);
      if(id==this.vendor)
      {
       this.router.navigate(['/detail',id]);
      }
      else
      {
        Swal.fire("Vendor ID doesn't match");
      }
    }
  
}
