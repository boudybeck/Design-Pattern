package control;

import model.ChessBoard;

public class ChessBoardLauncher {
    public static void main(String[] args) {
        ChessBoard boudysCB = new ChessBoard();
        System.out.println(boudysCB);
        boudysCB.setupChessBoard();
        System.out.println(boudysCB);
    }
}
