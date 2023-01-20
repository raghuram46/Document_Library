import { Injectable } from '@angular/core';
import { LoggerService } from './logger.service';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private loggerService: LoggerService) { 
    this.loggerService.log("Book Service Constructed")
  }

  getBooks(){
    
    return  [
    {
      name: "Think and Grow Rich",
	publisher: "First Print",
      price: 359
    },
    {
      name: "Acers of Diamond",
	publisher: "Diamond",
      price: 200
    },
    {
      name: "Atomic Habits",
	publisher: "Penguine",
      price: 587
    },
    {
      name: "Power of Habit",
	publisher: "Penguine",
      price: 650
    },
    {
      name: "Option B",
	publisher: "Garuda",
      price: 350
    }
  ];

  }

}
