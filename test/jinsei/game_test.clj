(ns jinsei.game-test
  (:require
   [jinsei.game :as game]
   [clojure.test :refer [deftest is]]))

(def local-grid [[1 1 1] [1 0 1] [0 1 0]])

(deftest dead-cell-should-be-revived
  (is (= [[1 0 1] [1 0 1] [0 1 0]] (game/evolve-grid local-grid))))
