import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MensajeestadoComponent } from './mensajeestado.component';

describe('MensajeestadoComponent', () => {
  let component: MensajeestadoComponent;
  let fixture: ComponentFixture<MensajeestadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MensajeestadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MensajeestadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
