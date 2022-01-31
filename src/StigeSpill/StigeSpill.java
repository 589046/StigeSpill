package StigeSpill;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å representere eit StigeSpill
 * @author Sander Mikael Løtuft
 */
public class StigeSpill {
    private Terning t1;
    private Terning t2;
    private Brett brett;
    private List<Spiller> spillere;
    private Boolean vunnet;

    public StigeSpill(List<Spiller> spillere) {
        this.t1 = new Terning();
        this.t2 = new Terning();
        this.brett = new Brett();
        this.spillere = spillere;
        this.vunnet = false;
    }

    /**
     * Spiller eit stige spill
     */
    public void spill() {
        brett.initBrett();
        for (Spiller s : spillere) {
            s.getBrikke().setRute(brett.getRuter().get(0));
        }
        while (!vunnet) {
            for (Spiller s : spillere) {
                t1.rull();
                t2.rull();
                Integer verdi = t1.getVerdi() + t2.getVerdi();
                System.out.print(s.getNavn() + " Terningkast: " + verdi
                        + ", " + s.getBrikke().getId() + " flyttes fra:" + s.getBrikke().getRute().getId());
                s.getBrikke().flyttBrikke(verdi, brett);
                System.out.println(" til: " + s.getBrikke().getRute().getId());
                vunnet = s.vunnet();
                if(vunnet) {
                    System.out.println("Gratulerer " + s.getNavn() + " vinner!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Spiller> spillere = new ArrayList<Spiller>();
        spillere.add(new Spiller("ole"));
        spillere.add(new Spiller("stig"));
        spillere.add(new Spiller("amel"));
        spillere.add(new Spiller("eirik"));

        StigeSpill spill = new StigeSpill(spillere);
        spill.spill();
    }
}