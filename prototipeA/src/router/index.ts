import { createRouter, createWebHistory } from 'vue-router';

const routes = [
  { path: '/login', component: () => import('../views/loginFormView.vue') },
  { path: '/', component: () => import('../views/mainPageView.vue'), meta: { requiresAuth: true } }
];

const router = createRouter({
  history: createWebHistory(),
  routes
})

// 認証ガード
router.beforeEach((to, _, next) => {
  const token = localStorage.getItem('token')         // 認証チェック
  const role = localStorage.getItem('role')           // ロールチェック（adminかuser）

  if (to.meta.requiresAuth && !token) {
    next('/login')                                     // 未ログインならログイン画面へ
  } else if (to.meta.role === 'admin' && role !== 'admin') {
    next('/')                                          // 管理者以外はホームへ退避
  } else {
    next()                                             // OKならそのまま遷移
  }
})

export default router