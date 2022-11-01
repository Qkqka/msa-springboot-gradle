<template>
  <img alt="Vue logo" src="./assets/logo.png" />
  <HelloWorld :hidden="true" msg="Welcome to Your Vue.js App" />
  <HelloWorld msg="안녕하세요 Vue.js 앱입니다." />
</template>

<script>
import HelloWorld from "./components/HelloWorld.vue";

export default {
  name: "App",
  components: {
    HelloWorld,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
