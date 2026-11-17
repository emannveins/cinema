
public class Main {

    public static void main(String[] args) {

        // Creazione del cinema
        Cinema cinema = new Cinema("Cinema Centrale");

        // Creazione dei film
        Film film1 = new Film(
            "Interstellar",
            "Fantascienza",
            169
        );

        Film film2 = new Film(
            "Inception",
            "Thriller",
            148
        );

        // Aggiunta dei film al catalogo
        cinema.aggiungiFilm(film1);
        cinema.aggiungiFilm(film2);

        // Visualizzazione catalogo
        cinema.visualizzaCatalogo();

        // Ricerca di un film
        Film filmScelto = cinema.cercaFilm("Interstellar");

        if (filmScelto != null) {

            // Creazione prenotazione
            Prenotazione prenotazione =
                new Prenotazione("Marco Rossi");

            // Aggiunta biglietti
            prenotazione.aggiungiBiglietto(
                new Biglietto(filmScelto.getTitolo(), "A1", false)
            );

            prenotazione.aggiungiBiglietto(
                new Biglietto(filmScelto.getTitolo(), "A2", true)
            );

            // Visualizzazione prenotazione
            prenotazione.visualizzaPrenotazione();

        } else {
            System.out.println("Film non trovato!");
        }
    }
}
