package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int turns[];

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug(int turn[]) {
		turns = turn;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (canMove()) {
			for(int i = 0; i <turns.length; i ++){	
				for(int n = 0; n < turns[i]/45; n ++){
					turn();
				}
				move();
			}
				
		}
		else{
			turn();
		}
	}
}