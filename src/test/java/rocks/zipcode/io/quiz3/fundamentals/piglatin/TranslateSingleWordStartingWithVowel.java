package rocks.zipcode.io.quiz3.fundamentals.piglatin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.PigLatinGenerator;

/**
 * @author leon on 09/12/2018.
 */
public class TranslateSingleWordStartingWithVowel {
    private PigLatinGenerator p;

    @Before
    public void setUp() throws Exception {
        this.p = new PigLatinGenerator();
    }

    @Test
    public void testegg() {
        Assert.assertEquals("eggway", p.translate("egg"));
    }

    @Test
    public void testapple() {
        Assert.assertEquals("appleway", p.translate("apple"));
    }
}
