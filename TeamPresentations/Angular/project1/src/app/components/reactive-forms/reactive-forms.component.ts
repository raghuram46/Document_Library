import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  templateUrl: './reactive-forms.component.html',
  styleUrls: ['./reactive-forms.component.css']
})
export class ReactiveFormsComponent implements OnInit {

  title = "Reactive Forms"

  bookForm = new FormGroup({
    bookName: new FormControl(),
    authorName: new FormControl(),
    bookPrice: new FormControl(),
    publisher: new FormControl(),
    genre: new FormControl(),
    publisher_contact: new FormGroup({
      city: new FormControl(),
      phone: new FormControl(),
      email: new FormControl()
    })

  });

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.bookForm.value)
  }

}
