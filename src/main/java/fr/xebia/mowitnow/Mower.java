package fr.xebia.mowitnow;

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
			case N:
				orientation = Orientation.W;
				break;
			case E:
				orientation = Orientation.N;
				break;
			case S:
				orientation = Orientation.E;
				break;
			case W:
				orientation = Orientation.S;
				break;
		}
	}

	/**
	 * Perform a right rotation
	 */
	public void rotateRight() {
		switch (orientation) {
			case N:
				orientation = Orientation.E;
				break;
			case E:
				orientation = Orientation.S;
				break;
			case S:
				orientation = Orientation.W;
				break;
			case W:
				orientation = Orientation.N;
				break;
		}
	}

	/**
	 * Move one step forward if the next position is in the area
	 */
	public void moveForward() {
		Position newPosition = null;
		switch (orientation) {
			case N:
				newPosition = new Position(position.getX(), position.getY() + 1);
				break;
			case E:
				newPosition = new Position(position.getX() + 1, position.getY());
				break;
			case S:
				newPosition = new Position(position.getX(), position.getY() - 1);
				break;
			case W:
				newPosition = new Position(position.getX() - 1, position.getY());
				break;
		}

		// If it' a valid position ?
		if ((newPosition != null) && surface.isValidPosition(newPosition)) {
			position = newPosition;
		}
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
