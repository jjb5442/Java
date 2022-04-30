package polymorphism;

import javax.print.Doc;

// 다형성 : 자바의 객체는 하나의 객체가 다양한 형태로 취급될 수 있는 성격을 가진다
// 서브 클래스의 객체는 슈퍼클래스로도 참조할 수 있고, 서브클래스로도 참조할 수 있다

class Human {
    String name;
    Human(String name) {
        this.name = name;
    }
}

class Student extends Human {
    Student(String name) {
        super(name);
    }
}
class Actor extends Human {
    Actor(String name) {
        super(name);
    }
}
class Doctor extends Human {
    Doctor(String name) {
        super(name);
    }

    void emergency() {
        System.out.println("I'm Doctor. Starting First-aid");
    }
}

public class Ex12 {

    static void boardingPlane(Human customer) {
        System.out.println(customer.name);
    }
    public static void main(String[] args) {
        Student ob1 = new Student("A");
        Actor ob2 = new Actor("B");
        Doctor ob3 = new Doctor("C");

        Human h1 = ob1;
        Human h2 = ob2;
        Human h3 = ob3;

        boardingPlane(ob1);
        boardingPlane(ob2);
        boardingPlane(ob3);

        // 서브 클래스로 생성된 객체를 슈퍼클래스로 변환하는 작업을 up-casting이라고 한다
        // up-casting은 서로 다른 서브클래스마다 별도로 해줘야 하는 작업을 묶어서 처리할 수 있게 해준다

        Human[] arr = { h1, h2, h3 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
        }

        System.out.println(h3 == ob3);
        // h3.emergency();  // 같은 객체를 바라보고 있지만 Human형태로 참조하고 있으니 emergency() 호출 불가
        ob3.emergency();

        ((Doctor)h3).emergency();   // up-casting된 객체를 다시 원래의 자료형으로 바꾸는 작업
                                    // down-casting

        // ((Doctor)h2).emergency();
        // Exception in thread "main" java.lang.ClassCastException: polymorphism.Actor cannot be cast to polymorphism.Doctor

        if (h3 instanceof Doctor) {
            ((Doctor)h3).emergency();
        }
        if (h1 instanceof Doctor) {
            ((Doctor)h1).emergency();
        }

        // 고유 메서드는 다운캐스팅을 통해서 호출해야하지만
        // 오버라이딩 메서드는 형변환 없이 호출할 수 있다 (상속받아 물려받은 메서드니까 슈퍼클래스에도 있어서)
        // 슈퍼클래스에 정의된 내용으로 실행되지 않고, 서브클래스에 정의된 내용대로 실행된다
        
    }
}
