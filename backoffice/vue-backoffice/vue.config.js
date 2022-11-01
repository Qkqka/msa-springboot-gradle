const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  outputDir: "../src/main/resources/static", // npm run build 빌드 시 파일이 생성되는 위치
  indexPath: "../templates/index.html", // index.html 파일이 생성될 위치
  devServer: {
    // Back-End , 즉 Spring Boot의 내장 was의 주소
    proxy: "http://localhost:8080",
    // 실시간 수정 소스 확인 포트 : http://localhost:4444
    port: 4444,
  },
  chainWebpack: (config) => {
    const svgRule = config.module.rule("svg");
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");
  },
});
