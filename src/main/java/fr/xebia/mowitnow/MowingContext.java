package fr.xebia.mowitnow;

import java.util.List;

/**
 * Holder for both Surface and list o mowers presents in surface
 *
 * @author abachar
 */
public class MowingContext  implements MoveValidator {

	/**
	 * Surface to mow
	 */
	private Surface surface;

	/**
	 * List of mowers present in surface
	 */
	private List<Mower> mowers;

	/**
	 * @see MoveValidator#isValidPosition(Position)
	 */
	@Override
	public boolean isValidPosition(Position position) {
		return surface.isValidPosition(position);
	}

	public Surface getSurface() {
		return surface;
	}

	public void setSurface(Surface surface) {
		this.surface = surface;
	}

	public List<Mower> getMowers() {
		return mowers;
	}

	public void setMowers(List<Mower> mowers) {
		this.mowers = mowers;
	}
}