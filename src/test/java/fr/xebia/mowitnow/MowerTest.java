package fr.xebia.mowitnow;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test class of Mower
 *
 * @author abachar
 */
@RunWith(JUnitParamsRunner.class)
public class MowerTest {

	/**
	 * Surface used to test mower
	 */
	private final static int LIMIT_X = 5;
	private final static int LIMIT_Y = 5;
	private final Surface surface = new Surface(LIMIT_X, LIMIT_Y);

	/**
	 * Test of Mower.rotateLeft method
	 *
	 * @param currentOrientation  Current orientation
	 * @param expectedOrientation Expected orientation after rotation
	 */
	@Test
	@Parameters(method = "rotateLeftParameters")
	public void testRotateLeft(Orientation currentOrientation, Orientation expectedOrientation) {

		// Create new mower
		Mower mower = new Mower(surface, new Position(0, 0), currentOrientation);

		// Rotate left
		mower.rotateLeft();

		// Only the orientation must change the position remains the same
		Assertions.assertThat(mower.getOrientation()).isEqualTo(expectedOrientation);
		Assertions.assertThat(mower.getPosition()).isEqualTo(new Position(0, 0));
	}

	/**
	 * Test of Mower.rotateRight method
	 *
	 * @param currentOrientation  Current orientation
	 * @param expectedOrientation Expected orientation after rotation
	 */
	@Test
	@Parameters(method = "rotateRightParameters")
	public void testRotateRight(Orientation currentOrientation, Orientation expectedOrientation) {

		// Create new mower
		Mower mower = new Mower(surface, new Position(0, 0), currentOrientation);

		// Rotate right
		mower.rotateRight();

		// Only the orientation must change the position remains the same
		Assertions.assertThat(mower.getOrientation()).isEqualTo(expectedOrientation);
		Assertions.assertThat(mower.getPosition()).isEqualTo(new Position(0, 0));
	}

	/**
	 * Test of Mower.moveForward method
	 *
	 * @param currentPosition  Current position
	 * @param currentDirection Current orientation
	 * @param expectedPosition Expected position after move
	 */
	@Test
	@Parameters(method = "moveForwardParameters")
	public void testMoveForward(Position currentPosition, Orientation currentDirection, Position expectedPosition) {

		// Create new mower
		Mower mower = new Mower(surface, currentPosition, currentDirection);

		// Move moveForward
		mower.moveForward();

		// Test the new position and orientation
		Assertions.assertThat(mower.getPosition()).isEqualTo(expectedPosition);
		Assertions.assertThat(mower.getOrientation()).isEqualTo(currentDirection);
	}

	/**
	 * @return collection of parameters to execute testRotateLeft
	 */
	public static Object[] rotateLeftParameters() {
		return new Object[][]{
				{Orientation.NORTH, Orientation.WEST},
				{Orientation.WEST, Orientation.SOUTH},
				{Orientation.SOUTH, Orientation.EAST},
				{Orientation.EAST, Orientation.NORTH},
		};
	}

	/**
	 * @return collection of parameters to execute testRotateRight
	 */
	public static Object[] rotateRightParameters() {
		return new Object[][]{
				{Orientation.NORTH, Orientation.EAST},
				{Orientation.EAST, Orientation.SOUTH},
				{Orientation.SOUTH, Orientation.WEST},
				{Orientation.WEST, Orientation.NORTH},
		};
	}

	/**
	 * @return collection of parameters to execute testMoveForward
	 */
	public static Object[] moveForwardParameters() {
		return new Object[][]{
				// Move North
				{new Position(0, 0), Orientation.NORTH, new Position(0, 1)},
				{new Position(0, LIMIT_Y), Orientation.NORTH, new Position(0, LIMIT_Y)},
				{new Position(LIMIT_X, 0), Orientation.NORTH, new Position(LIMIT_X, 1)},
				{new Position(LIMIT_X, LIMIT_Y), Orientation.NORTH, new Position(LIMIT_X, LIMIT_Y)},

				// Move East
				{new Position(0, 0), Orientation.EAST, new Position(1, 0)},
				{new Position(0, LIMIT_Y), Orientation.EAST, new Position(1, LIMIT_Y)},
				{new Position(LIMIT_X, 0), Orientation.EAST, new Position(LIMIT_X, 0)},
				{new Position(LIMIT_X, LIMIT_Y), Orientation.EAST, new Position(LIMIT_X, LIMIT_Y)},

				// Move South
				{new Position(0, 0), Orientation.SOUTH, new Position(0, 0)},
				{new Position(0, LIMIT_Y), Orientation.SOUTH, new Position(0, LIMIT_Y - 1)},
				{new Position(LIMIT_X, 0), Orientation.SOUTH, new Position(LIMIT_X, 0)},
				{new Position(LIMIT_X, LIMIT_Y), Orientation.SOUTH, new Position(LIMIT_X, LIMIT_Y - 1)},

				// Move West
				{new Position(0, 0), Orientation.WEST, new Position(0, 0)},
				{new Position(0, LIMIT_Y), Orientation.WEST, new Position(0, LIMIT_Y)},
				{new Position(LIMIT_X, 0), Orientation.WEST, new Position(LIMIT_X - 1, 0)},
				{new Position(LIMIT_X, LIMIT_Y), Orientation.WEST, new Position(LIMIT_X - 1, LIMIT_Y)},
		};
	}
}
