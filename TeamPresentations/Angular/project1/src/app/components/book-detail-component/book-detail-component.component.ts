import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-detail-component',
  templateUrl: './book-detail-component.component.html',
  styleUrls: ['./book-detail-component.component.css']
})
export class BookDetailComponentComponent implements OnInit {

  public books : any = [];

  constructor(private bookService: BookService) { }

  ngOnInit() {

    this.books = this.bookService.getBooks();
  }
}
