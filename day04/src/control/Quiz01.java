package control;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 주민등록번호의 7번째 자리는 성별정보와 출생연도의 정보가 담겨있다
		// 홀수는 남성, 짝수는 여성을 의미하며
		// 9, 0은 1800년대 출생
		// 1, 2는 1900년대 출생,  
		// 3, 4 는 2000년대 출생
		// 정수를 하나 입력받아서, 성별과 출생년대를 출력하세요
		int num, gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Num : ");
		num = sc.nextInt();
		gender = num % 2;
		switch (num + gender) {
		case 0: case 10:
			System.out.println((gender != 0 ? "남성" : "여성") + ", " + "1800년 출생");
			break;
		case 2:
			System.out.println((gender != 0 ? "남성" : "여성") + ", " + "1900년 출생");
			break;
		case 4:
			System.out.println((gender != 0 ? "남성" : "여성") + ", " + "2000년 출생");
			break;
		default: 
			System.out.println("Nothing");
		}
	}
}
