package object;

import java.util.Scanner;

class Student {
    String name;
    int kor, eng, mat, sum;
    double avg;

    Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = kor + eng + mat;
        this.avg = sum / 3.0;
    }
    void show() {
        System.out.printf("%s) %d, %6.2f\n", name, sum, avg);
    }
}

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[10];
        arr[0] = new Student("A", 100, 99, 87);
        int menu;
        String name = null;

        System.out.println("1. Menu");
        System.out.println("2. Add");
        System.out.println("3. Sort");
        System.out.println("4. Search");
        System.out.println("5. Delete");
        System.out.println("0. Exit");
        do {
            System.out.print(">>> ");
            menu = sc.nextInt();
            
            switch(menu) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null) {
                        arr[i].show();
                    }             
                }    
                break;
            case 2:
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == null) {
                        System.out.println("Insert Name and Score");         
                        arr[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                        break;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[i] != null && arr[j] != null && arr[i].avg < arr[j].avg) {
                            Student tmp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = tmp;
                        }
                    }
                }
                break;
            case 4:
                name = null;
                name = sc.next();
                
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null && arr[i].name.equals(name)) {
                        arr[i].show();
                        break;
                    }                        
                }
                if (name == null) System.out.println("Not Found");
                break;
            case 5:
                name = null;
                name = sc.next();

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null && arr[i].name.equals(name)) {
                        System.out.println("Delete : " + name);              
                        arr[i] = null;
                        break;
                    }                        
                }
                break;
            case 0:
                sc.close();
                return;
            default:
            System.out.println("Insert Correct Number");
            }
        } while(true);
    }  
}
