import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import AccountService from './shared/accountservice';

Vue.config.productionTip = false;

const accountService = new AccountService(store, router);

new Vue({
  router,
  store,
  provide: {
    accountService: () => accountService
  },
  render: h => h(App)
}).$mount("#app");
