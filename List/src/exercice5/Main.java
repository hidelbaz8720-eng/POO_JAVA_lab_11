package exercice5;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("111-2119731872", "Java", "auteur a");
        lib.addBookIndexed(b1);
        
        lib.borrowBook(b1, "hamza");
        System.out.println("Livre trouvé par ISBN : " + lib.findByIsbn("111-2119731872"));
    }
}
