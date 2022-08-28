public class Book {

    private final String titleOfTheBook;
    private Author author;
    private int yeaOfPublication;


    public Book(String titleOfTheBook, Author authorFullName, int yeaOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.yeaOfPublication = yeaOfPublication;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYeaOfPublication() {
        return this.yeaOfPublication;
    }

    public void setYeaOfPublication(int yeaOfPublication) {
        this.yeaOfPublication = yeaOfPublication;
    }

    public Author getAuthor() {

    }
}


