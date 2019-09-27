package model;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
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
        for (int i = Rank.getMinRank(); i <= Rank.getMaxRank(); i++) {
            for ( char line : Line.getLines() ) {
                fields.add(new Field(new Line(line), new Rank(i)));
            }
        }
    }

    private void setupPieces(){
      pieces = new ArrayList<>();
      Rank rank = new Rank(1);
      boolean isWhite = true;
      pieces.add(new Piece(PieceName.KING  , new Field(new Line('E'), rank), isWhite));
      pieces.add(new Piece(PieceName.QUEEN , new Field(new Line('D'), rank), isWhite));
      pieces.add(new Piece(PieceName.ROOK  , new Field(new Line('A'), rank), isWhite));
      pieces.add(new Piece(PieceName.ROOK  , new Field(new Line('H'), rank), isWhite));
      pieces.add(new Piece(PieceName.BISHOP, new Field(new Line('C'), rank), isWhite));
      pieces.add(new Piece(PieceName.BISHOP, new Field(new Line('F'), rank), isWhite));
      pieces.add(new Piece(PieceName.KNIGHT, new Field(new Line('B'), rank), isWhite));
      pieces.add(new Piece(PieceName.KNIGHT, new Field(new Line('G'), rank), isWhite));
        for ( char line : Line.getLines()) {
          rank = new Rank(2);
          isWhite = true;
          pieces.add(new Piece(PieceName.PAWN  , new Field(new Line(line), rank), isWhite));
          rank = new Rank(7);
          isWhite = false;
          pieces.add(new Piece(PieceName.PAWN  , new Field(new Line(line), rank), isWhite));
        }
      rank = new Rank(8);
      isWhite = false;
      pieces.add(new Piece(PieceName.KING  , new Field(new Line('E'), rank), isWhite));
      pieces.add(new Piece(PieceName.QUEEN , new Field(new Line('D'), rank), isWhite));
      pieces.add(new Piece(PieceName.ROOK  , new Field(new Line('A'), rank), isWhite));
      pieces.add(new Piece(PieceName.ROOK  , new Field(new Line('H'), rank), isWhite));
      pieces.add(new Piece(PieceName.BISHOP, new Field(new Line('C'), rank), isWhite));
      pieces.add(new Piece(PieceName.BISHOP, new Field(new Line('F'), rank), isWhite));
      pieces.add(new Piece(PieceName.KNIGHT, new Field(new Line('B'), rank), isWhite));
      pieces.add(new Piece(PieceName.KNIGHT, new Field(new Line('G'), rank), isWhite));
    }

    @Override
    public String toString() {
        return "Chessboard{" +
                "fields=" + fields +
                ", pieces=" + pieces +
                '}';
    }
}
