(ns cl-adventure.world)

(def game (atom {
                  :places [
                            {
                              :id "r1"
                              :name "the living room"
                              :ports {:e {:desc "small round window"}
                                      :w {:desc "large paned window"}}
                              :desc (str "It has wooden floor boards, and a heavy timber cealing. "
                                         "There is a fire place, and some shelves filled with old books. There is an old rug on the floor. "
                                         "It looks rather cosy.")
                              }
                            ]
                  :player {
                            :place "r1"
                            }
                  }))

(def directions {:n "north" :s "south" :e "east" :w "west"})

(defn find-player [game]
  "Return the player data"
  (:player game))

(defn find-place
  ([game]
   "Find the place of the player in the world"
   (find-place game (:place (find-player game))))
  ([game place-id]
   "Finds a place with a given id"
   (first (filter #(= (:id %) place-id)
                  (:places game)))))


;;Test
(find-player @game)
(find-place @game)
