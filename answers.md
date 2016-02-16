1. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
2. the critters first find the file in their folder that tells then how to look, they then change their appearance to that, then they figure out where to move based on the code, they make sure the way is clear and then finally they move forward.
3. the subclass Critter shouldn't overwrite the getActors method because this method will be different for each type of actor.
4. Critter could process an actor as a flower, rock or critter.
5. getMoveLocations: figure where to go, selectMoveLocation: if it is clear ahead or if it needs to turn, makeMove: move
6. Critter extends the actor constructor so critter doesn't need one of its own.

1. The other methods that act() calls are modified.
2.