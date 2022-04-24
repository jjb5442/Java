package function;

public class Ex03 {
    static int reverse(int num) {
        int ret = 0;
        while (true) {
            ret += num % 10;
            ret *= 10;
            num /= 10;
            if (num < 10) {
                ret += num;
                break;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int n1 = reverse(1234);
        int n2 = reverse(13567);
        int n3 = reverse(123141);
        int n4 = reverse(9877655);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
