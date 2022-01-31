package StigeSpillTest;

import StigeSpill.Brett;
import StigeSpill.Brikke;
import StigeSpill.Rute;
import StigeSpill.Spiller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBrikke {
    @Test
    public void testFlyttBrikke() {
        Brett brett = new Brett();
        brett.initBrett();

        Spiller s1 = new Spiller("1");
        Spiller s2 = new Spiller("2");
        Spiller s3 = new Spiller("3");
        Spiller s4 = new Spiller("4");

        s1.getBrikke().setRute(brett.getRuter().get(0));
        s2.getBrikke().setRute(brett.getRuter().get(0));
        s3.getBrikke().setRute(brett.getRuter().get(96));
        s4.getBrikke().setRute(brett.getRuter().get(93));

        s1.getBrikke().flyttBrikke(5, brett);
        s2.getBrikke().flyttBrikke(1, brett);
        s3.getBrikke().flyttBrikke(1, brett);
        s4.getBrikke().flyttBrikke(8, brett);

        assertEquals(6, s1.getBrikke().getRute().getId());
        assertEquals(38, s2.getBrikke().getRute().getId());
        assertEquals(78, s3.getBrikke().getRute().getId());
        assertEquals(94, s4.getBrikke().getRute().getId());
    }
}
