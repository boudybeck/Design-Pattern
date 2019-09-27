package model;

public class Field {
    private boolean isWhite;
    private Rank rank;
    private Line line;

    public Field(Line line, Rank rank) {
        this(line, rank, false);
    }

    public Field(Line line, Rank rank, boolean isWhite) {
        super();
        this.isWhite = isWhite;
        this.rank = rank;
        this.line = line;
        setColor(setOctals());
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

// A1 -> 00 -> 0 = even, 0 = even --> color = black
// A2 -> 01 -> 0 = even, 1 =  odd --> color = white
// B1 -> 10 -> 1 =  odd, 0 = even --> color = white
// B2 -> 11 -> 1 =  odd, 1 =  odd --> color = black
// H8 -> 77 -> 7 =  odd, 7 =  odd --> color = black
    public void setColor(int[] octals){
        this.setWhite(octals[0] % 2 != octals[1] % 2);
    }

    public int[] setOctals(){
        int[] octals = new int[2];
        octals[0] = (int)line.getLine() - 65;//A->0,B->1,...,H->7
        octals[1] = rank.getRank() - 1;//0..7
        return octals;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Field{line=" + line +
                ", rank=" + rank +
                ", isWhite=" + isWhite +
                '}';
    }
}
