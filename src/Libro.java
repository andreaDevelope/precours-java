public class Libro {
    String titolo;
    String autore;
    short numeroPagine;

    public Libro(String titolo, String autore, short numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public void stampaDettagli() {
        System.out.println("TITOLO: " + this.titolo + "\nAUTORE: " + this.autore + "\nNUMERO PAGINE: " + this.numeroPagine);
    }
}
