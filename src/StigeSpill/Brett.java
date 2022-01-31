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
     * Lager et nytt brett med 100 ruter
     */
    public Brett() {
        ruter = new ArrayList<Rute>();

        for(int i = 0; i < 100; i++) {
            Rute r = new Rute(i + 1);
            ruter.add(r);
        }
    }

    /**
     * Lager forhåndsbestemte stiger og slanger
     */
    public void initBrett() {
        ruter.get(1).setStige(ruter.get(37));
        ruter.get(3).setStige(ruter.get(13));
        ruter.get(7).setStige(ruter.get(30));
        ruter.get(27).setStige(ruter.get(53));
        ruter.get(20).setStige(ruter.get(41));
        ruter.get(50).setStige(ruter.get(66));
        ruter.get(79).setStige(ruter.get(99));
        ruter.get(70).setStige(ruter.get(89));

        ruter.get(97).setSlange(ruter.get(77));
        ruter.get(94).setSlange(ruter.get(74));
        ruter.get(91).setSlange(ruter.get(72));
        ruter.get(86).setSlange(ruter.get(23));
        ruter.get(63).setSlange(ruter.get(59));
        ruter.get(91).setSlange(ruter.get(17));
        ruter.get(57).setSlange(ruter.get(52));
        ruter.get(46).setSlange(ruter.get(25));
        ruter.get(48).setSlange(ruter.get(10));
        ruter.get(14).setSlange(ruter.get(5));
    }

    /**
     * Lager eit brett med tilfeldige stiger og slanger
     */
    public void initRandomBrett() {
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
