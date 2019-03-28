<template>
  <div id="app">
    <Header />
    
    <router-view />

    <Footer />
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
export default {
  components:{
    Header, Footer
  }
}
</script>


<style lang="scss">

@import '../node_modules/bootstrap/scss/bootstrap.scss';
@import '@/assets/scss/style.scss';
footer {
  position: fixed;
  bottom: 0;
  color: $blue;
}
</style>