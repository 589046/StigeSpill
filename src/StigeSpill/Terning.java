package StigeSpill;
/**
 * Klasse for å representere ein terning til eit StigeSpill
 * @author Sander Mikael Løtuft
 */
import java.util.Random;

public class Terning {
    Integer verdi;
    Random r;

    /**
     * Lager ein ny Terning
     */
    public Terning() {
        verdi = 0;
        r = new Random();
    }

    /**
     * Gir terningen ein ny tilfeldig verdi mellom 1 og 6.
     */
    public void rull() {
        verdi = r.nextInt(1,7);
    }

    /**
     * Henter verdien til gitt terning
     * @return vedien til terningen som int
     */
    public Integer getVerdi() {
        return verdi;
    }
}
