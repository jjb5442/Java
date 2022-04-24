package object;

class Pos {
    int x;
    int y;

    void showPos() {
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println();
    }

    Pos() {
        // 생성자 내부에서 또다른 생성자를 호출
        // Pos(1, -1);  => 생성자 이름으로 호출하는 것은 클래스 외부에서만 가능하다

        // System.out.println("Hello World!"); =>  X
        this(1, -1);
        
        // 생성자 내부에서 다른 생성자를 호출하는 것은 첫번째 줄에서만 가능하다
        // 클래스를 본따서 객체를 생성 -> 추가작업 진행
    }
    
    // 생성자 (정수 2개를 받아서 각각 x와 y에 대입하는 기능 포함)
    Pos(int x, int y) {
        this.x = x;
        this.y = y;
        // 매개변수를 받는 생성자를 작성했기 때문에, 자동으로 기본생성자가 만들어지지 않는다
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Pos ob1 = new Pos(2, 3);    // 객체를 생성하면서 초기값을 지정할 수 있다
        ob1.showPos();

        Pos ob2 = new Pos(11, 7);
        ob2.showPos();

        Pos ob3 = new Pos();
        ob3.showPos();
    }
}
