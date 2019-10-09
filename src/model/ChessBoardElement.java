package model;

public abstract class ChessBoardElement {
    private boolean isWhite;

    public ChessBoardElement() {
        this(false);
    }

    public ChessBoardElement(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean getIsWhite(){
        return isWhite;
    }
    public void setIsWhite(boolean isWhite){
        this.isWhite = isWhite;
    }
    public static String getColor(boolean isWhite){
        return (isWhite) ? "white" : "black";
    }

    public abstract void draw(ChessBoardElement chessBoardElement);

}
