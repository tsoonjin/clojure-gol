(ns jinsei.game)


(defn init-empty-world [row col]
  (vec (repeat row (vec (repeat col 0))))
)

(defn init-random-world [row col limit]
  (for [i (range 1 (inc row))]
    (for [j (range 1 (inc col))]
      (rand-int limit)
    )
  )
)

(defn start-game [name]
  (println "Start game" name)
)
