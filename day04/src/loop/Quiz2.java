package loop;

public class Quiz2 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			System.out.println("Hello World!");
			System.out.println();
		
		for (int i = 1; i <= 10; i++)
			System.out.print(i + " ");
			System.out.println();
			System.out.println();
		
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			sum += i;
		System.out.println("Sum : " + sum);
	}
}
