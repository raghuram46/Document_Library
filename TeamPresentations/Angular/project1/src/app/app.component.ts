import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'project1';

  myForm= new FormGroup({
    'Email': new FormControl(),
      'Password': new FormControl()
  });

  constructor(private router: Router){  
  }
  ngOnInit(): void {
  }

  onSubmit(){
    let email = this.myForm.value.Email;
  let password = this.myForm.value.Password;

  if (email != '' && password != ''){
    console.log(this.myForm.value)
    this.router.navigateByUrl('home');
  }   
  }
}
