package function;

public class Ex02 {
    static int add(int n1, int n2) {
        int num = n1 + n2;
        return num;
    }
    public static void main(String[] args) {
        int n = add(10, 20);
        System.out.println("n : " + n);
    }
}
