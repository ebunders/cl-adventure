# clojure-adventure

A simple adventure game to hone my clojure skills. It is a text based game that takes commands. Commands can have arguments like:
```move west```

The player will have an inventory, and will be able to pick up items, and use them to solve puzzles

## Development plan

### Basics
* The player should be able to look around, see it's environment. Spaces can be connected as passible or non-passible.
* Passable connections can be navigated. Supported directions are north, south, east and west. If there is a passable connection that is not linked to anything, there is a black, inpenetrable force field.
* Unpassable connections influence that the player sees. If There is a non-passible connection that is not linked to anything, it displays a mysterious swirling mist.
* Commands: look, go [direction]

### Items
* The player will be able to find and pickup items. Items will go into the inventory
* The player will be able to see what is in his inventory.
* The player will be able to combine or use items to interact with the world.
* commands: inventory, take, drop

### Critters
* There will be different critters.
* Critters will move on their own account. If and how they move is based on the critter
* Critters may attack each other or the player.


#### Ports
Ports are connections from one place to another. Ports can be windows or doors (open or closed) but also passages (hallways or completely open
like connecting gardens). Ports are oriented to the north, east, south or west.
A port can be traversible. In that case a player can move that way.
A port can be transparent. In that case a player can see the connected place, but not go there.
If a port is traversible, but not transparent, the player does not see where it goes.
The traversal needs a description, like:
`"You walk down a path to the vegetale patch"`
`"You try the door, and it is not locked. You open it, and step through..."`, or
"You try the door, but it is locked."

```
{
  :desc "A room"
  :ports {
    :n {
      :desc "a door"
      :passable false
      :pass "The door is locked" ;; defaults to 'you can not go there' or 'you go through a door'
    }
  }
}```

