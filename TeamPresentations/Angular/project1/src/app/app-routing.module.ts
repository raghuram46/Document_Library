import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Subject } from 'rxjs';
import { BookDetailComponentComponent } from './components/book-detail-component/book-detail-component.component';
import { BookListComponentComponent } from './components/book-list-component/book-list-component.component';
import { DirectivesComponent } from './components/directives/directives.component';
import { ErrorComponent } from './components/error/error.component';
import { FirstComponent } from './components/first/first.component';
import { HomeComponent } from './components/home/home.component';
import { HooksComponent } from './components/hooks/hooks.component';
import { ObservablesComponent } from './components/observables/observables.component';
import { ParentComponent } from './components/parent/parent.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { ReactiveFormsComponent } from './components/reactive-forms/reactive-forms.component';
import { SecondComponent } from './components/second/second.component';
import { TemplateDrivenFormsComponent } from './components/template-driven-forms/template-driven-forms.component';
import { ObserPromComponent } from './obser-prom/obser-prom.component';
import { SubjectComponent } from './subject/subject.component';

const routes: Routes = [
  { path: '',   redirectTo: 'home', pathMatch: 'full' },
  {   path: 'home',   component: HomeComponent   },
  {   path: 'first',   component: FirstComponent   },
  {   path: 'second',   component: SecondComponent   },
  {   path: 'directives',   component: DirectivesComponent   },
  {   path: 'pipes',   component: PipesComponent   },
  {   path: 'templateDrivenForms',   component: TemplateDrivenFormsComponent  },
  {   path: 'reactiveForms',   component: ReactiveFormsComponent   },
  {   path: 'parent',   component: ParentComponent   },
  {   path: 'hooks',   component: HooksComponent   },
  {   path: 'booksList',   component: BookListComponentComponent   },
  {   path: 'bookDetails',   component: BookDetailComponentComponent   },
  {   path: 'observables',   component: ObservablesComponent   },
  {path:'obserprom',component:ObserPromComponent},
  {path:'subject',component:SubjectComponent},
  {   path: '**',   component: ErrorComponent   }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
