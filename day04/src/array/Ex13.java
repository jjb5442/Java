package array;

import java.util.Random;

public class Ex13 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1;
		}
		
		System.out.print("3) arr : ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
		
	}
}
