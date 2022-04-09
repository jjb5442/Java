package dataType;

public class Quiz2 {
	public static void main(String[] args) {
		// 체질량지수 = 몸무게 / 키의 제곱
		// 정수형태로 키와 몸무게를 변수로 선언
		// ~ 18.5 	: 저체중
		// ~ 23 	: 정상
		// ~ 25 	: 과체중
		// 25 ~		: 비만
		int height = 181, weight = 57;
		double bmi;
		bmi = weight / ((height * 0.01) * (height * 0.01));
		System.out.println(bmi);
	}
}
