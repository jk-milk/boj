package boj;

import java.util.Scanner;

public class P10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수 입력
		int caseNum = sc.nextInt();
		
		//테스트 케이스 개수만큼 반복해서 입력
		for(int i = 0;i<caseNum;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}

	}

}
