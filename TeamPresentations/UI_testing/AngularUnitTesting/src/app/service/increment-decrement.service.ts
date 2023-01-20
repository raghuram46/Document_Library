import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class IncrementDecrementService {

  value:number = 0
  message:string = ""

  constructor() { }

  increment(){
    if(this.value < 15 ){
      this.value += 1
      this.message = ""
    }
    else{
      this.message = "Value reached maximum"
    }
  }

  decrement(){
    if(this.value > 0 ){
      this.value -= 1
      this.message = ""
    }
    else{
      this.message = "Value reached minimum"
    }
  }
}
