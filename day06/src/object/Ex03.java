package object;

class Drink {
    // 1) 멤버 필드, 객체의 속성을 저장하는 변수
    // 별도의 초가값이 없으면 0으로 초기화
    String name;
    int price;

    // 2) 멤버 메서드, 객체의 기능을 정의하는 함수
    // 함수 내에서 변수 선언, 연산, 제어문, 다른 함수 호출 등 대부분의 코드를 작성할 수 있다
    void show() {
        System.out.printf("%s : %,d\n", name, price);
    }
    void init(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Drink d1 = new Drink();
        d1.name = "A";
        d1.price = 800;

        Drink d2 = new Drink();
        d2.init("B", 1000);

        Drink d3 = new Drink();
        d3.init("C", 1200);

        Drink d4 = new Drink();
        d4.init("D", 500);

        Drink[] arr = { d1, d2, d3, d4};
        for (int i = 0; i < arr.length; i++) {
            Drink d = arr[i];
            d.show();
        } System.out.println();

        // Drink d5;
        // d5.name = "A";   The local variable d5 may not have been initialized

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].price > arr[j].price) {
                    Drink tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        } System.out.println();
        
    }
}
