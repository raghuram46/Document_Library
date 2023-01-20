import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  public bookName: string = '';
  public publisher: string = '';

  constructor() { }

  ngOnInit(): void {
  }

  bookEvent($event: any) {
    this.bookName = $event;
}

publishEvent($event: any) {
    this.publisher = $event;
}

}
