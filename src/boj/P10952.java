package boj;

import java.util.Scanner;

public class P10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		//입력이 0 2개가 연속으로 들어오면 종료
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a==0 && b==0)
				break;
			System.out.println(a+b);
		}

	}

}
