(ns jinsei.game)

(defn init-empty-world [row col]
  "Generate empty grid"
  (vec (repeat row (vec (repeat col 0)))))

(defn init-random-world [row col limit]
  "Generate empty grid with random value from 0 to limit"
  (vec (for [i (range 1 (inc row))]
         (vec (for [j (range 1 (inc col))]
                (rand-int limit))))))

(defn update-world [grid row col value]
  (let [new_col (assoc (get grid row) col value)]
    (assoc grid row new_col)))

(defn grid->cell [grid row col]
  (let [sublist (or (get grid row) [])]
    (or (get sublist col) 0)))

(defn get-neighbors [grid cell]
  (let [[x y] cell
        offsets ((-1 -1) (0 -1) (1 -1) (-1 0)  (1 0) (-1 1) (0 1) (1 1))]))

(defn start-game [name]
  (println "Start game" name))
