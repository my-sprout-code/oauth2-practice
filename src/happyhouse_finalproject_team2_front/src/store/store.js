import Vue from "vue";
import Vuex from "vuex";
import axios from "./axios-common.js";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    sidolist: [],
    gugunlist: [],
    donglist: [],
  },
  actions: {
    ALLSIDO: (store) => {
      axios
        .get("/api/v1/sido")
        .then((response) => {
          store.commit("ALLSIDO", { sidolist: response.data });
        })
        .catch((response) => {
          console.log(response);
        });
    },
    ALLGUGUN: (store, payload) => {
      axios
        .get("/api/v1/gungun/" + payload)
        .then((response) => {
          store.commit("ALLGUGUN", { gugunlist: response.data });
        })
        .catch((response) => {
          console.log(response);
        });
    },
    ALLDONG: (store, payload) => {
      axios
        .get("/api/v1/dong/" + payload)
        .then((response) => {
          store.commit("ALLDONG", { donglist: response.data });
        })
        .catch((response) => {
          console.log(response);
        });
    },
  },
  mutations: {
    ALLSIDO: (state, payload) => {
      console.log(payload);
      state.sidolist = payload.sidolist;
    },
    ALLGUGUN: (state, payload) => {
      console.log(payload);
      state.gugunlist = payload.gugunlist;
    },
    ALLDONG: (state, payload) => {
      console.log(payload);
      state.donglist = payload.donglist;
    },
  },
});
