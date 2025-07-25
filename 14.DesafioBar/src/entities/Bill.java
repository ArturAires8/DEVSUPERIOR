package entities;

public class Bill {

	public static final double GENDER_M = 10;
	public static final double GENDER_F = 8;
	public static final double BEER = 5;
	public static final double BARBECUE = 7;
	public static final double SOFTDRINK = 3;
	
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {

		if (feeding() > 30) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	public double feeding() {
		return (beer * BEER) + (barbecue * BARBECUE) + (softDrink *SOFTDRINK);

	}

	public double ticket() {

		if (gender == 'F') {
			return GENDER_F;
		} else {
			return GENDER_M;
		}

	}

	public double total() {

		return cover() + feeding() + ticket();

	}
}
