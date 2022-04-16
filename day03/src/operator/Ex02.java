package operator;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		
		System.out.printf("%d > %d : %s\n", n1, n2, n1 > n2);
		System.out.printf("%d == %d : %s\n", n1, n2, n1 == n2);
		System.out.printf("%d >= %d : %s\n", n1, n2, n1 >= n2);
		System.out.printf("%d < %d : %s\n", n1, n2, n1 < n2);
		System.out.printf("%d <= %d : %s\n", n1, n2, n1 <= n2);
		
		Scanner sc = new Scanner(System.in);
		
		String name, adult;
		int age;
		
		System.out.println("이름 입력 : ");
		name = sc.next();
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		
		if(age >= 20) {
			adult = "성인";
		}
		else {
			adult = "미성년자";
		}
		System.out.printf("%s는 %d살이고, %s입니다\n", name, age, adult);
		sc.close();
	}
}
