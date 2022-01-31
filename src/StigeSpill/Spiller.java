package StigeSpill;
/**
 * Klasse for å representere ein StigSpill spiller
 * @author Sander Mikael Løtuft
 */
public class Spiller {
    private Brikke brikke;
    private String navn;

    /**
     * Lager en ny spiller med gitt navn
     * @param navn
     */
    public Spiller(String navn) {
        this.navn = navn;
        this.brikke = new Brikke(navn);
    }

    /**
     * Henter navnet til spilleren
     * @return
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Henter brikken til spilleren
     * @return
     */
    public Brikke getBrikke() {
        return brikke;
    }
    /**
     * Sjekker om spilleren har vunnet ved å finne ruten dens
     * og sjekker om den er lik 100(den siste ruten i eit brett)
     * @return True om spilleren har vunnet, false ellers.
     */
    public Boolean vunnet() {
        if (brikke.getRute().getId() < 100) {
            return false;
        }
        return true;
    }
}
