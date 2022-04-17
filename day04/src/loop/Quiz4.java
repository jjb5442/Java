package loop;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
				
		// 1) 1부터 10까지의 합계 출력
		for (int i = 1; i <= 10; i++) sum += i;
		System.out.println("Sum : " + sum);
		System.out.println();
		
		
		// 2) 11부터 20까지의 합계 출력
		sum = 0;
		for (int i = 11; i <= 20; i++) sum += i;
		System.out.println("Sum : " + sum);
		System.out.println();
		
		// 3) 5부터 0까지 한 줄에 순서대로 출력
		for (int i = 5; i != -1; i--) System.out.print(i + " ");
		System.out.println();
		System.out.println();
				
		// 4) 1부터 입력받은 정수까지의 합계 출력
		sum = 0;
		System.out.println("Input Integer : ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) sum += i;
		System.out.println("Sum : " + sum);
		System.out.println();
		
		// 5) 1부터 100사이의 정수 중에서 입력받은 정수의 배수만 한 줄에 출력
		System.out.println("Input Integer : ");
		num = sc.nextInt();
		for(int i = 1; i <= 100; i++) System.out.print((i % num == 0 ? i + " " : ""));
	}
}
