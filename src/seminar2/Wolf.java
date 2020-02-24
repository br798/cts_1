package seminar2;

public abstract class Wolf implements Runner{
	
	public static final int WOLF_SPEED=10;
	
	public Wolf() {
		
	}
	
	@Override
	public String toString() {
		return "Wolf []";
	}

	public static int getWolfSpeed() {
		return WOLF_SPEED;
	}
	
	
}
