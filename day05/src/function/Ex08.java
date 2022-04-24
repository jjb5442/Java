package function;

public class Ex08 {
    static int summary(int a, int b) {
        int sum = 0;
        if (b - a < 0) 
            sum = -(b - a - 1) * (a + b) / 2;
        else
        sum = (b - a + 1) * (a + b) / 2;
        return sum;
    }
    static int summary(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    static int summary(int a) {
        return summary(1, a);
    }
    public static void main(String[] args) {
        // 특정 구간 혹은 여러 정수의 합계를 구하여 반환하는 함수

        // 1) 두 정수를 전달받아서 두 수 사이의 합계를 반환
        int n1 = summary(1, 10);
        int n2 = summary(15, 5);

        // 2) 정수 형태의 배열을 전달받아서 배열 요소의 합계를 반환
        int[] arr = { 2, 7, 8, 4, 6 };
        int n3 = summary(arr);

        // 3) 정수를 하나 전달받아서, 1부터 전달받은 수까지의 합계를 반환
        int n4 = summary(10);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
