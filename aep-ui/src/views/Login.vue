<template>
<div>
  <input v-model="username" placeholder="Username">
  <input v-model="password" placeholder="Password">
  <button @click="doLogin" >Login</button>
  <button @click="getUsername">Get UserName</button>
  <p>{{name}}</p>
</div>
</template>
<script lang="ts" src="./login-form.component.ts">

