import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './components/first/first.component';
import { SecondComponent } from './components/second/second.component';
import { DirectivesComponent } from './components/directives/directives.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { TemplateDrivenFormsComponent } from './components/template-driven-forms/template-driven-forms.component';
import { ReactiveFormsComponent } from './components/reactive-forms/reactive-forms.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ErrorComponent } from './components/error/error.component';
import { ComponentCommunicationComponent } from './components/component-communication/component-communication.component';
import { NavigateComponent } from './components/navigate/navigate.component';
import { HomeComponent } from './components/home/home.component';
import { ParentComponent } from './components/parent/parent.component';
import { Child1Component } from './components/parent/child1/child1.component';
import { Child2Component } from './components/parent/child2/child2.component';
import { Customd1Directive } from './directives/customd1.directive';
import { HooksComponent } from './components/hooks/hooks.component';
import { BookListComponentComponent } from './components/book-list-component/book-list-component.component';
import { BookDetailComponentComponent } from './components/book-detail-component/book-detail-component.component';
import { BookService } from './services/book.service';
import { LoggerService } from './services/logger.service';
import { ObservablesComponent } from './components/observables/observables.component';
import { ObserPromComponent } from './obser-prom/obser-prom.component';
import { SubjectComponent } from './subject/subject.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    DirectivesComponent,
    PipesComponent,
    ComponentCommunicationComponent,
    TemplateDrivenFormsComponent,
    ReactiveFormsComponent,
    ErrorComponent,
    NavigateComponent,
    HomeComponent,
    ParentComponent,
    Child1Component,
    Child2Component,
    Customd1Directive,
    HooksComponent,
    BookListComponentComponent,
    BookDetailComponentComponent,
    ObservablesComponent,
    ObserPromComponent,
    SubjectComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  schemas: [NO_ERRORS_SCHEMA],
  providers: [BookService, LoggerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
