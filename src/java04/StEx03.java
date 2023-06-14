package java04;

import java.util.Scanner;

/*
 * 
 */
public class StEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = Integer.parseInt(scan.nextLine());
		
		double area = r*r*Math.PI;
		System.out.println(area);
	}

}
