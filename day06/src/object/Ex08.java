package object;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"A", "B", "C", null, null, "D"};

        System.out.println("Insert Search Name : ");
        String name = sc.next();
        String find = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(name)) {
                find = arr[i];
                break;
            }
        }
        if (find != null) {
            System.out.println("Search Result : " + find);
        }
        else {
            System.out.println("No One");
        }
        sc.close();
    }
}
