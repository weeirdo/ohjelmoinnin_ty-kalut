import java.util.ArrayList;

/**
 * Luokka mallintaa yksinkertaista kirjahyllyä
 */
public class Kirjahylly {
    private ArrayList<String> kirjat;

    public Kirjahylly() {
        this.kirjat = new ArrayList<>();
    }

    /**
     * Lisää yhden kirjan hyllyyn
     * @param kirja lisättävä kirja
     */
    public void lisaaKirja(String kirja) {
        kirjat.add(kirja);
        kirjojaHyllyssa += 1;
    }

    /**
     * Palauttaa kirjahyllyyn viimeksi lisätyn kirjan
     * @return viimeksi lisätyn kirjan
     */
    public String viimeksiLisatty() {

        return kirjat.get(kirjat.size() - 1);
    }

    /**
     * Palauttaa tiedon siitä onko annettu kirja hyllyssä
     * @param kirja kirja, jota etsitään
     * @return <code>true</code>, jos kirjan on hyllyssä, muuten <code>false</code>
     */
    public boolean onkoKirjaHyllyssa(String kirja) {
        for (kirja: kirjat){
            return kirja == kirja;
        }
    }

    /**
     * Palautta kirjahyllyssä olevien kirjojen määrän
     * @return kirjojen määrän hyllyssä
     */
    public int getKirjojaHyllyssa() {

        return kirjat.size();
    }
}
