const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,

  // Uncomment if needed to define custom output directory
  // outputDir: "../play/src/main",

  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:8080", // Spring Boot 서버 주소
        changeOrigin: true,
        pathRewrite: { "^/api": "" }, // 필요하면 API 경로를 재작성
      },
    },
  },
});
