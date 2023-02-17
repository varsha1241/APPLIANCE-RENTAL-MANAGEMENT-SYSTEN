import { Component, OnInit } from '@angular/core';
import {Sign} from '../../sign';
import {SignService} from '../../sign.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  id!:any;
  email:string="";
  password:string="";
  signup!:Sign[];

  constructor(private signservice:SignService,
    private router: Router) { }
  ngOnInit(): void 
  {
  }
  onSubmit()
  {
    this.router.navigate(['/main']);  
  }

  successNotification() 
  {
    this.signservice.getAllProducts().subscribe(data => 
      {
      this.signup = data;
      for(let i=0;i<data.length;i++)
      {
        if(data[i].password===this.password && data[i].emailId==this.email)
        {
          // console.log(data[i]);
          // console.log(this.password);
          // console.log(this.email);
          const Id=data[i].loginId;
          sessionStorage.setItem('vendorId',Id);
          // console.log(sessionStorage.getItem('vendorId'));
          this.id=data[i].firstName+" "+data[i].lastName;
          Swal.fire('Hi '+this.id,'Logined succesfully !', 'success');
          this.onSubmit();
        } 
      }
    });
    Swal.fire('Hi', 'Login credentials failure !', 'error');
  }  
}
