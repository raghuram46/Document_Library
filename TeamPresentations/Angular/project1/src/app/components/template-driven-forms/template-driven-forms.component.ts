import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-template-driven-forms',
  templateUrl: './template-driven-forms.component.html',
  styleUrls: ['./template-driven-forms.component.css']
})
export class TemplateDrivenFormsComponent implements OnInit {
  title="Template Driven Forms"

  // @ViewChild('bookForm')
  // bForm!: NgForm;

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(bookForm: NgForm){
    console.log(bookForm.value)
  }

}
