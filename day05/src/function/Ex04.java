package function;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // A, B, C 3개의 엘리베이터가 있다
        // 각 엘리베이터는 현재 층이 랜덤으로 정해지고
        // 사용자가 입력한 숫자에 가장 가까운 엘리베이터가 이동하면 된다
        // 건물의 높이는 지상 1층에서 지상 15층까지

        // 현재 사용자의 위치와, 각 엘리베이터의 거리 중 최소값을 구해야 한다
        // 거리는 음수가 나오면 안 된다 (절대값)
        // 서로 다른 3개의 정수중에서 최소값을 찾아야 한다

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        int a, b, c, user;
        a = ran.nextInt(15) + 1;
        b = ran.nextInt(15) + 1;
        c = ran.nextInt(15) + 1;

        System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
        System.out.println("Insert Your Floor : ");
        user = sc.nextInt();
        
        int distA, distB, distC;
        distA = user - a;
        distB = user - b;
        distC = user - c;

        distA = distA < 0 ? -distA : distA;
        distB = distB < 0 ? -distB : distB;
        distC = distC < 0 ? -distC : distC;

        int min = 16;
        String minString = "";
        if (min > distA) {
            min = distA;
            minString = "A";
        }
        if (min > distB) {
            min = distB;
            minString = "B";
        }
        if (min > distC) {
            min = distC;
            minString = "C";
        }

        System.out.printf("a : %d, b : %d, c : %d\n", distA, distB, distC);
        System.out.println(minString);
        sc.close();
        
    }
    
}
