package model;

public class Piece {
    private PieceName pieceName;
    private Field field;
    private boolean isWhite;

    public Piece(PieceName pieceName, Field field, boolean isWhite) {
        this.pieceName = pieceName;
        this.field = field;
        this.isWhite = isWhite;
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

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setField(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "pieceName=" + pieceName +
                ", field=" + field +
                ", isWhite=" + isWhite +
                '}';
    }
}
