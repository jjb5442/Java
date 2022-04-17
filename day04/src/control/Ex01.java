package control;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Integer : ");
		int num = sc.nextInt();
		
		if (num == 1) 		System.out.println(1);
		else if (num == 2) 	System.out.println(2);
		else if (num == 3) 	System.out.println(3);
		else 				System.out.println("Nothing");
		
		switch(num) {
		case 1: System.out.println(1); break;
		case 2: System.out.println(2); break;
		case 3: System.out.println(3); break;
		default: System.out.println("Nothing"); 
		}
		
		
		sc.close();
	}
}
