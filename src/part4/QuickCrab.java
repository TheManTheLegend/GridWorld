package part4;

import java.util.ArrayList;

import javax.tools.DocumentationTool.Location;

import info.gridworld.actor.Actor;

public class QuickCrab extends CrabCritter{
	public void act()
    {
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
        ArrayList<info.gridworld.grid.Location> moveLocs = getMoveLocations();
        info.gridworld.grid.Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
        ArrayList<info.gridworld.grid.Location> moveLocs1 = getMoveLocations();
        info.gridworld.grid.Location loc1 = selectMoveLocation(moveLocs1);
        makeMove(loc1);
    }
}
