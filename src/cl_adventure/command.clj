(ns cl-adventure.command)

(defn find-player [game] (:player game))
(defn find-location [game player]
  (first (filter #(= (:id %) (:location player))
          (:places game))))

(defn look [game]
  "Describe the current location of the player"
  (let [location (find-location game (find-player game))]
    (str "Je bent in " (:name location)) ))


