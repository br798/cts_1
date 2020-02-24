package seminar2;

public abstract class PolarBear extends Bear{
	public static final int POLAR_BEAR_SPEED=15;
	
	public PolarBear() {
		
	}

	@Override
	public String toString() {
		return "PolarBear []";
	}

	public static int getPolarBearSpeed() {
		return POLAR_BEAR_SPEED;
	}
	
	
}
