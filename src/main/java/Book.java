public class Book {
    //Book should contain name,author,year of publish and ISBN
    private String name ;
    private String author ;
    private int pubYear ;
    private int isbn  ;

    public Book(String name, String author, int pubYear, int isbn) {
        this.name = name;
        this.author = author;
        this.pubYear = pubYear;
        this.isbn = isbn;
    }

    public Book() {
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pubYear=" + pubYear +
                ", isbn=" + isbn +
                '}';
    }
}
