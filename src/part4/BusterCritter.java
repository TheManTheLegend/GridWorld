package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BusterCritter extends Critter{
	
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.HALF_CIRCLE, Location.RIGHT, Location.LEFT, Location.AHEAD };
		for (Location loc : getLocationsInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			if (a != null)
				actors.add(a);
		}

		return actors;
	}
	
	
	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();

		for (int d : directions) {
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc))
				locs.add(neighborLoc);
		}
		
		
		
		return locs;
	}
	
	
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		int c = 5;
		if (n > c){
			setColor(getColor().darker());
			return;
		}
		else if (n < c){
			setColor(getColor().brighter());
			return;
		}
		int r = (int) (Math.random() * n);

		Actor other = actors.get(r);
		setColor(other.getColor());
		
		
		
	}
}	
