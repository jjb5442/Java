package operator;

public class Ex07 {
	public static void main(String[] args) {
		// 간단한 비트 연산자 활용
		
		int num = 4;
		
		int n1 = num >> 1;
		int n2 = num << n1 * 2;
		System.out.println(n1);	// == *2
		System.out.println(n2); // == /2
	}
}
