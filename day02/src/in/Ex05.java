package in;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		System.out.println("이름 입력 : ");
		name = sc.next();
		
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.println("국어 점수 : ");
		eng = sc.nextInt();
		
		System.out.println("국어 점수 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		String form = "%s의 합계는 %d접이고, 평균은 %.2f점입니다\n";
		System.out.printf(form, name, sum, avg);
		
		sc.close();
	}
}
