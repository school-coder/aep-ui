<template>
  <div class="row">
    <div class="offset-1 col-8">
      <form v-on:submit.prevent="doSaveUser()">
        
        <div class="form-group">
          <label>Username</label>
          <input v-model="user.login" class="form-control" placeholder="Username">
        </div>
         <div class="form-group">
          <label >FirstName</label>
          <input v-model="user.firstName" class="form-control" placeholder="First Name">
        </div>
         <div class="form-group">
          <label >LastName</label>
          <input v-model="user.lastName" class="form-control" placeholder="Last Name">
        </div>
         <div class="form-group">
          <label >Email</label>
          <input v-model="user.email" class="form-control" placeholder="Email">
        </div>
        <div class="form-group">
          <label >Password</label>
          <input v-model="user.password" class="form-control" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary">Log in</button>
      </form>
    </div>
    
  </div>
</template>
<script lang="ts" src="./Register.component.ts">
