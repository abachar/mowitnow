package fr.xebia.mowitnow;

/**
 * Move validator
 *
 * @author abachar
 */
public interface MoveValidator {

	/**
	 * Checks whether the position is valid an can be used by the mower
	 *
	 * @param position The position to be tested
	 * @return True if the position is valid an can be used by the mower
	 */
	boolean isValidPosition(Position position);
}
