package in;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// char를 제외한 모든 primitive와 String을 입력받을 수 있다
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.printf("%s의 나이는 %d살 입니다\n", name, age);
		
		sc.close();
	}
}
