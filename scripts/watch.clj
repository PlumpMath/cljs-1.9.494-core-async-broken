(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-world-mies.core
   :output-to "out/hello_world_mies.js"
   :output-dir "out"})
