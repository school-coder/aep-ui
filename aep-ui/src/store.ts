import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

const moduleA = {
    state: {
        currentAccount: {firstName:'guest'},
        isAuthenticated: false
    },
    mutations: {
        setUser(state, user) {
            state.currentAccount = user;
            state.isAuthenticated = true;
        }
    },

    actions: {
        setCurrentUser({commit}, account) {
            // do something async
            commit('setUser', account)
        }
    }
}


export default new Vuex.Store({
    modules: {
        account: moduleA
    },
    state: {
        currentAccount: {}
    },
    mutations: {
        setUser(state, user) {
            state.currentAccount = user;
        }
    },
    actions: {
        setCurrentUser({commit}, account) {
            // do something async
            commit('setUser', account)
        }
    }
});
