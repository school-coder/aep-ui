<template>
  <div class="row">
    <div class="offset-1 col-8">
      <form v-on:submit.prevent="doLogin()">
        <div class="form-group">
          <label for="exampleInputEmail1">Username</label>
          <input v-model="username" class="form-control" placeholder="Username">
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input v-model="password" class="form-control" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary">Log in</button>
      </form>
    </div>
    <button @click="getUsername">Get UserName</button>
    <p>{{name}}</p>
  </div>
</template>
<script lang="ts" src="./login-form.component.ts">
