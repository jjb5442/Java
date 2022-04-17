package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Random ran = new Random();
		int answer = ran.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Find Answer : ");
		while(answer != input) {
			input = sc.nextInt();
			if (answer > input)	System.out.println("UP");
			if (answer < input) System.out.println("DOWN");
		}
		System.out.println("Answer!!");
		sc.close();
		
	}
}
