public class Main {


    public static void main(String[] args) {
        // ДЗ 1.9
        // Book
        Book warAndPeace = new Book("War and Peace", new Author("Lev", "Tolstoy"), 2000);
        Book muMu = new Book("Mu-Mu", new Author ("Ivan", "Turgenev"), 1900);

        System.out.println("warAndPeace.getTitleOfTheBook() = " + warAndPeace.getTitleOfTheBook());
        System.out.println("warAndPeace.getYeaOfPublication() = " + warAndPeace.getYeaOfPublication());

        warAndPeace.setYeaOfPublication(1969);
        System.out.println("warAndPeace.getYeaOfPublication() = " + warAndPeace.getYeaOfPublication());

        System.out.println("muMu.getTitleOfTheBook() = " + muMu.getTitleOfTheBook());
        System.out.println("muMu.getYeaOfPublication() = " + muMu.getYeaOfPublication());

        // Author
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author ivanTurgenev = new Author("Ivan","Turgenev");

        System.out.println("levTolstoy.getAuthorFirstName() = " + levTolstoy.getAuthorFirstName());
        System.out.println("levTolstoy.getAuthorLastName() = " + levTolstoy.getAuthorLastName());
        System.out.println("ivanTurgenev.getAuthorFirstName() = " + ivanTurgenev.getAuthorFirstName());
        System.out.println("ivanTurgenev.getAuthorLastName() = " + ivanTurgenev.getAuthorLastName());

        System.out.println(warAndPeace.getTitleOfTheBook() + " " + warAndPeace.getAuthor().getAuthorFirstName() + " " + warAndPeace.getAuthor().getAuthorLastName() + " " + warAndPeace.getYeaOfPublication());

        // ДЗ 1.10
        System.out.println(warAndPeace);
        System.out.println(levTolstoy);

        System.out.println(levTolstoy.hashCode());
        System.out.println(ivanTurgenev.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(muMu.hashCode());
        System.out.println(warAndPeace.equals(muMu));
        System.out.println(levTolstoy.equals(ivanTurgenev));

    }
}