import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AspirantedatosComponent } from './aspirantedatos/aspirantedatos.component';
import { RouterModule, Routes } from '@angular/router';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ButtonModule} from 'primeng/button';
import {MatAutocompleteModule,
    MatBadgeModule,
    MatBottomSheetModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatCardModule,
    MatCheckboxModule,
    MatChipsModule,
    MatDatepickerModule,
    MatDialogModule,
    MatDividerModule,
    MatExpansionModule,
    MatGridListModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatNativeDateModule,
    MatPaginatorModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    MatRadioModule,
    MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatSnackBarModule,
    MatSortModule,
    MatStepperModule,
    MatTableModule,
    MatTabsModule,
    MatToolbarModule,
    MatTooltipModule,
    MatTreeModule} from '@angular/material';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

const appRoutes: Routes = [

    {path: '', component: AppComponent},
    {path: 'aspirantedatos', component: AspirantedatosComponent}

    ];

@NgModule({
  declarations: [
    AppComponent,
    AspirantedatosComponent
  ],
  imports: [
    BrowserModule,
      RouterModule.forRoot(appRoutes),
      MatTabsModule,
      BrowserAnimationsModule,
      MatButtonModule,
      MatCheckboxModule,
      MatSelectModule,
      FormsModule,
      HttpClientModule,
      MatNativeDateModule,
      ReactiveFormsModule,
      MatDatepickerModule,
      ButtonModule,
      MatRadioModule,
      MatStepperModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
