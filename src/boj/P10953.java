package boj;

import java.util.Scanner;

public class P10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�׽�Ʈ ���̽� ���� �Է�
		int caseNum = sc.nextInt();
		
		//�׽�Ʈ ���̽��� ������ŭ �ݺ�
		//�޸��� �� ������ ����
		
		for(int i = 0;i<caseNum;i++) {
			String[] inputString = sc.nextLine().split(",");
			int a = Integer.parseInt(inputString[0]);
			int b = Integer.parseInt(inputString[1]);
			System.out.println(a+b);
			
			
		}

	}

}
