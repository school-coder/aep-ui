<template>

  <div id="app">
    

    <nav id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">API Hackathon</router-link>
    </nav>
    
    <router-view />

    <footer>
      &copy; Software AG, 2019.
    </footer>
  </div>
</template>

<style lang="scss">

@import '../node_modules/bootstrap/scss/bootstrap.scss';

nav {
  position: fixed;
  top: 0;
  height: 50px;
  width: 100%;
  background-color: $blue;
}

footer {
  position: fixed;
  bottom: 0;
}
</style>
