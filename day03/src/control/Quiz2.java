package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, n5, n6, n7, n8;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		n7 = sc.nextInt();
		n8 = sc.nextInt();
		
		int tmp;
		// 1) 두 정수를 변수 n1, n2 에 입력, 두 수중 값이 큰 수를 출력
		if (n1 > n2) tmp = n1;	else tmp = n2;
		System.out.println(tmp);
		
		// 2) 세 정수를 변수 n3, n4, n5에 입력, 값이 가장 작은 수 출력
		tmp = n3;
		if (n4 > tmp) tmp = n4;
		if (n5 > tmp) tmp = n5;
		System.out.println(tmp);
		
		// 3) 정수를 n6에 입력 받아서, 정수가 3의 배수인지 7의 배수인지 3과 7의 공배수인지 출력
		if (n6 % 21 == 0) System.out.println("3과 7의 공배수");
		else if (n6 % 7 == 0) System.out.println("7의 배수");
		else if (n6 % 3 == 0) System.out.println("3의 배수");
		
		// 4) 두 정수를 n7, n8에 입력받고 두 수의 합을 n9에 입력 후 정답인지 출력
		System.out.println("n7 + n8 : ");
		tmp = sc.nextInt();
		if (tmp == n7 + n8) System.out.println("True"); else System.out.println("False");
	}
}
