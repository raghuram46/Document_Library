import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navigate',
  templateUrl: './navigate.component.html',
  styleUrls: ['./navigate.component.css']
})
export class NavigateComponent implements OnInit {

  constructor(private router: Router ) {}

  ngOnInit(): void {
  }

  goFirst() {
    this.router.navigate(['/', 'first']);
  }

  goSecond() {
    this.router.navigate(['/', 'second']);
  }

  goDirectives() {
    this.router.navigate(['/', 'directives']);
  }

  goPipes() {
    this.router.navigate(['/', 'pipes']);
  }

  goTemplateDrivenForms() {
    this.router.navigate(['/', 'templateDrivenForms']);
  }

  goReactiveForms() {
    this.router.navigate(['/', 'reactiveForms']);
  }

  goCommunication() {
    this.router.navigate(['/', 'communication']);
  }

}
