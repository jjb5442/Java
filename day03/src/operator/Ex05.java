package operator;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gender, weight;
		System.out.println("gender (1. man, 2. woman) : ");
		gender = sc.nextInt();
		System.out.println("Insert weight(kg) : ");
		weight = sc.nextInt();
		
		boolean canPlay = (gender % 2 == 0) && (50 <= weight && weight <= 56);
		System.out.println("Can play : " + canPlay);
		
		
		int cash, card;
		System.out.println("Cash : ");
		cash = sc.nextInt();
		
		System.out.println("Card : ");
		card = sc.nextInt();
		
		boolean canTakeTaxi = (cash >= 7000) || (card >= 7000);
		System.out.println("Can take Taxi : " + canTakeTaxi);
		sc.close();
		
		int num = 3;
		boolean flag = num % 2 != 0;
		
		if (flag == false) {
			System.out.println(num / 2);
		}
		else {
			System.out.println(num);
		}
	}
}
