<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <h3>{{userName}}</h3>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String
  },
  data: function () {
    return {
      currenwtUser: {}
    }
  },
  computed:{
     userName () {
      return this.$store.state.account.currentAccount.firstName;
    }
  },
  created () {
    this.currenwtUser = this.$store.state.account.currentAccount;
  },
  watch: {
    isAuthenticated: function (newValue, oldValue) {
      if (newValue) {

      }
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
