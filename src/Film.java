public class Film {
    
    private String titolo;
    private String genere;
    private int durata;

    public Film(String titolo, String genere, int durata) {
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void visualizzaFilm() {
        System.out.println("===== FILM =====");
        System.out.println("Titolo: " + titolo);
        System.out.println("Tipologia: " + genere);
        System.out.println("Durata: " + durata + " minuti");
    }
}