import axios from 'axios';
import { Store } from 'vuex';
import VueRouter from 'vue-router';

export default class AccountService {
  constructor(private store: Store<any>, private router: VueRouter) {
    this.init();
  }

  public init(): void {
      this.retrieveAccount();
  }

  public retrieveAccount(): void {
    axios.get('api/account').then(response => {
      const data = response.data;
      this.store.dispatch('setCurrentUser', data)
      this.router.push('/');
      console.log(data);
    }).catch(() => {
      console.log('not authenticated')
    });
  }

}