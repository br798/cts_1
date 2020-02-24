package seminar2;

public abstract class Grizzly extends Bear {
	
	public static final int GRIZZLY_SPEED = 25;
	
	public Grizzly() {
		
	}

	@Override
	public String toString() {
		return "Grizzly []";
	}

	public static int getGrizzlySpeed() {
		return GRIZZLY_SPEED;
	}
	

}
