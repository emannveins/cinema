public class Biglietto {

    private String titoloFilm;
    private String posto;
    private boolean ridotto;

    public Biglietto(String titoloFilm, String posto, boolean ridotto) {
        this.titoloFilm = titoloFilm;
        this.posto = posto;
        this.ridotto = ridotto;
    }

    public double calcolaPrezzo() {
        if (ridotto) {
            return 7.0;
        }

        return 10.0;
    }

    public void visualizzaBiglietto() {
        System.out.println("===== BIGLIETTO CINEMA =====");
        System.out.println("Film: " + titoloFilm);
        System.out.println("Posto: " + posto);
        System.out.println("Tipo: " + (ridotto ? "Ridotto" : "Intero"));
        System.out.println("Prezzo: " + calcolaPrezzo() + " euro");
    }
}