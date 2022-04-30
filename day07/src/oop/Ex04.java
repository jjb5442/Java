package oop;

class Member {
    String name;
    int age;

    static int instanceCount = 0;

    Member(String name, int age) {
        this.name = name;
        this.age = age;
        instanceCount++;
    }
    void show() {
        System.out.printf("%s : %d\n", name, age);
    }
    static void showInstanceCount() {
        System.out.println("Num of Instance : " + instanceCount);
        // System.out.println(name);   // static 메서드는 static 필드의 값만 참조할 수 있다
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Member ob = new Member("A", 10);
        Member ob2 = new Member("B", 20);

        Member.showInstanceCount();

        Member ob3 = new Member("C", 30);

        Member.showInstanceCount();

        ob.show();
        ob2.show();
        ob3.show();

    }
}
