import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";

import Announcement from "../views/Announcement.vue";
import QnAlist from "../views/QnAlist.vue";
import Board from "../views/Board.vue";
import Login from "../views/Login.vue";
import English from "../views/English.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/announcement",
    name: "Announcement",
    component: Announcement,
  },
  {
    path: "/QnAlist",
    name: "QnAlist",
    component: QnAlist,
  },
  {
    path: "/board",
    name: "Board",
    component: Board,
  },
  {
    path: "/login",
    name: "Login",
    component: Login,
  },
  {
    path: "/EN",
    name: "English",
    component: English,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
