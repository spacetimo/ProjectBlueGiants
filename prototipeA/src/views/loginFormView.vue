<template>
  <div class="login-container">
    <div class="login-box">
      <label for="email">Email</label>
      <input id="email" type="email" v-model="email" />

      <label for="password">Password</label>
      <input id="password" type="password" v-model="password" />

      <button @click="signIn">Sign in</button>

      <a href="#" class="forgot">Forgot password?</a>

      <button class="mock-nav" @click="mockLogin">メインページへ遷移（モック）</button>
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const email = ref<string>('');
const password = ref<string>('');
const router = useRouter();

const signIn = (): void => {
  console.log('Email:', email.value);
  console.log('Password:', password.value);
  // 認証処理をここに追加
};
const mockLogin = () => {
  localStorage.setItem('token', 'mock_token_123')
  localStorage.setItem('role', 'user')
  router.push('/')
}

const goToMain = (): void => {
  router.push('/main');
};
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: calc(100vh - 60px);
  background-color: #fff;
}

.login-box {
  display: flex;
  flex-direction: column;
  gap: 10px;
  width: 300px;
  padding: 30px;
  border: 1px solid #ddd;
  border-radius: 8px;
  background-color: #fff;
}

label {
  font-weight: 500;
  margin-bottom: 4px;
}

input {
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

button {
  margin-top: 10px;
  padding: 10px;
  background-color: #222;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

button:hover {
  background-color: #444;
}

.forgot {
  font-size: 0.9em;
  color: #555;
  text-align: center;
  margin-top: 10px;
  text-decoration: underline;
}

.mock-nav {
  margin-top: 10px;
  padding: 10px;
  background-color: #eee;
  color: #333;
  border: 1px solid #ccc;
  border-radius: 4px;
  cursor: pointer;
}


</style>