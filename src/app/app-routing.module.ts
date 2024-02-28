import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BucketlistComponent } from './bucketlist/bucketlist.component';
import { ContentlistComponent } from './contentlist/contentlist.component';
import { SectionlistComponent } from './sectionlist/sectionlist.component';
import { UsersComponent } from './users/users.component';
import { AddUserComponent } from './users/add-user/add-user/add-user.component';

const routes: Routes = [
  {path: 'pothi/buckets/:userId', component :BucketlistComponent},
  {path: 'pothi/contents/:sectionId', component :ContentlistComponent},
  {path: 'pothi/users', component :UsersComponent},
  {path: 'pothi/sections/:bucketId', component :SectionlistComponent},
  {path: 'pothi/add-users', component :AddUserComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
