package java04;

import java.util.Scanner;

/* 내장 api 클래스 하위의 내장 메서드를
 * 활용하는 예제
 * 
 */

public class StEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0 ,b=0;
		a = Integer.parseInt(scan.nextLine());
		b= Integer.parseInt(scan.nextLine());
		System.out.println(Math.max(a,b));
		
	}

}
