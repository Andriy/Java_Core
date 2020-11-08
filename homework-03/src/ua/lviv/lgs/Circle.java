package ua.lviv.lgs;

public class Circle {
	double r, d;
	
	Circle (double r, double d) {
		this.r = r;
		this.d = d;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", d=" + d + "]";
	}

	public static double length (double r) {
		double length = 2 * 3.14 * r;
		return length;
	}
	
	public static double square (double d) {
		double square = (3.14 * d * d) / 4;
		return square;
	}
}
