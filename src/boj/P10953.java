package boj;

import java.util.Scanner;

public class P10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수 입력
		int caseNum = sc.nextInt();
		
		//테스트 케이스의 개수만큼 반복
		//콤마로 두 정수를 구분
		
		for(int i = 0;i<caseNum;i++) {
			String[] inputString = sc.nextLine().split(",");
			int a = Integer.parseInt(inputString[0]);
			int b = Integer.parseInt(inputString[1]);
			System.out.println(a+b);
			
			
		}

	}

}
