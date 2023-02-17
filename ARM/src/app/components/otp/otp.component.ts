import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-otp',
  templateUrl: './otp.component.html',
  styleUrls: ['./otp.component.css']
})
export class OtpComponent implements OnInit {

  successNotification() {
    Swal.fire('Hi', 'The account is verified !', 'success');
    this.setValue();
  }
  setValue() 
  {

    this.router.navigate(['/login']);
  }
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
