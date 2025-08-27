<template>
    <dev>
        <HeaderBar />
      <div class="main-page">
        <h1>メインページ（モック）</h1>
        <p>ログイン後に表示されるページです。</p>
      </div>
    </dev>
</template>

<script setup lang="ts">
import HeaderBar from '../components/headerBar.vue';
</script>

<style scoped>
.main-page {
  padding: 40px;
  text-align: center;
}
</style>