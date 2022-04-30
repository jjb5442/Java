package inheritance;

class Phone {
    void call() {
        System.out.println("Calling now");
    }
}

class SmartPhone extends Phone {
    void call() {
        System.out.println("Calling to Another SmartPhone");
    }
    void web() {
        System.out.println("Surfing now");
    }
}

public class Ex07 {
    public static void main(String[] args) {
        Phone ob1 = new Phone();
        ob1.call();
        SmartPhone ob2 = new SmartPhone();
        ob2.call();
        ob2.web();
    }
}
