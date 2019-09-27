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
    }

    private void setupFields(){
        fields = new ArrayList<>();
        boolean isWhite = false;
        for (int i = Rank.getMinRank(); i <= Rank.getMaxRank(); i++) {
            for ( char line : Line.getLines() ) {
                fields.add(new Field(new Rank(i), new Line(line)));
            }
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
