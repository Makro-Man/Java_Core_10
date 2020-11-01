package ua.lviv.lgs.palidrom;

public class Wrong extends Exception {

    private StringBuffer wrong;
    public StringBuffer getWrong() {
        return wrong;
    }

    public Wrong(StringBuffer wrong) {
        super(String.valueOf(wrong));
        this.wrong = wrong;
    }
}
