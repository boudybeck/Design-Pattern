package model;

public class Piece extends ChessBoardElement {
    private PieceDefinition pieceDefinition;
    private Field field;

    public Piece(PieceDefinition pieceDefinition, Field field, boolean isWhite) {
        super(isWhite);
        this.pieceDefinition = pieceDefinition;
        this.field = field;
    }

    public PieceDefinition getPieceDefinition() {
        return pieceDefinition;
    }

    public void setPieceDefinition(PieceDefinition pieceDefinition) {
        this.pieceDefinition = pieceDefinition;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    //System.out.println("Drawing a white Knight on field B1");
    @Override
    public void draw(ChessBoardElement piece){
        System.out.println("Drawing a " + piece);
    };

    @Override
    public String toString() {
        return super.getColor(super.getIsWhite()) + " " + pieceDefinition + " on " + field;
    }
}
