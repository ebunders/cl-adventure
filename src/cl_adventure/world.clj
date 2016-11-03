(ns cl-adventure.world)

(def game (atom {
                  :places [
                           {
                             :id "r1"
                             :name "the living room"
                             :passages []
                             :views {:e :window :w :window}
                             :desc (str "You are in the living room. It has wooden floor boards, and a heavy timber cealing. "
                                        "There is a fire place, and some shelves filled with old books. There is an old rug on the floor.
                                        It looks rather cosy.")
                            }
                           ]
                  :player {
                            :place "r1"
                            }
                  }))

(defn find-player []
  "Return the player data"
  (:player @game))

(defn find-place [player]
  "Find the place of the player in the world"
  (first (filter #(= (:id %) (:place player))
          (:places @game))))


;;Test
(find-player)
(find-place (find-player))
