package StigeSpill;
/**
 * Klasse for å representere ei brikke til eit StigeSpill
 * @author Sander Mikael Løtuft
 */
public class Brikke {
    private String id;
    private Rute rute;

    public Brikke(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Rute getRute() {
        return rute;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }

    /**
     * Flyttar ei brikke ei gitt lengde {terningKast} viss den kan.
     * Om den nye posisjonen til brikka er utfor brettet blir den ståande på tidleger posisjon.
     * @param terningKast
     * @param brett
     */
    public void flyttBrikke(Integer terningKast, Brett brett) throws IndexOutOfBoundsException {
        // -1 fordi rute ID er alltid ein meir enn idexen
        Rute nesteRute;
        if (rute.getId() + terningKast - 1 < 100) {
            nesteRute = brett.getRuter().get(rute.getId() + terningKast - 1);
            if (nesteRute.getStigeRute() != null)
                this.setRute(nesteRute.getStigeRute());
            else if (brett.getRuter().get(rute.getId() + terningKast - 1).getSlangeRute() != null)
                this.setRute(nesteRute.getSlangeRute());
            else
                this.setRute(nesteRute);
        }
    }
}

