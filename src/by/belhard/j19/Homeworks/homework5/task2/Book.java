package by.belhard.j19.Homeworks.homework5.task2;

public class Book {

    private String title;
    private int numberOfPages;
    private Author[] authors;
    private String format;

    public Book(String title, int numberOfPages, Author[] authors, String format) {

        if (title == null) {
            this.title = "Cool book";
        } else {
            this.title = title;
        }
        if (numberOfPages < 2) {
            this.numberOfPages = 100;
        } else {
            this.numberOfPages = numberOfPages;
        }

        this.format = format;
        this.authors = authors;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            this.title = "New book";
        } else {
            this.title = title;
        }
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages < 2) {
            this.numberOfPages = 100;
        } else {
            this.numberOfPages = numberOfPages;
        }
    }


    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author=" + authors +
                ", format='" + format + '\'' +
                '}';
    }
}
