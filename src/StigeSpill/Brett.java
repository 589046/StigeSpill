package StigeSpill;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Klasse for å representere eit brett som blir brukt i eit StigeSpill
 * @author Sander Mikael Løtuft
 */
public class Brett {
    private List<Rute> ruter;

    /**
     * Lager et nytt brett med 100 ruter og tilfeldige stige og slanger
     */
    public Brett() {
        ruter = new ArrayList<Rute>();

        for(int i = 0; i < 100; i++) {
            Rute r = new Rute(i + 1);
            ruter.add(r);
        }

        Random r = new Random();
        for (int i = 0; i < 8; i++)  {
            Integer stigeBotnIndex = r.nextInt(3, 100);
            Integer stigeTopIndex = r.nextInt(stigeBotnIndex, 100);
            ruter.get(stigeBotnIndex).setStige(ruter.get(stigeTopIndex));
        }
        for (int i = 0; i < 8; i++)  {
            Integer slangeTopIndex = r.nextInt(3, 100);
            Integer slangeBotnIndex = r.nextInt(3, slangeTopIndex);
            ruter.get(slangeTopIndex).setSlange(ruter.get(slangeBotnIndex));
        }
    }

    /**
     * Henter rutene til eit gitt Brett
     * @return en List av Rute objekt.
     */
    public List<Rute> getRuter() {
        return ruter;
    }
}
