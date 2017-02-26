(ns hello-world-mies.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [clojure.browser.repl :as repl]
    [cljs.core.async :refer [timeout <! >! take!]]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world")

(go
  (println "Hello core.async"))