package object;

public class Ex01 {
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.name = "a"; s2.kor = 10; s2.eng = 20; s2.mat = 30;
        s2.show();
    }
}

class Student2 {
    String name;
    int kor, eng, mat, sum;
    double avg;

    void show() {
        System.out.println(name + " : " + kor + " " + eng + " " + mat + " " + sum);
    }
}
