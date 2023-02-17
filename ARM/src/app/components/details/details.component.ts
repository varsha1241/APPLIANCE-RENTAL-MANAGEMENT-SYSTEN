import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../products.service';
import { Router, ActivatedRoute } from '@angular/router';
import {Products} from '../../products';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  id!: number;
  products!: Products;
  product!: any;
  constructor(private productService: ProductService,
    private route: ActivatedRoute, private router:Router ) { }

  
    ngOnInit(): void {
      this.id = this.route.snapshot.params['id'];   
      this.productService.getProdById(this.id).subscribe( data => {
        this.product = data;
        console.log(this.product);
       console.log("Products : "+this.product);
      });
    }

  private getEmployees(){
    this.productService.getEmployeesList().subscribe(data => {
      this.product = data;
      this.navigate();
    });
  }
  successNotification(id:number) {
    Swal.fire('Hi', 'The product is deleted !', 'success');
    this.deleteEmployee(id);
    console.log(id);
  }
    deleteEmployee(id: number){
    this.productService.deleteEmployee(id).subscribe( data => {
      console.log(data);
      this.getEmployees();
    });
  }
  navigate()
  {
    
    this.router.navigate(['/home']);
  }
  onclick(id:number)
  {
    this.router.navigate(['/promod',id]);
  }  
}
