package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BusterCritter extends Critter{
	private int c;
	public BusterCritter(int c){
		this.c = c;
	}
	
		
	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locs = new ArrayList<Location>();
		ArrayList<Location> locsss = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();
		
		
		
			locs = getGrid().getOccupiedAdjacentLocations(getLocation());
			for(int i = 0; i < locs.size(); i++){
				
				locsss = getGrid().getOccupiedAdjacentLocations(locs.get(i));
			}
		
		
		
		System.out.println(getLocation());
		return locsss;
	}
	
	
	
	
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		
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
