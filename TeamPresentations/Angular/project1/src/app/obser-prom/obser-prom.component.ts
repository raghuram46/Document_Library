import { Component, OnDestroy, OnInit } from '@angular/core';
import { filter, observable, Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-obser-prom',
  templateUrl: './obser-prom.component.html',
  styleUrls: ['./obser-prom.component.css']
})
export class ObserPromComponent implements OnInit {
private mySubsription:any;

  constructor() { }

  ngOnInit() {
    //creating promise
    const promise = new Promise(resolve=> {
      console.log('promise call...........')
      setTimeout(()=>{                    //like api call takes certain time so here we used timeout 
        resolve('promsie is working'); //resolve is used to return something from promise
        resolve('promise 2')
      },1000);
    });

    // promise.then(result => console.log(result));  //listening to promise is done by using then


    //observable
    const observable = new Observable(sub => {
      console.log('observable call...........')
      // let counter = 0;
      setTimeout(()=>{
        sub.next('Observable is working');
        sub.next('Observable is working1');
        sub.next('Observable is working2');

      },1000);
    });
    // setInterval(()=>{
    //     counter = counter +1;
    //     sub.next(counter);

    //   },1000);
    // });
    // observables acts as array so we can apply operators on the data i.e from rxjx lib
    observable.subscribe(result=> console.log(result));

  // observable.subscribe(result=> console.log(result));
  // this.mySubsription= observable.subscribe(result=> console.log('subscriber count'+result));
    
  }
  // ngOnDestroy() {
  //   this.mySubsription.unsubscribe();
  // }


  
}
