package out;

public class Quiz04 {
	public static void main(String[] args) {
		// 1) 이름, 나이, 키, 체중을 한 줄에 출력하세요
		// 각 값은 모든 변수에 담겨 있는 상태로 사용
		// printf를 이용하여 서식에 맞게 출력하고, 키와 체중은 소수점 이하 둘째자리까지 출력
		String name = "Jaebin";
		double height = 181.12, weight = 57.12;
		String form = "Name : %s  Height : %.2f  Weight : %.2f\n\n";
		form = String.format(form, name, height, weight);
		System.out.printf(form);
				
		
		// 2) 주민등록번호 앞자리를 정수형 변수에 저장하고
		// 나눗셈의 몫과 나머지를 활용하여 별도의 변수에 따로 담은 다음
		// 생일은 년 월 일 입니다 형식으로 출력
		int id = 1004;
		int year, month, day;
		year = id / 10000; month = (id / 100) % 100; day = id % 100;
		System.out.printf("생일은 20%02d년 %d월 %d일 입니다\n\n", year, month, day);
		
		// 3) 아래 문장을 그대로 출력
		// He said "Great power comes great responsibility."
		System.out.println("He said \"Great power comes great responsibility.\"");
		System.out.printf("72.4%%");
	}
}
