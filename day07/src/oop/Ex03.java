package oop;

// static : 객체마다 서로 다른 값을 가지지 않고, 클래스 자체에 연결된 속성 값
// 하나의 클래스로 여러 객체를 생성하면 객체마다 서로 다른 값을 가지게 된다
// 하지만 static 속성을 가지는 요소는 객체마다 서로 다른 값을 가지지 않고, 모두 같은 값을 가진다

class Human2 {
    String name;
    int age;
    static int eyeCount = 2;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void show() {
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        System.out.println();
    }
    void show2() {
        System.out.printf("%s has %d eyes\n", name, eyeCount);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Human2 ob1 = new Human2("A", 10);
        Human2 ob2 = new Human2("B", 20);
        ob1.show();
        ob2.show();

        // ob1.eyeCount = 3;    // 객체마다 가지는 값이 아니라
        Human2.eyeCount = 3;    // 클래스에 소속된 값이기 때문에 클래스.필드 형식으로 접근해야한다
        
        ob1.show2();
        ob2.show2();

    }
}
