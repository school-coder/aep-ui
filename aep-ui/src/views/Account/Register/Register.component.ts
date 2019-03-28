import axios from 'axios';
import { Component, Vue } from 'vue-property-decorator';
import { User } from '@/shared/model/user.model';
@Component
export default class LoginForm extends Vue {
  public user ?: User = new User();

  public doSaveUser(): void {
   
    console.log(JSON.stringify(this.user));
    axios
      .post('api/users', this.user, {
        headers: {
          'Content-Type': 'application/json'
        }
      })
      .then(() => {

      })
      .catch(() => {
      });
  }

}