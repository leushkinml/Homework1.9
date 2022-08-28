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

}


