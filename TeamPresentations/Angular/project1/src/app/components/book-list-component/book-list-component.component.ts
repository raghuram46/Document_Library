import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';
import { LoggerService } from 'src/app/services/logger.service';

@Component({
  selector: 'app-book-list-component',
  templateUrl: './book-list-component.component.html',
  styleUrls: ['./book-list-component.component.css']
})
export class BookListComponentComponent implements OnInit {

  public books : any = [];


  constructor(private bookService : BookService, private loggerService: LoggerService) {
    
   }

  
  ngOnInit() {

    this.books = this.bookService.getBooks();
    this.loggerService.log(this.books);
  }
}
