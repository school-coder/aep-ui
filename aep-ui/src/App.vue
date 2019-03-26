<template>
  <div id="app">
    <Header />
    
    <router-view />

    <footer>
      &copy; Software AG, 2019.
    </footer>
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
export default {
  components:{
    Header
  }
}
</script>


<style lang="scss">

@import '@/assets/theme.scss';
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
