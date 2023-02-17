import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { ProductComponent } from './components/product/product.component';
import { VideoComponent } from './components/video/video.component';
import { DetailsComponent } from './components/details/details.component';
import { HomeComponent } from './components/home/home.component';
import { MainpageComponent } from './components/mainpage/mainpage.component';
import { ProductModifyComponent } from './components/product-modify/product-modify.component';
import { OtpComponent } from './components/otp/otp.component';
import { LogoutComponent } from './components/logout/logout.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'product',component:ProductComponent},
  {path:'Video',component:VideoComponent},
  {path:'detail/:id',component:DetailsComponent},
  {path:'home',component:HomeComponent},
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path:'main',component:MainpageComponent},
  {path:'promod/:id',component:ProductModifyComponent},
  {path:'otp',component:OtpComponent},
  {path:'logout',component:LogoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
