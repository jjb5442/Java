package object;

class Circle {
    double radius;
    double perimeter;
    double area;
    double pi = 3.14;
    
    Circle() { this(1); }
    Circle(double radius) {
        this.radius = radius;
        this.perimeter = radius * 2 * pi;
        this.area = radius * radius * pi;
    }
    Circle(int radius) {
        this((double)radius);
    }
    void show() {
        System.out.printf("Radius : %.2f, Perimeter : %.2f, Area : %.2f\n", radius, perimeter, area);
    }
}

public class Quiz01 {
    public static void main(String[] args) {
        // 원을 나타내는 객체를 생성하려고 한다
        // 생성자 매개변수에는 반지름(radius)를 전달하여 객체를 생성할 수 있다
        // show() 매서드는 원의 반지름, 원의 둘레, 원의 넓이를 소수점 둘째자리까지 출력한다
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(2.4);

        c1.show();
        c2.show();
        c3.show();
    }
}
