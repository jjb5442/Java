package out;

public class Ex03 {
	public static void main(String[] args) {
		System.out.print("1");
		System.out.println("2");
		System.out.printf("3");
		
		System.out.print("4");
		System.out.println("5");
		System.out.printf("6");
		
		int n1 = 10;
		int n2 = 20;
		
		System.out.print(n1);
		System.out.println(n2);
		System.out.printf("%d, %d", n1, n2);
	
		String name = "정재빈";
		int age = 30;
		System.out.println(name + "의 나이는" + age + "살입니다");
		
		System.out.printf("%s의 나이는 %d살입니다\n", name, age);
		
//		서식 제어 문자 : printf 함수 등에서 문자열의 서식을 지정하는 특수한 문자
//		printf의 f는 form(형식) 을 의미한다
//		형식을 먼저 지정하고, 빈칸에 들어갈 값을 순서대로 나열하면 된다
		
//		이스케이프 시퀀스 : 글자로 나타지는 않지만, 특수한 기능을 수행하는 문자
//		\\ : \
//		\" : "
		
		System.out.printf("%s의 나이는 %d살이고, 키는 %fcm 입니다 \n", "AAA", 7, 141.2);
		                 
		System.out.printf("[%s]\n", "AAA");
		System.out.printf("[%10s]\n", "AAA");
		
		System.out.printf("[%d:%d]\n", 1, 10);
		System.out.printf("[%2d:%2d]\n", 1, 10);
		System.out.printf("[%02d:%02d]\n", 1, 10);	
		System.out.printf("[%,d]원\n", 1325000); 	// 천단위 구분 기호
		
		System.out.printf("[%f]\n", 3.14);
		System.out.printf("[%10f]\n", 3.14);
		System.out.printf("[%10.2f]\n", 3.14);
		
//		printf의 서식문자 활용 그대로, 출력 대신 문자열 변수에 저장할 수도 있다
		String result = String.format("%s의 나이는 %d살입니다\n", "단비", 5);
		System.out.println(result);
		
		String form = "국어 : %3d, 영어 : %3d, 수학 : %3d, 평균 : %.2f";
		int kor = 100, eng = 99, mat = 94;
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		form = String.format(form, kor, eng, mat, avg);
		System.out.println(form);
//		자바는 double이나 long도 가각 %f와 %d로 처리한다
		
		System.out.println("aaaa\ta");
		System.out.println("bb\tb");
		System.out.println("c\tc");
		
		System.out.println("A\rB"); // \r도 줄바꿈으로 작용한다
//		키보드의 Enter 키는 \r \n 두가지 값을 가진다
	}
}
