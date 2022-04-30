package inheritance;

class Book {
    private String date;
    private String name;
    private String publisher;
    private int price;

    Book(String name, String date, String publisher, int price) {
        this.date = date;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }
    
    public void show() {
        System.out.printf("%s, %s, %s, %,d\n", name, date, publisher, price);
    }

    @Override
    public String toString() {
        String data = String.format("%s : %,d\n", name, price);
        return data;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Book[] arr = {
            new Book("A", "4.25", "Publish A", 12000),
            new Book("B", "4.26", "Publish B", 12500),
            new Book("C", "4.27", "Publish C", 13000)
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
