package array;

import java.util.Random;
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		// 1) 사용자에게 길이를 입력받아 입력받은 크기만큼의 배열을 생성하고 출력
		
		// 2) Random을 이용하여 배열의 각 멤버에 길이보다 작은 랜덤값을 넣고 출력
		
		// 3) [선택정렬 알고리즘] 을 검색해보고 가능하면 정렬한 후 다시 출력    오름차순으로
	int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        Random ran = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = ran.nextInt(num);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        int tmp = num;
        int k = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                if (arr[j] < tmp) {
                    tmp = arr[j];
                    k = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
            tmp = num;
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
	}
}
