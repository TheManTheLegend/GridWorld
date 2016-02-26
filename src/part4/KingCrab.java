package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter {
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
		for (Location loc : getLocationsInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			if (a != null){
				actors.add(a);
//				
				if(a.getLocation().getCol() < getLocation().getCol() && getGrid().isValid(new Location(a.getLocation().getRow(), a.getLocation().getCol() - 1))){
					a.moveTo(new Location(a.getLocation().getRow(), a.getLocation().getCol() - 1));	
				}
				else if(a.getLocation().getRow() < getLocation().getRow() && getGrid().isValid(new Location(a.getLocation().getRow() - 1, a.getLocation().getCol()))){
					a.moveTo(new Location(a.getLocation().getRow() - 1, a.getLocation().getCol()));
				}
				else if(a.getLocation().getCol() > getLocation().getCol() && getGrid().isValid(new Location(a.getLocation().getRow(), a.getLocation().getCol() + 1))){
					a.moveTo(new Location(a.getLocation().getRow(), a.getLocation().getCol() + 1));
				}
				else if(a.getLocation().getRow() > getLocation().getRow() && getGrid().isValid(new Location(a.getLocation().getRow() + 1, a.getLocation().getCol()))){
					a.moveTo(new Location(a.getLocation().getRow() + 1, a.getLocation().getCol()));
				}
				else{
					getGrid().remove(a.getLocation());
				}
				
			}
		}

		return actors;
	}
}
