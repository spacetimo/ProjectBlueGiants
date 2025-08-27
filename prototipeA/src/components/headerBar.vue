<template>
  <header class="header">
    <div class="logo">⌯</div>
    <div class="actions">
      <button class="button" @click="logout">ログアウト</button>
      <button class="button">マイページ</button>
    </div>
  </header>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';

const router = useRouter();

function logout() {
  localStorage.removeItem('token');
  localStorage.removeItem('role');
  router.push('/login');
}
</script>

<style scoped>
.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 60px;
  padding: 0 20px;
  background-color: #000;
  color: white;
}

.logo {
  font-size: 1.5em;
}

.actions {
  display: flex;
  gap: 10px;
}

.button {
  background-color: white;
  color: black;
  border: none;
  padding: 6px 12px;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.2s ease;
}

.button:hover {
  background-color: #ddd;
}
</style>