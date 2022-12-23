package boj;

import java.util.Scanner;

public class P10951 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		//입력이 숫자가 아닐 때 종료
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}

}
