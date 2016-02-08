package part2;

import info.gridworld.actor.Bug;

public class SprialBug extends Bug {
	private int count = 0;
	private int steps;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public SprialBug(int length) {
		steps = 0;
		sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			turn();
			turn();
			count++;
			steps = 0;
		}
			if(count >= 3){
				sideLength = sideLength - 1;
				count = 1;
				steps = 0;
		}
	}
}