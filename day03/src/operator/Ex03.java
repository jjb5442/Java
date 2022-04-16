package operator;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 단항 연산자 : 하나의 항에 대해서 연산자를 사용하는 형식
		// 부호 제어와 증감 연산으로 구분할 수 있다
		
		// 1) 부호를 이용하여 절대값 구하기
		Scanner sc = new Scanner(System.in);
		int num, abs;
		System.out.println("Insert any Integer : ");
		num = sc.nextInt();
		
		if(num < 0) {
			abs = -num;
		}
		else {
			abs = num;
		}
		System.out.printf("%d의 절대값은 %d입니다\n", num, abs);
		sc.close();
		
		// 2) 증감연산자
		
		int num2 = 10;
		
		System.out.println(num2++);  
		System.out.println(++num2);
		System.out.println(num2--);
		System.out.println(--num2);
	}
}
