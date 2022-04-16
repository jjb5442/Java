package operator;

public class Ex06 {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건에 따라 서로 다른 값을 결정한다
		
		int num = 5;
		String status = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(status);
	}
}
