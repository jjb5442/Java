package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 자바에서는 예외도 클래스에 의한 객체로 취급한다
// 자바에서 발생하는 모든 예외의 최상의 클래스는 java.lang.Exception 이다
// Exception 클래스를 상속받아서 나만의 예외를 만들어낼 수도 있다

class ScoreOutOfBoundsException extends Exception {
	// Exception 클래스의 내용을 모두 상속받아서 가지게된다
}

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		do {
			try {
				System.out.print("점수 입력 : ");
				score = sc.nextInt();
				
				if(0 <= score && score <= 100) {	// 점수가 원하는 범위내라면
					break;	// 반복문을 탈출한다
				}	
				else {	// 아니라면 (점수 범위를 벗어난다면)
					ScoreOutOfBoundsException ex = new ScoreOutOfBoundsException();
					throw ex; 	// 내가 생성한 예외 객체를 catch가 받을수 있게 던진다
				}
				
			} catch(InputMismatchException e) {	// 자바에서 제공되는 예외 클래스
				System.out.println("정수를 입력해야 합니다 !!");
				sc.nextLine();	// 입력 버퍼를 비워주기
				
			} catch(ScoreOutOfBoundsException e) {	// 내가 직접 만든 예외 클래스
				System.out.print("점수가 범위를 벗어났습니다 !! : ");
				System.out.println(e.getClass().getSimpleName());
				sc.nextLine();	// 입력 버퍼를 비워주기
				
			} catch(Exception e) {	// 아래쪽에 배치해야 위에서 처리못한 내용을 처리할 수 있다
				System.out.println("그외 다른 예외 상황 : " + e);
			}
		} while(true);
		
		System.out.println("점수 : " + score + "점");
		sc.close();
	}
}
