package by.belhard.j19.Homeworks.homework5.task2;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[5];
        authors[0] = new Author("Fedor", "Dostoevskiy", 3);
        authors[1] = new Author("Michail", "Bulgakov", 5);
        authors[2] = new Author("Michail", "Lermontov", 1);
        authors[3] = new Author("Vasil", "Bikov", 2);

        Book b1 = new Book("Norwegian wood", 1, authors, "paper");
        Book book1 = new Book("norwegian wood", 2, authors, "paper");

        System.out.println(book1.toString());


        book1.setNumberOfPages(1);
        System.out.println(book1.getNumberOfPages());


    }
}
