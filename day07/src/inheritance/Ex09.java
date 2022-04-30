package inheritance;

import java.util.Scanner;

class Phone2 {
    Scanner sc = new Scanner(System.in);
    static int sequence;
    int id;

    Phone2() {
        sequence += 1000;
        this.id = sequence;
    }

    void sendMessage(Phone2 target) {
        System.out.printf("%d) Enter Message : ", target.id);
        String message = sc.nextLine();
        System.out.println();
        target.takeMessage(message, this);
    }

    void takeMessage(String message, Phone2 sender) {
        System.out.printf("%d) Message come from %d\n", id, sender.id);
        System.out.printf("%d : %s\n", sender.id, message);
    }
}

class SmartPhone2 extends Phone2 {
    void web() throws Exception {
        System.out.println("Enter URL : ");
        String url = sc.nextLine();
        Runtime rt = Runtime.getRuntime();
        String chrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        rt.exec(chrome + " " + url);
    }
}

public class Ex09 {
    public static void main(String[] args) throws Exception {
        Phone2 p1 = new Phone2();
        Phone2 p2 = new Phone2();

        p1.sendMessage(p2);

        SmartPhone2 p3 = new SmartPhone2();
        p3.sendMessage(p1);
        p3.web();

    }
}
