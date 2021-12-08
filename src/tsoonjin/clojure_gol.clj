(ns tsoonjin.clojure-gol
  (:require
    [jinsei.game :as jinsei ]
  )
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [
    world (jinsei/init-random-world 5 5 2)
  ]
    (println (jinsei/update-world world 3 3 10))
  )
)
