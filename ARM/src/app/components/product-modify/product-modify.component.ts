import { Component, OnInit } from '@angular/core';
import { Products } from '../../products';
import { ProductService } from '../../products.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-product-modify',
  templateUrl: './product-modify.component.html',
  styleUrls: ['./product-modify.component.css']
})
export class ProductModifyComponent implements OnInit {
  id!: number;
  products:Products=new Products();
  prodid:number=this.products.productId;
  category:string=this.products.productCategory;
  constructor(private productService: ProductService,private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void 
  {
    this.id = this.route.snapshot.params['id'];
    console.log(this.id);
    this.productService.getProductsById(this.id).subscribe(data => 
      {
      this.products = data;
      console.log(data);
      console.log(this.products)
    },error => console.log(error));
  }
    onSubmit(){
      this.productService.updateEmployee(this.id, this.products).subscribe( data =>{
        console.log(data);
        this.goToEmployeeList();
      }
      , error => console.log(error));
    }
  
    goToEmployeeList(){
      console.log(this.products.vendorid);
      this.router.navigate(['/detail',this.products.vendorid]);
    }
  }

