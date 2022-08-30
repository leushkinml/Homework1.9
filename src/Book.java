import java.util.Objects;

public class Book {

    private final String titleOfTheBook;
    private Author author;
    private int yeaOfPublication;


    public Book(String titleOfTheBook, Author author, int yeaOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yeaOfPublication = yeaOfPublication;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYeaOfPublication() {
        return this.yeaOfPublication;
    }

    public void setYeaOfPublication(int yeaOfPublication) {
        this.yeaOfPublication = yeaOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYeaOfPublication() == book.getYeaOfPublication() && getTitleOfTheBook().equals(book.getTitleOfTheBook()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitleOfTheBook(), getAuthor(), getYeaOfPublication());
    }

    @Override
    public String toString() {
        return "Книга: " +
                "заглавие: '" + titleOfTheBook + '\'' +
                ", автор: " + author +
                ", год издания: " + yeaOfPublication + ".";
    }
}


