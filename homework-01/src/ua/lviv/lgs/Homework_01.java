package ua.lviv.lgs;

public class Homework_01 {
	public static void main(String[] args) {
		
		// Task 1

		byte a = 3;
		short b = 15;
		int c = 31;
		long d = 64L;
		
		float e = 3.14f;
		double f = 9.42;
		
		char g = 'g';
		boolean h = false;
		
		
		
		//Task 2
		
		System.out.println("Byte min = " + Byte.MIN_VALUE);
		System.out.println("Byte max = " + Byte.MAX_VALUE);
		
		System.out.println("Short min = " + Short.MIN_VALUE);
		System.out.println("Short max = " + Short.MAX_VALUE);
		
		System.out.println("Int min = " + Integer.MIN_VALUE);
		System.out.println("Int max = " + Integer.MAX_VALUE);
		
		System.out.println("Long min = " + Long.MIN_VALUE);
		System.out.println("Long max = " + Long.MAX_VALUE);
		
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		
		System.out.println("Double min = " + Double.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);
		
		System.out.println("Char min = " + Character.MIN_VALUE);
		System.out.println("Char max = " + Character.MAX_VALUE);
		
		System.out.println("Boolean min = " + Boolean.FALSE);
		System.out.println("Boolean max = " + Boolean.TRUE);
		
		
		
		//Task 3
		
		int [] array0 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
		
		int max = array0[0];
		int min = array0[0];
		int id = 0;
		
		for (int i = 0; i < array0.length; i++) {
			if (array0[i] > max) {
				max = array0[i];
			}
			if (array0[i] < min) {
				min = array0[i];
			}
		}
		
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
	}
}
