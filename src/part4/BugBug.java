package part4;


import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.lang.reflect.Array;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;

public class BugBug extends Bug{
	int c = 0;
	Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE};
	
	public void turn()
    {
		double r = Math.random();
		if (r < 0.5)
        setDirection(getDirection() + Location.HALF_RIGHT);
		else
		setDirection(getDirection() + Location.HALF_LEFT);
    }
	public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (c < colors.length - 1){
        c = c + 1;
        }
        else
        	c = 0;
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Bug bug = new Bug(colors[c]);
        bug.putSelfInGrid(gr, loc);
    }
}
