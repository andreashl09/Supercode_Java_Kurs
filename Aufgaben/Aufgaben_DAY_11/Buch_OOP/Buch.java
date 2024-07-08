public class Buch {

    private String title;
    private String autor;
    private String isbn;
    private int seitenanzahl;

    public Buch() {

    }

    public Buch(String title, String autor, String isbn, int seitenanzahl) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.seitenanzahl = seitenanzahl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public String toString() {
        return "Buch{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", seitenanzahl=" + seitenanzahl +
                '}';
    }

    public void druckeDetails() {
        System.out.println(this.toString());
    }
}
