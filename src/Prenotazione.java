
import java.util.ArrayList;

public class Prenotazione {

    private String nomeCliente;
    private ArrayList<Biglietto> biglietti;

    public Prenotazione(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.biglietti = new ArrayList<>();
    }

    public void aggiungiBiglietto(Biglietto biglietto) {
        if (biglietto != null) {
            biglietti.add(biglietto);
            System.out.println("Biglietto aggiunto!");
        }
    }

    public double calcolaTotale() {

        double totale = 0;

        for (Biglietto biglietto : biglietti) {
            totale += biglietto.calcolaPrezzo();
        }

        return totale;
    }

    public void visualizzaPrenotazione() {

        System.out.println("===== PRENOTAZIONE =====");
        System.out.println("Cliente: " + nomeCliente);

        for (Biglietto biglietto : biglietti) {
            biglietto.visualizzaBiglietto();
        }

        System.out.println("------------------------");
        System.out.println("Totale: " + calcolaTotale() + " euro");
    }
}
