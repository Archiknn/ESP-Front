import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AspirantedatosComponent } from './aspirantedatos.component';

describe('AspirantedatosComponent', () => {
  let component: AspirantedatosComponent;
  let fixture: ComponentFixture<AspirantedatosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AspirantedatosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AspirantedatosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});