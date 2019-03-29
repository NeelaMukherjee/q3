package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if(this.equals(ROCK)) {
            return PAPER;
        } else if(this.equals(PAPER)) {
            return SCISSOR;
        } else {
            return ROCK;
        }
    }

    public RockPaperScissorHandSign getLoser() {
        return getWinner().getWinner();
    }
}
