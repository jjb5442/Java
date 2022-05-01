package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11 {
	static Scanner sc = new Scanner(System.in);
	
	static int inputNumber() throws InputMismatchException {
		return sc.nextInt();	// 여기에 try ~ catch를 작성하면 코드가 너무 길어진다
	}
	static double inputDouble() throws InputMismatchException {
		return sc.nextDouble();	// 비슷한 예외처리를 각각 해야 한다
	}
	
	public static void main(String[] args) {
		// 모든 예외상황을 따로 처리하면 효율이 떨어질 수 있다
		// 특정 함수에서 발생한 예외를 상위 레벨로 전가시키고, 한곳에 모아서 처리하는 방법을 권장한다
		// 함수에서 발생하는 예외를 상위 레벨로 전가시키려면 throws 를 사용한다
		int num;
		double db;
		try {
			System.out.print("정수 입력 : ");
			num = inputNumber();	// main이 inputNumber를 호출해서 발생한 예외이므로
			System.out.print("실수 입력 : ");	// 예외 처리 책임을 main에게 넘긴다
			db = inputDouble();
			
			System.out.println(num);
			System.out.println(db);
		} catch(InputMismatchException e) {
			System.out.println("예외 발생 !! 프로그램 종료");
			return;
		}
		
	}
}
