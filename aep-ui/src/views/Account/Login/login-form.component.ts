import axios from 'axios';
import { Component,  Vue } from 'vue-property-decorator';
@Component
export default class LoginForm extends Vue {
  public username = null;
  public password = null;
  public name = null;
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

      })
      .catch(() => {
      });
  }

  public getUsername(): void {
    axios.get('api/account').then(response => {
      const data =   response.data;
      console.log(data);
    })
  }
}