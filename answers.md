1. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
2. the critters first find the file in their folder that tells then how to look, they then change their appearance to that, then they figure out where to move based on the code, they make sure the way is clear and then finally they move forward.
3. the subclass Critter shouldn't overwrite the getActors method because this method will be different for each type of actor.
4. Critter could process an actor as a flower, rock or critter.
5. getMoveLocations: figure where to go, selectMoveLocation: if it is clear ahead or if it needs to turn, makeMove: move
6. Critter extends the actor constructor so critter doesn't need one of its own.

1. The other methods that act() calls are modified.
2. because  a lot of the code for chameleon's makemove is going to be the same but some edits will still need to take place.
3. create a new flower each time critter moves and then use putSelfInGrid() at the current coordinates.
4. it doesn't change how it finds actors
5. Actor
6. GridActors getGrid()

1. because the crab processes the other acotrs the same way.
2. the crab only eats other actors that aren't rocks or critters.
3. to see if any bugs are in those spaces.
4. 2,5  3,5  4,5
5. turns 90 degrees in a random direction when it can't keep moving.
6. if it's new location is equal to another actor's
7. because crabs are critters and crabs won't eat other critters.

1.
