public class Main {


    public static void main(String[] args) {

        // Book
        Book warAndPeace = new Book("War and Peace", new Author("Lev Tolstoy"), 2000);
        Book muMu = new Book("Mu-Mu", new Author ("Ivan Turgenev"), 1900);

        System.out.println("warAndPeace.gettitleOfTheBook() = " + warAndPeace.gettitleOfTheBook());
        System.out.println("warAndPeace.getyeaOfPublication() = " + warAndPeace.getyeaOfPublication());


        warAndPeace.setyeaOfPublication(1969);
        System.out.println("warAndPeace.getyeaOfPublication() = " + warAndPeace.getyeaOfPublication());

        System.out.println("muMu.gettitleOfTheBook() = " + muMu.gettitleOfTheBook());
        System.out.println("muMu.getyeaOfPublication() = " + muMu.getyeaOfPublication());


        // Author
        Author levTolstoy = new Author("Lev Tolstoy");
        Author ivanTurgenev = new Author("Ivan Turgenev");

        System.out.println("levTolstoy.authorName = " + levTolstoy.getAuthorName());
        System.out.println("ivanTurgenev.authorName = " + ivanTurgenev.getAuthorName());
        System.out.println("ivanTurgenev.authorName = " + ivanTurgenev.getAuthorName());
    }
}