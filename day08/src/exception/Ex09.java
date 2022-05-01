package exception;

import java.lang.Exception;	// 예외
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Error;		// 에러

public class Ex09 {
	
	public static void main(String[] args) {
		// 예외 : 코드의 수정으로 회피할 수 있는 문제상황
		// 에러 : 코드의 수정만으로는 회피할 수 없는 문제상황
		
		Scanner sc = new Scanner(System.in);
		int num;

		try {	// 예외 발생 가능성이 있는 코드를 작성한다 (시도해본다)
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
		} catch(InputMismatchException e) {	// 만약, 예외가 발생하면
			System.out.println("정수를 입력해야 합니다 !!");	// 이렇게 처리한다
			num = 0;
			
		} finally {	// 예외 발생 여부에 상관없이 항상 실행되는 코드
			System.out.println("예외 발생과 상관없이 마지막에 실행됩니다");
			sc.close();
		}
		
		System.out.println(num);
		
//		loop();		// 실행하면 스택 오버플로우 에러가 발생한다
	}
	static void loop() {	// 재귀함수가 자신을 계속 호출한다 (메모리 공간이 부족해질것이다)
		loop();
	}
}
