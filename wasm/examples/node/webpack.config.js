const path = require('path');
const outPath = path.resolve(__dirname, "dist");
const typeshedFallback = path.resolve(__dirname, "libs", "pyright-internal", "typeshed-fallback");
const webpack = require('webpack');

module.exports = {
  entry: "./src/main.ts",
  target: "web",
  output: {
    path: outPath,
    filename: "main.js",
    library: {
      type: "umd",
    },
    clean: true,
  },
  resolve: {
    extensions: [".ts", ".tsx", ".js", ".json"],
    fallback: { 
      "url": require.resolve("url/"),
      "path": require.resolve("path-browserify"),
      "assert": require.resolve("assert/"),
      "stream": require.resolve("stream-browserify"),
      "util": require.resolve("util/"),
      "crypto": require.resolve("crypto-browserify"),
      "tty": require.resolve("tty-browserify")
    }
  },
  plugins: [
    new webpack.IgnorePlugin({
      resourceRegExp: /^process$/,
    }),
    new webpack.IgnorePlugin({
      checkResource: () => false,
    }),
  ],
  module: {
    rules: [
      {
        test: /\.tsx?$/,
        use: "ts-loader",
      },
    ],
  }

}