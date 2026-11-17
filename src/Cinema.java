
import java.util.ArrayList;

public class Cinema {

    private String nome;
    private ArrayList<Film> catalogo;

    public Cinema(String nome) {
        this.nome = nome;
        this.catalogo = new ArrayList<>();
    }

    public void aggiungiFilm(Film film) {
        if (film != null) {
            catalogo.add(film);
            System.out.println("Film aggiunto al catalogo!");
        }
    }

    public Film cercaFilm(String titolo) {

        for (Film film : catalogo) {
            if (film.getTitolo().equalsIgnoreCase(titolo)) {
                return film;
            }
        }

        return null;
    }

    public void visualizzaCatalogo() {

        System.out.println("===== " + nome + " =====");

        for (Film film : catalogo) {
            film.visualizzaFilm();
            System.out.println("-------------------");
        }
    }
}
