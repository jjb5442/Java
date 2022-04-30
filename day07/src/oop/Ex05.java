package oop;

// final : 내용을 변경할 수 없게 만드는 키워드 (변경불가, 상수화)

class Circle {
    int radius;
    static final double pi = 3.14; 
    // final은 변경불가이므로, 초기값을 반드시 지정해야함    
    // static 이므로 특정 원 뿐만 아니라 모든 원이 공유하는 값이 된다
}

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("perimeter : " + Circle.pi);
        // 객체 생성하기 전에도 값을 바로 참조할 수 있다
        Circle c = new Circle();
        c.radius = 3;
        System.out.printf("radius : %d, perimeter : %.2f\n", c.radius, c.pi);

    }
}
