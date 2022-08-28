public class Main {


    public static void main(String[] args) {

        // Book
        Book warAndPeace = new Book("War and Peace", new Author("Lev", "Tolstoy"), 2000);
        Book muMu = new Book("Mu-Mu", new Author ("Ivan", "Turgenev"), 1900);

        System.out.println("warAndPeace.getTitleOfTheBook() = " + warAndPeace.getTitleOfTheBook());

        System.out.println(warAndPeace.getAuthorFullName());
        System.out.println(warAndPeace.getAuthorFullName().getAuthorFirstName());

        System.out.println("warAndPeace.getYeaOfPublication() = " + warAndPeace.getYeaOfPublication());


        warAndPeace.setYeaOfPublication(1969);
        System.out.println("warAndPeace.getYeaOfPublication() = " + warAndPeace.getYeaOfPublication());

        System.out.println("muMu.getTitleOfTheBook() = " + muMu.getTitleOfTheBook());
        System.out.println("muMu.getYeaOfPublication() = " + muMu.getYeaOfPublication());


        // Author
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author ivanTurgenev = new Author("Ivan","Turgenev");


    }
}