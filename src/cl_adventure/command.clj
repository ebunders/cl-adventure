(ns cl-adventure.command
  (:require [cl-adventure.world :refer :all]))

(defn line [string] (str string "\n"))
(defn subline [string] (str "*" (line string)))

(defn desc-location [place] (str
                         (line (str "You are in " (:name place)))
                         (line (:desc place))))

(defn look-at [place-id]
  "find the place and describe. If no place: swearling mist"
  (if-let [p (find-place place-id)]
    (str "a" (:name p))
    "a dark swirling mist"))

(defn desc-port [port]
  (let [direction ((first port) directions)
        place (second port)]
    (subline (str "to the " direction ", through a " (:desc place)" you see " (look-at (:to place))))))

(defn desc-ports [place]
  (when-let [ports (:ports place)]
    (apply str (map desc-port ports))))


(defn look [game]
  "Describe the current location of the player
  this contains:
  - A description of the place you are in
  - A description of the directions you can look, and what you see"
  (let [place (find-place game)]
    (str
        (desc-location place)
        (desc-ports place))))

;; Test
(println (look @game))
