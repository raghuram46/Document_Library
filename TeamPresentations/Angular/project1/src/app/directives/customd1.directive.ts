import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCustomd1]'
})
export class Customd1Directive {

  constructor(el: ElementRef) { 
    el.nativeElement.style.backgroundColor = 'yellow';
  }

}
