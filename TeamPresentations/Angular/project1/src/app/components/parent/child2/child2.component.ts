import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component implements OnInit {
  bookName: string = "";
  publisher: string = "";

  constructor() { }

  ngOnInit(): void {
  }

  @Output() bookEvent = new EventEmitter<string>();
  @Output() publishEvent = new EventEmitter<string>();

  	onBookChange() {
    		this.bookEvent.emit(this.bookName);
  	}

  	onPublisherChange() {
    		this.publishEvent.emit(this.publisher);
  	}

}
