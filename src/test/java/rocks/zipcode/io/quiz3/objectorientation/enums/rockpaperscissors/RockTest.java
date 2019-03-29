package rocks.zipcode.io.quiz3.objectorientation.enums.rockpaperscissors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz3.objectorientation.enums.RockPaperScissorHandSign;

/**
 * @author leon on 09/12/2018.
 */
public class RockTest {
    private RockPaperScissorHandSign sign;

    @Before
    public void setup() {
        // given
        this.sign = RockPaperScissorHandSign.valueOf("ROCK");
    }


    @Test
    public void testGetLoser() {
        RockPaperScissorHandSign loser = RockPaperScissorHandSign.valueOf("SCISSOR");
        Assert.assertEquals(loser, sign.getLoser());
    }

    @Test
    public void testGetWinner() {
        RockPaperScissorHandSign loser = RockPaperScissorHandSign.valueOf("PAPER");
        Assert.assertEquals(loser, sign.getWinner());
    }
}
