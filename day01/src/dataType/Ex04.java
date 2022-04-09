package dataType;

public class Ex04 {
	public static void main(String[] args) {
		// 예제) 3과목의 점수를 정수로 지정하고, 합계와 평균 구하여 출력하기
		// 단, 평균은 실수형태로 출력하기 (소수점 이하 자리가 출력되어야 함)
		int kor = 100, eng = 99, mat = 87, sum = 0;
		double avg;
		
		sum = kor + eng + mat;
		avg = (double)sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
