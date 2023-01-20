import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  books: any[] = [
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

  bookByPublisher: any[] = [
    {
      'publisher': 'Diamond',
      'books': [
        {
          "name": "Acers of Diamond"
        },
        {
          "name": "Acers of Land"
        },
      ]
    },
    {
      'publisher': 'Penguine',
      'books': [
        {
          "name": "Atomic Habits"
        },
        {
          "name": "Power of Habit"
        }
        
      ]
    },
    {
	    'publisher': 'Finger Print',
	    'books': [
		    {
          "name": "Power of Habits"
        },
        {
          "name": "Cook  Tyson"
        }
	      ]
    }

  ];

  constructor() { }

  ngOnInit(): void {
  }

  getColor(publisher: string) { 
    switch (publisher) {
      case 'Penguine':
        return 'green';
      case 'Garuda':
        return 'blue';
      case 'Diamond':
        return 'red';
      case 'First Print':
        return 'aqua';
      default:
        return 'black';
    }
  }

}
