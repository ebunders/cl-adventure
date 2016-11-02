# clojure-adventure

A simple adventure game to hone my clojure skills. It is a text based game that takes commands. Commands can have arguments like:
```move west```

The player will have an inventory, and will be able to pick up items, and use them to solve puzzles

## Development plan

### Basics
* The player should be able to look around, see it's environment. it is possible to be able to look to another space, but not move there.
* The player should be able to move from space to space, only if there is a passage. Directions are north, south, east and west.


### Items
* The player will be able to find and pickup items. Items will go into the inventory
* The player will be able to see what is in his inventory.
* The player will be able to combine or use items to interact with the world.

### Critters
* There will be different critters.
* Critters will move on their own account. If and how they move is based on the critter
* Critters may attack each other or the player. 

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
