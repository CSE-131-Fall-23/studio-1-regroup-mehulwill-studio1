package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
boolean a1 = x < y;
boolean a2 = y < z;
boolean b1 = x > y;
boolean b2 = y > z;
boolean z1 = a1 && a2;
boolean z2 = b1 && b2;
boolean isOrdered = z1 || z2;

	System.out.println(isOrdered);	
	
	}

}
