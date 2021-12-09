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

(defn grid->cell [grid col row]
  (let [sublist (or (get grid row) [])]
    (or (get sublist col) 0)))

(defn evolve-cell [grid cell]
  (let [[x y] cell
        cell-value (grid->cell grid x y)
        offsets (list (list (- x 1) (- y 1)) (list x (- y  1)) (list (+ x 1) (- y 1)) (list (- x 1) y) (list (+ x 1) y) (list (- x 1) (+ y 1)) (list x (+ y 1)) (list (+ x 1) (+ y 1)))
        neighbor-sum (apply + (map #(apply grid->cell grid %) offsets))]
    (do
      (cond
        (and (= cell-value 0) (= neighbor-sum 3)) 1
        (and (= cell-value 1) (or (< neighbor-sum 2) (> neighbor-sum 3))) 0
        :else cell-value))))

(defn evolve-grid [grid]
  (let [row (count grid)
        col (count (get grid 0))]
    (vec (for [i (range 0 row)]
           (vec (for [j (range 0 col)]
                  (evolve-cell grid (list j i))))))))

(defn start-game [name]
  (println "Start game" name))
