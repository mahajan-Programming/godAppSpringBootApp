import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BucketlistComponent } from './bucketlist/bucketlist.component';
import { ContentlistComponent } from './contentlist/contentlist.component';
import { BucketService } from './bucketlist/bucket.service';
import { HttpService } from './services/http.service';
import { HttpClientModule } from '@angular/common/http';
import { SectionlistComponent } from './sectionlist/sectionlist.component';
import {MatCardModule} from '@angular/material/card';
import { UsersComponent } from './users/users.component';
import { NavbarComponent } from './header/navbar/navbar.component';
import { AddUserComponent } from './users/add-user/add-user/add-user.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    BucketlistComponent,
    ContentlistComponent,
    SectionlistComponent,
    UsersComponent,
    NavbarComponent,
    AddUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatCardModule,
    FormsModule
  ],
  providers: [BucketService, HttpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
