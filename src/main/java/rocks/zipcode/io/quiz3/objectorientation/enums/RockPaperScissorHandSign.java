package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    PAPER("PAPER"),
    ROCK("ROCK"),
    SCISSOR("SCISSOR");

    private RockPaperScissorHandSign(String mySign){
        this.mySign=mySign;
    }
    private String mySign;

    public String getRockPaperScissorHandSign(){

        return this.mySign;
    }


    public RockPaperScissorHandSign getWinner() {

        return SCISSOR;


    }

    public RockPaperScissorHandSign getLoser() {

        return ROCK;
    }
}
