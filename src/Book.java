public class Book {

    private final String titleOfTheBook;
    private Author authorFullName;
    private int yeaOfPublication;


    public Book(String titleOfTheBook, Author authorFullName, int yeaOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.authorFullName = authorFullName;
        this.yeaOfPublication = yeaOfPublication;
    }


    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

 //    String getAuthorFullName() {
//        return String.valueOf(this.authorFullName);
//    }

    public int getYeaOfPublication() {
        return this.yeaOfPublication;
    }

    public void setYeaOfPublication(int yeaOfPublication) {
        this.yeaOfPublication = yeaOfPublication;
    }

    public Author getAuthorFullName() {
        this.authorFullName = authorFullName();
        return authorFullName;
    }
}


