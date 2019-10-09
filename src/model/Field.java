package model;

public class Field extends ChessBoardElement {
    private int rank;
    private char line;
    private String coordinate;

    public Field(char line, int rank) {
        this(line, rank, false, null);
    }

    public Field(char line, int rank, boolean isWhite, String coordinate) {
        super(isWhite);
        this.rank = rank;
        this.line = line;
        if (!isWhite){
            this.setColor(this.setColor());
        }
        this.coordinate = coordinate;
        if (coordinate == null){
            this.setCoordinate();
        }
    }


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public char getLine() {
        return line;
    }

    public void setLine(char line) {
        this.line = line;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    private void setCoordinate() {
        this.coordinate = Character.toString(line) + rank;
    }

    // A1 -> 00 -> 0 = even, 0 = even --> color = black
// A2 -> 01 -> 0 = even, 1 =  odd --> color = white
// B1 -> 10 -> 1 =  odd, 0 = even --> color = white
// B2 -> 11 -> 1 =  odd, 1 =  odd --> color = black
// H8 -> 77 -> 7 =  odd, 7 =  odd --> color = black
    private void setColor(int[] octals){
        super.setIsWhite(octals[0] % 2 != octals[1] % 2);
    }

    private int[] setColor(){
        final int CHAR_TO_NUMBER = 65;
        int[] octals = new int[2];
        octals[0] = line - CHAR_TO_NUMBER;//A->0,B->1,...,H->7
        octals[1] = rank - 1;//0..7
        return octals;
    }

    @Override
    public void draw(ChessBoardElement field){
        System.out.println("Drawing " + field);
    };

    @Override
    public String toString() {
        return super.getColor(super.getIsWhite()) + " field " + coordinate;
    }
}
