package inheritance;

// 클래스의 상속
// 기존에 만들어진 클래스의 내용을 그대로 물려받는다
// 기존 클래스 내용 그대로 똑같이 쓰고싶다면 굳이 상속할 필요없이 기존 클래스를 사용하면 된다
// 기존 클래스 내용을 그대로 물려받은 이후, 내가 추가하고 싶은 필드나 메서드를 추가로 작성할 수 있다
// 물려받은 메서드는 형식은 그대로 두고 내용만 바꿀 수도 있다

// 실제로 있는 객체들의 관계를 상속 관계에 있는 클래스로 표현하려면 범주상의 포함관계에 있어야 한다
// Student is Human  ->   class Student extends Human (0)

// 물리적 포함관계는 상속으로 처리하지 않는다 (내부 클래스로 처리)
// Tier included by Car -> class Tire extends Car (X)

class A {
    int x;
    int y;
}

class B extends A{
    int z;
}

public class Ex06 {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.x = 10;
        ob1.y = 20;
        System.out.println(ob1.x + ", " + ob1.y);

        B ob2 = new B();
        ob2.x = 100;
        ob2.y = 200;
        ob2.z = 300;
        System.out.println(ob2.x + ", " + ob2.y + ", " + ob2.z);
    }
}
