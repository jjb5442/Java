package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) 정수로 나이를 입력받아서 성인 / 미성년자 여부를 화면서 출력
		// 2) 비밀번호를 입력받아서 일치하면 "잠금해제" 혹은 "해제실패" 라고 출력
		// 비밀번호는 미리 임의의 정수 4자리를 설정
		int age;
		System.out.println("Insert Age : ");
		age = sc.nextInt();
		System.out.println(age >= 20 ? "Adult" : "Teenager");
		
		// int의 앞자리가 0으로 시작하면 8진수 형태로 처리
		int password, input_password;
		System.out.println("Set up Password : ");
		password = sc.nextInt();
		System.out.println("Insert your Password : ");
		input_password = sc.nextInt();
		System.out.println(password == input_password ? "Unlock" : "Unlock Failed");
		sc.close();
		
		// 삼항 연산자로 처리 할 수 없는 예시
		// 조건에 따라서 서로 다른 함수를 호출하는 경우
		
		int num2 = 3;
		if (num2 >= 0)
			System.out.println("양의 정수");
		else
			System.err.println("음의 정수");
		
//		(num2 >= 0) ? System.out.println("양의 정수"); : System.err.println("음의 정수"); X
//		삼항 연산자는 값을 결정할 때 사용		함수 X
	}
}
