package in;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// 이동시간 3분
		// 이동한 구간 수 입력 -> 걸린 시간 출력
		// 시간 : 분  , 한 자릿수일 경우 앞에 0 붙여서 출력
		// 입력 : 7
		// 출력 : 0시간 21분
		
		// 입력 : 21
		// 출력 : 1시간 3분
		
		int term = 3;
		int move;
		int time, hour, minute;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이동할 구간 수 입력 : ");
		move = sc.nextInt();
		
		time = move * term;
		hour = time / 60;
		minute = time % 60;
		
		if (hour != 0)
			System.out.printf("%02d시간 %02d분 입니다", hour, minute);
		else
			System.out.printf("%02d분입니다", minute);
		
		sc.close();
		
	}
}
