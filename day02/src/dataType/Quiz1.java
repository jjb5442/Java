package dataType;

public class Quiz1 {
	public static void main(String[] args) {
		byte by = 10;
		short sh = 20;
		char ch = 65;
		int num = 30;
		long lo = 40L;
		float fl = 3.14F;
		double db = 76.56;
		
		
		
		int a = by;				// promotion
		char b = (char)db;		// casting
		long c = sh;			// promotion
		float d = num;			// promotion
		short e = (short)ch;	// casting 		값의 표현범위가 다르다
		double f = by;			// promotion
		
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}
}
