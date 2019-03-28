module.exports = {
  outputDir: '../src/main/resources/static/',
  publicPath: undefined,
  assetsDir: undefined,
  runtimeCompiler: undefined,
  productionSourceMap: undefined,
  parallel: undefined,
  css: undefined,
  devServer: {
    proxy: {
      '/auth': {
        target: 'http://localhost:8081',
        ws: true,
        changeOrigin: true
      },
	  '/api': {
        target: 'http://localhost:8081',
        ws: true,
        changeOrigin: true
      }
    }
}
}