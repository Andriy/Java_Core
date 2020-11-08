package ua.lviv.lgs;

public class Rectangle {
	int length, width;
	
	Rectangle () {
		this.length = 10;
		this.width = 5;
	}
	
	Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public static int square (int length, int width) {
		return length * width;
	}
	
	public static int perimeter (int length, int width) {
		return (length + width) * 2;
	}
}
