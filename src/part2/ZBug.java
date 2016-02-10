package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	private int count = 0;
	private int steps;
	private int sideLength;
	private boolean idk = true;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (idk == true){
			if(count == 0){
				turn();
				turn();
				count ++;
			}
			if (steps < sideLength && count >= 1) {
				move();
				steps++;
			}
		     else {
				turn();
				turn();
				turn();
				count ++;
				
				steps = 0;
				if (count == 3){
					turn();
					turn();
				}
				else if (count >=4 ){
					idk = false;
				}	
			}
		}	
	}
	
}



