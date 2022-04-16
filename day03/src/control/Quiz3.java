package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 놀이기구 이용시간을 입력받아서 요금을 계산하여 출력하세요
		// 30분까지는 기본요금 3000	그 이후로는 10분당 500원
		// 요금표는 아래와 같습니다
		
		// 시간		금액
		//  0 ~ 30	3,000
		// 31 ~ 40	3,500
		// 41 ~ 50  4,000
		
		int time, price;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Using Time : ");
		time = sc.nextInt();
		
		if (time <= 30) price = 3000;
		else {
			price = 500 * ((time - 21) / 10) + 3000;
		}
		System.out.println("Please Pay Money : "  + price);
		sc.close();
	}	
}
