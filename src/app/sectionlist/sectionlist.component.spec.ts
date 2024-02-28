import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SectionlistComponent } from './sectionlist.component';

describe('SectionlistComponent', () => {
  let component: SectionlistComponent;
  let fixture: ComponentFixture<SectionlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SectionlistComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SectionlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
