package oop;

import java.util.Arrays;
import java.util.Random;

class Student {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int sum;
    private double avg;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return this.eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return this.mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        this.sum = kor + eng + mat;
        return this.sum;
    }

    public double getAvg() {
        this.avg = sum / 3.0;
        return this.avg;
    }
    
}

class Student2 {
    String name;
    int[] scores = new int[100];
    int sum;
    double avg;
}

public class Quiz01 {
    public static void main(String[] args) {
        Student st = new Student();
        // System.out.printf(format, st.name, st.kor, st.eng, st.mat, st.sum, st.avg);
        
        st.setName("A"); st.setKor(10); st.setEng(20); st.setMat(30);
        String format = "%s : %d, %d, %d \t (%d, %.2f)\n";
        System.out.printf(format, st.getName(), st.getKor(), st.getEng(), st.getMat(), st.getSum(), st.getAvg());

        Student2 st2 = new Student2();
        Random ran = new Random();
        for (int i = 0; i < st2.scores.length; i++) {
            st2.scores[i] = ran.nextInt(100) + 1;
            st2.sum += st2.scores[i];
        }
        st2.avg = st2.sum / (double) st2.scores.length;

        System.out.printf("%d / %.2f\n", st2.sum, st2.avg);
        System.out.println(Arrays.toString(st2.scores));

    }
}
