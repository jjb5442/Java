package control;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1) switch 에는 문자열, 정수 사용 가능
//		2) switch에는 반환값이 있는 함수, 혹은 연산식이 들어갈 수 있다
//		3) case : 에는 변수를 사용할 수 없다
		
		double db;
		System.out.println("Insert Double : ");
		db = sc.nextDouble();
		
		switch((int)db) {
		case 1:
			System.out.println("Integer 1");
			break;
		case 2:
			System.out.println("Integer 2");
			break;
		}
		System.out.println();
		
		String subject;
		System.out.println("Input Subject : ");
		subject = sc.next();
		switch(subject) {
		case "Network" :
			System.out.println("Network go to 1101"); break;
		case "Python" :
			System.out.println("Python go to 1102"); break;
		case "Linux":
			System.out.println("Linux go to 1103"); break;
		case "Java":
			System.out.println("Java go to 1104"); break;
		case "Data structure" :
			System.out.println("Data structure go to 1105"); break;
		default:
			System.out.println("Nothing");
		}
		
		int num;
		System.out.println("Input Integer : ");
		num = sc.nextInt();
		
		switch(num % 2) {
		case 0: System.out.println("Even"); break;
		case 1: System.out.println("Odd"); break;
		}
		
		
		
	}
}
