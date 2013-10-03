package fr.xebia.mowitnow;

import org.apache.commons.lang.NotImplementedException;

/**
 * The programmable mower
 *
 * @author abachar
 */
public class Mower {

	/**
	 * The mowing area
	 */
	private Surface surface;

	/**
	 * The current position of the mower in the surface
	 */
	private Position position;

	/**
	 * Orientation of the mower
	 */
	private Orientation orientation;

	/**
	 * Constructor with the mowing area and the initial position of the mower in this area
	 *
	 * @param surface     the mowing area
	 * @param position    Initial position of the mower on the surface
	 * @param orientation The initial value of orientation
	 */
	public Mower(Surface surface, Position position, Orientation orientation) {
		this.surface = surface;
		this.position = position;
		this.orientation = orientation;
	}

	/**
	 * Perform a left rotation
	 */
	public void rotateLeft() {
		switch (orientation) {
			case NORTH:
				orientation = Orientation.WEST;
				break;
			case EAST:
				orientation = Orientation.NORTH;
				break;
			case SOUTH:
				orientation = Orientation.EAST;
				break;
			case WEST:
				orientation = Orientation.SOUTH;
				break;
		}
	}

	/**
	 * Perform a right rotation
	 */
	public void rotateRight() {
		throw new NotImplementedException();
	}

	/**
	 * Move one step forward if the next position is in the area
	 */
	public void moveForward() {
		throw new NotImplementedException();
	}

	public Surface getSurface() {
		return surface;
	}

	public void setSurface(Surface surface) {
		this.surface = surface;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
}