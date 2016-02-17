package part4;


import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Iterator;



public class ChameleonKid extends ChameleonCritter {

	/**
	 * 
	 */
	public ChameleonKid() {
		super();
	}

	/* (non-Javadoc)
	 * @see info.gridworld.actor.Critter#getActors()
	 */
	@Override
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = super.getActors();
		Iterator<Actor> itr = actors.iterator();
		int dir = 12;
		while(itr.hasNext()){
			dir = getLocation().getDirectionToward(itr.next().getLocation());
			if(dir == Location.NORTH || dir == Location.SOUTH)
				setColor(itr.getColor());
		}
		return actors;
	}

	
	
}