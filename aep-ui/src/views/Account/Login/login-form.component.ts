import axios from 'axios';
import { Component,  Vue, Inject } from 'vue-property-decorator';
import AccountService from '@/shared/accountservice';
@Component
export default class LoginForm extends Vue {
  @Inject('accountService')
  private accountService: () => AccountService;
  public username = null;
  public password = null;
  public name?: string = '';
  public number = this.$store.state.account.count || 0;
  public doLogin(): void {
    const data = {
      "username": this.username,
      "password": this.password
    }
    axios
      .post('auth/login', data, {
        headers: {
          'Content-Type': 'application/json'
        }
      })
      .then(() => {
        this.getUsername()
      })
      .catch(() => {
      });
  }

  public getUsername(): void {
    this.accountService().retrieveAccount();
  }
}