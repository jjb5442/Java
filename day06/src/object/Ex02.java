package object;

class Car {
    // 클래스 : 객체를 생성하기 위한 자료형, 변수와 함수를 만들 수 있다
    // 객체 : 클래스 자료형에 의해 생성된 데이터, 같은 클래스의 여러 객체가 존재할 수 있다

    // 클래스는 다음 요소로 구성될 수 있다
    // 1) 멤버 필드 (변수)      : 객체의 속성값을 저장하는 변수
    // 2) 멤버 메서드 (함수)    : 객체의 기능을 정의하는 함수
    // 3) 생성자 (함수)         : 객체를 생성하고, 객체 생성 시 초기 작동을 정의하는 함수
    // 4) 접근제한자            : 객체의 멤버 요소에 대한 외부로부터의 접근을 제어할 수 있는 예약어

    // 만약 자동차를 객체로 코드에서 표현하고 싶다면, 먼저 자동차가 어떻게 구성되어 있는지 정의한다
    // 속성 : 정적 데이터 
    // 기능 : 동적 코드

    // 단, 클래스는 실제 데이터를 만들기 위한 설계도와 같은 개념이다
    // 클래스를 이용하여 반드시 실제 객체를 만들고, 그를 이용한 코드를 진행해야 한다
}

class Character {   // 영화 및 드라마, 게임의 등장인물을 표현하기 위한 자료형
    String name;
    String actorName;
    int age;
    String comment;

    Character() {};

    Character(String name, String actorName, int age, String comment) {
        this.name = name;
        this.actorName = actorName;
        this.age = age;
        this.comment = comment;
    }

    void show() {
        System.out.printf("%s (%s) : %d, %s\n", name, actorName, age, comment);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Character c1 = new Character();
        c1.name = "a"; 
        c1.actorName = "AA";
        c1.age = 10;
        c1.comment = "Hello World";
        c1.show();

        Character c2 = new Character("b", "BB", 20, "Hello World!");
        c2.show();

        Character[] arr = { c1, c2 };
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
    }
}
