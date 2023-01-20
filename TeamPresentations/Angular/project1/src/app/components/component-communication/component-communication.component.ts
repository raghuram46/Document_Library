import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-component-communication',
  templateUrl: './component-communication.component.html',
  styleUrls: ['./component-communication.component.css']
})
export class ComponentCommunicationComponent implements OnInit, OnChanges {
  @Input() count: number;

  constructor() { 
    this.count= 0;
  }

  ngOnChanges(changes: SimpleChanges): void {
    for (let property in changes) {
      if (property === 'count') {
        console.log('Previous:', changes[property].previousValue);
        console.log('Current:', changes[property].currentValue);
        console.log('firstChange:', changes[property].firstChange);
      } 
  }
  }

  ngOnInit(): void {
  }

}
