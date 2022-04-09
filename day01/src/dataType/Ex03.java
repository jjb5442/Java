package dataType;

public class Ex03 {
	public static void main(String[] args) {
		// 예시) 올해연도와 출생년도를 변수로 선언하고 우리나라식의 나이를 출력하세요
		int currentYear = 2022;
		int birthYear = 2000;
		
		int age = currentYear - birthYear + 1;
		System.out.println("올해 나이는" + age + "살입니다");
		System.out.println();
		
		// 예시2) 원하는 시간을 초 단위롤 변수에 저장하고, 그 값은 분과 초로 나누어서 출력하세요
		int time = 500;
		int min, sec;
		
		min = time / 60;
		sec = time % 60;
		
		System.out.println(time + "초는 " + min + "분" + sec + "초입니다");
	}
}
