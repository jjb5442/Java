package dataType;

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 200;
		byte n2 = 100;
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		n1 = n2;
		n1 = 200;
		n2 = 100;
		
		n2 = (byte)n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
	}
}
