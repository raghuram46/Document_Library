import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObserPromComponent } from './obser-prom.component';

describe('ObserPromComponent', () => {
  let component: ObserPromComponent;
  let fixture: ComponentFixture<ObserPromComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObserPromComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObserPromComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
