package loop;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, ret = 0;
		
		System.out.println("Input Integer : ");
		num = sc.nextInt();
		
		System.out.println(num + " to Reverse");
		
		while(true) {
			ret += num % 10;
			ret *= 10;
			num /= 10;
			if (num < 10) {
				ret += num;
				break;
			}
		}
		System.out.println(ret);
		sc.close();
	}
}
