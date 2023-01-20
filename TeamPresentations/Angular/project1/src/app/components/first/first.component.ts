import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  title = "Hello world";
  clickme = true;

  constructor() { 
    setTimeout(() => {
      this.clickme = false;
    }, 5000);
  }

  ngOnInit(): void {
  }

  changeTitle(){
    this.title = "Lunch Break";
  }

}
