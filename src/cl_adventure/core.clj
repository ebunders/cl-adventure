(ns cl-adventure.core
  (:gen-class)
  (:require [cl-adventure.command :refer :all]))

(def game (atom {
                  :places [
                           {
                             :id "r1"
                             :name "de voorkamer"
                             :passages []
                             :views {:e :window :w :window}
                             :desc (str "Je bent in de voorkamer. Het is een kamer met een houten planken vloer, en een balken plafond. "
                                        "Er is een open haard, en een grote boekenkast vol boeken")
                            }
                           ]
                  :player {
                            :location "r1"
                            }
                  }))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn newfn []
  (prn "Hoeraa!!! een nieuwe functie"))

(find-player @game)
(find-location @game (find-player @game))
(look @game)
