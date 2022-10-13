import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipdemoComponent } from './pipdemo.component';

describe('PipdemoComponent', () => {
  let component: PipdemoComponent;
  let fixture: ComponentFixture<PipdemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PipdemoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PipdemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
