package StigeSpill;
/**
 * Klasse for å representere ei rute for eit StigeSpill Brett
 * @author Sander Mikael Løtuft
 */
public class Rute {
    private Integer id;
    private Rute stigeRute;
    private Rute slangeRute;

    /**
     * Lager en rute uten slange eller stige. Med gitt id
     * @param id
     */
    public Rute(Integer id) {
        this.id = id;
    }

    /**
     * Henter id'en til gitt rute
     * @return id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Henter ein peker til ruten ein stige leder til om den eksisterer.
     * Altså om ei rute har ein stige returnerer metoden ein peker til
     * nye ruten.
     * @return peker til stigeBotn
     */
    public Rute getStigeRute() {
        return stigeRute;
    }

    /**
     * Henter ein peker til ruten ein slange leder til om den eksisterer.
     * Altså om ei rute har ein slange returnerer metoden ein peker til
     * nye ruten.
     * @return peker til slangeTop
     */
    public Rute getSlangeRute() {
        return slangeRute;
    }

    /**
     * Lager en ny stige mellom to this.rute og gitt rute
     * @param stigeRute
     */
    public void setStige(Rute stigeRute) {
        this.stigeRute = stigeRute;

    }

    /**
     * Lager en ny slange mellom to this.rute og gitt rute
     * @param slangeRute
     */
    public void setSlange(Rute slangeRute) {
        this.slangeRute = slangeRute;
    }
}
