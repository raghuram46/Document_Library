import { Component } from '@angular/core';
import { IncrementDecrementService } from './service/increment-decrement.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularUnitTesting';

  constructor(public incrementDecrement:IncrementDecrementService){}

  increment() {
    this.incrementDecrement.increment();
  }

  decrement() {
    this.incrementDecrement.decrement();
  }
}
