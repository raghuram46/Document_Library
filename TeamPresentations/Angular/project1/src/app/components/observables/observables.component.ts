import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit {

  myObservable = new Observable(observer => {
    setTimeout(() => {
      observer.next('Started Reading')
    }, 2000);
    setTimeout(() => {
      observer.next('Still Reading1');
    }, 4000);
    // setTimeout(() =>{
    //   observer.error(new Error('Pages missing in the book can\'t read any more'));
    // }, 6000);
    setTimeout(() => {
      observer.next('Still Reading2');
    }, 6000);
    setTimeout(() =>{
      observer.complete();
    }, 6000);
    setTimeout(() => {
      observer.next('Still Reading3');
    }, 8000);
    

  })
  bookStatus: any;

  constructor() { }

  ngOnInit(): void {
    this.myObservable.subscribe(val => {
      this.bookStatus = val;
    },
    (error) => {
      alert(error.message);
    },
    () => {
      alert('Book reading completed');
    })
    
  }

}
