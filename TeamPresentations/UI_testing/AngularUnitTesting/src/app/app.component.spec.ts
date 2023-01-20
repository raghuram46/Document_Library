import { TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
      
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'AngularUnitTesting'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('AngularUnitTesting');
  });

  

  // toBe vs to ToEqual
  it('ToBe vs to ToEqual',()=>{
    let a = 4;
    let b = [1, 2,3]
    expect(a).toBe(4)
    expect(a).toEqual(4)
    // expect(b).toBe([1,2,3])
    expect(b).toEqual([1,2,3])
    
    
  })

  it("verify the h1 element value", () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;

    let h2 = fixture.nativeElement.querySelector("h2")
    // fixture.detectChanges()
    expect(h2.textContent).toBe("Hello")

  })

  it("Increase count after clicking : ", () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;

    let button = fixture.debugElement.query(By.css(".increment"))
    let h1 = fixture.debugElement.query(By.css("#num"))
    button.triggerEventHandler('click', {}) // passing parameters as event type and event object
    fixture.detectChanges()
    expect(app.incrementDecrement.value).toEqual(1)
  
    expect(h1.nativeElement.textContent).toBe("1")
    

  })

});
