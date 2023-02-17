import { Component, OnInit } from '@angular/core';
import {Sign} from '../../sign';
import {SignService} from '../../sign.service';
import { Router } from '@angular/router';
import {Email} from '../../email';
import {EmailService} from '../../email.service';
@Component({
  selector: 'app-video',
  templateUrl: './video.component.html',
  styleUrls: ['./video.component.css']
})
export class VideoComponent implements OnInit {

  signup:Sign=new Sign();
  email:Email=new Email();
  message:string="Hello user ! kindly login using the OTP 1234";
  subject:string="ARM- login credentials";
  to!:string;
  // signval=document.getElementById("input3");

  setValue() 
  {
    console.log(this.signup);  
    this.saveEmployee();
  }
  constructor(private signservice:SignService,private emailservice:EmailService,
    private router: Router) { }

  ngOnInit(): void {
    
  }
  sendmail()
  {
    this.emailservice.createEmail(this.email).subscribe(data=>{
      console.log();
    });
  }
  saveEmployee(){
    this.signservice.createEmployee(this.signup).subscribe(data =>{
      console.log(data);
      this.sendmail();
      this.goToEmployeeList();
    });
  }
  goToEmployeeList(){
    this.router.navigate(['/otp']);
  }
}
