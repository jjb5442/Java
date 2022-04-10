package wrapperClass;

public class Ex02 {
	public static void main(String[] args) {
		int num = 10;		// 비객체형
		Integer num2 = 10;	// 객체형
		
//		num.
//		num2.
		
		// 1) 자신과 호환되는 primitive 타입과 1:1 대응된다
		// 2) primitive 간에는 유형만 맞으면 값을 옮겨담을 수 있다
		// 3) Wrapper Class 간에는 유형이 맞아도 값을 옮겨담을 수 없다
		// -> 타입 체크가 좀 더 자세해야 한다
		
		byte by = 1;
		num = by;	// primitive 라면 같은 정수끼리 혹은 정수 및 실수 끼리 값을 옮겨담는다
		
		double db = num;
		
		// Wrapper Class 는 명확하게 일치할 경우에만 옮겨담을 수 있다
//		num2 = by;	X
		
		Byte b2 = 20;
		num2 = (int)(byte)b2;
		num2 = b2.intValue();
		
	}
}
