package function;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    static int getDistance(int user, int e) {
        int result = user - e;
        if (result < 0)
            result = -result;
        return result;
    }
    static int getMinimum(int a, int b, int c) {
        int min = a;
        if (min > b)    min = b;
        if (min > c)    min = c;
        return min;
    }
    public static void main(String[] args) {
        // 1) 사용자의 입력값과 각 층수와의 거리를 절대값으로 구할 수 있어야한다
        // 2) 3개의 거리값 중에서 최소값을 구해야 한다
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int a = ran.nextInt(15) + 1;
        int b = ran.nextInt(15) + 1;
        int c = ran.nextInt(15) + 1;

        System.out.printf("Elevator Position : %d, %d, %d\n", a, b, c);
        System.out.println("Insert Your Floor : ");
        int user = sc.nextInt();

        int distA = getDistance(user, a);
        int distB = getDistance(user, b);
        int distC = getDistance(user, c);

        int min = getMinimum(distA, distB, distC);

        if (min == distA)   System.out.println("A is Moving Now!!");
        else if (min == distB)   System.out.println("B is Moving Now!!");
        else if (min == distC)   System.out.println("C is Moving Now!!");

        sc.close();

        
    }
    
}
