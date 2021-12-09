(ns jinsei.game-test
  (:require
   [jinsei.game :as game]
   [clojure.test :refer [deftest is]]))

(def local-grid [[1 1 1] [1 0 1] [0 0 0]])

(deftest get-cell-from-grid
  (is (= 1 (game/grid->cell local-grid 1 1))))
