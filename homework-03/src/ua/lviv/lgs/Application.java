package ua.lviv.lgs;

import java.awt.geom.Rectangle2D;

public class Application {
	public static void main(String[] args) {
		Rectangle myRectangle1 = new Rectangle();
		System.out.println(myRectangle1);		
		
		System.out.println();
		
		Rectangle myRectangle2 = new Rectangle(2,4);
		System.out.println(myRectangle2);
		
		System.out.println();
		
		System.out.println("Площа прямокутника = " + myRectangle2.square(2,4));
		System.out.println("Периметр прямокутника = " + myRectangle2.perimeter(2,4));
		
		System.out.println();
		
		Circle myCircle1 = new Circle(3,6);
		
		System.out.printf("Довжина кола = " + "%.2f", myCircle1.square(3.6));
		System.out.println();
		System.out.printf("Довжина кола = " + "%.2f", myCircle1.length(3.6));
		System.out.println();
	}
}
