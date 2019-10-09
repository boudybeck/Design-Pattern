package model;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private final char MIN_RANK = 'A';
    private final char MAX_RANK = 'H';
    private final int MIN_LINE = 1;
    private final int MAX_LINE = 8;
    private List<Field> fields;
    private List<Piece> pieces;

    public ChessBoard(){ super(); }

    public ChessBoard(List<Field> fields, List<Piece> pieces) {
        super();
        this.fields = fields;
        this.pieces = pieces;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public void setupChessBoard(){
        this.setupFields();
        this.setupPieces();
    }

    private void setupFields(){
        fields = new ArrayList<>();
        for (char i = MIN_RANK; i <= MAX_RANK; i++) {
            for (int j = MIN_LINE; j <= MAX_LINE; j++) {
                fields.add(new Field(i, j));
            }
        }
        printFields();
    }

    private void printFields(){
        for (Field field : fields){
            field.draw(field);
        }
    }

    private void setupPieces(){
        pieces = new ArrayList<>();
        pieces.add(new Piece(PieceDefinition.ROOK, fields.get(0), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(1), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(6), false));
        pieces.add(new Piece(PieceDefinition.ROOK, fields.get(7), false));
        pieces.add(new Piece(PieceDefinition.KNIGHT, fields.get(8), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(9), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(14), false));
        pieces.add(new Piece(PieceDefinition.KNIGHT, fields.get(15), false));
        pieces.add(new Piece(PieceDefinition.BISHOP, fields.get(16), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(17), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(22), false));
        pieces.add(new Piece(PieceDefinition.BISHOP, fields.get(23), false));
        pieces.add(new Piece(PieceDefinition.QUEEN, fields.get(24), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(25), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(30), false));
        pieces.add(new Piece(PieceDefinition.QUEEN, fields.get(31), false));
        pieces.add(new Piece(PieceDefinition.KING, fields.get(32), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(33), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(38), false));
        pieces.add(new Piece(PieceDefinition.KING, fields.get(39), false));
        pieces.add(new Piece(PieceDefinition.BISHOP, fields.get(40), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(41), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(46), false));
        pieces.add(new Piece(PieceDefinition.BISHOP, fields.get(47), false));
        pieces.add(new Piece(PieceDefinition.KNIGHT, fields.get(48), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(49), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(54), false));
        pieces.add(new Piece(PieceDefinition.KNIGHT, fields.get(55), false));
        pieces.add(new Piece(PieceDefinition.ROOK, fields.get(56), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(57), true));
        pieces.add(new Piece(PieceDefinition.PAWN, fields.get(62), false));
        pieces.add(new Piece(PieceDefinition.ROOK, fields.get(63), false));
        printPieces();
    }

    private void printPieces(){
        for (Piece piece : pieces) {
            piece.draw(piece);
        }
    }

    @Override
    public String toString() {
        return "Chessboard{" +
                "fields=" + fields +
                ", pieces=" + pieces +
                '}';
    }
}
