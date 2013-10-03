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
	private final Surface surface = new Surface(5, 5);

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

		// Test the new orientation
		Assertions.assertThat(mower.getOrientation()).isEqualTo(expectedOrientation);
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
}