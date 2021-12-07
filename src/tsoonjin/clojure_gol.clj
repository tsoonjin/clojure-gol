(ns tsoonjin.clojure-gol
  (:require
    [jinsei.game :as jinsei ]
  )
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (jinsei/init-random-world 5 5 2))
)
