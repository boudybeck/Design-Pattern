package model;

public enum PieceDefinition {
    KING("King","K",100,1),
    QUEEN("Queen","Q",9,1),
    ROOK("Rook","R",5,2),
    BISHOP("Bishop","B",3,2),
    KNIGHT("Knight","K",3,2),
    PAWN("Pawn","P",1,8);

    private String fullName
    , abbrName;
    private int value
    , number;

    PieceDefinition(String fullName, String abbrName, int value, int number) {
        this.fullName = fullName;
        this.abbrName = abbrName;
        this.value = value;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAbbrName() {
        return abbrName;
    }

    public int getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
