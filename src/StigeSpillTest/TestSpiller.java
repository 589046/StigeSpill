package StigeSpillTest;

import StigeSpill.Brikke;
import StigeSpill.Rute;
import StigeSpill.Spiller;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class TestSpiller {

    @Test
    public void testVunnet() {
        Spiller s1 = new Spiller("1");
        Spiller s2 = new Spiller("1");
        Rute r1 = new Rute(100);
        Rute r2 = new Rute(5);

        s1.getBrikke().setRute(r1);
        s2.getBrikke().setRute(r2);

        assertTrue("", s1.vunnet());
        assertFalse("", s2.vunnet());
    }

}
