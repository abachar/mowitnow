package fr.xebia.mowitnow;

/**
 * The position of the mower is the triplet x, y and orientation
 *
 * @author abachar
 */
public class Position {

	/**
	 * (x, y) coordinates
	 */
	private int x;
	private int y;

	/**
	 * Constructor with the x and y coordinates, the default orientation north will be used
	 *
	 * @param x The initial value of X coordinate
	 * @param y The initial value of Y coordinate
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
