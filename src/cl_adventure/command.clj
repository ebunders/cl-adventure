(ns cl-adventure.command
  (:require [cl-adventure.world :refer :all]))


(defn desc-location [] (str "You are in " (:name (find-place))))
(defn desc-views [] "Todo")
(defn desc-moves [] "Todo")

(defn look []
  "Describe the current location of the player
  this contains:
    - A description of the place you are in
    - A description of the directions you can look, and what you see
    - A description of the directions you can move"
  (str
    (desc-location)
    (desc-views)
    (desc-moves))


;; Test
(look)
