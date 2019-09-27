package model;

public class Piece {
    private PieceName pieceName;
    private Field field;
    private boolean isBlack;//otherwise white

    public Piece(PieceName pieceName, Field field, boolean isBlack) {
        this.pieceName = pieceName;
        this.field = field;
        this.isBlack = isBlack;
    }

    public PieceName getPieceName() {
        return pieceName;
    }

    public void setPieceName(PieceName pieceName) {
        this.pieceName = pieceName;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public boolean getIsBlack() {
        return isBlack;
    }

    public void setField(boolean isBlack) {
        this.isBlack = isBlack;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "pieceName=" + pieceName +
                ", field=" + field +
                ", isBlack=" + isBlack +
                '}';
    }
}
