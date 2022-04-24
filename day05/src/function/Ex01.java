package function;

public class Ex01 {
    static String a(int money) {
        if(money == 500)        return "Sprite";
        else if (money == 600)  return "coke";
        else if (money == 800)  return "drink";
        else                    return null;
    }
    public static void main(String[] args) {
        String test1 = a(500);
        String test2 = a(600);
        String test3 = a(700);
        String test4 = a(800);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}
