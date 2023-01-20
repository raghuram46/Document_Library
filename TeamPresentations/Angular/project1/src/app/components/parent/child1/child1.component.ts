import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component implements OnInit, OnChanges {
  @Input() parentsBookName = '';
  @Input() parentsBookPublisher = '';

  constructor() { }
  ngOnChanges(): void {
    console.log("onChanges called when @Input() property changes")
  }

  ngOnInit(): void {
    console.log(this.parentsBookName)
  }



}
