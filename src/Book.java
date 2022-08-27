public class Book {

    private final String titleOfTheBook;
    private final Author authorName;
    private int yeaOfPublication;


    public Book(String titleOfTheBook, Author authorName, int yeaOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.authorName = authorName;
        this.yeaOfPublication = yeaOfPublication;
    }

    public String gettitleOfTheBook() {
        return this.titleOfTheBook;
    }

    private Author getAuthorName() {
        return this.authorName;
    }

    public int getyeaOfPublication() {
        return this.yeaOfPublication;
    }

    public void setyeaOfPublication(int yeaOfPublication) {
        this.yeaOfPublication = yeaOfPublication;
    }
}


