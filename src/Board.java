public class Board {
    private String[] board = new String[10];
    private Hole game = new Hole();

    public Board() {
        for (int i = 0; i < board.length; i++) {
            board[i] = game.whoIsHere(i);
        }
    }

    public String[] getBoard() {
        return board;
    }

    public String toString() {
        String str = "(" + board[0] + ")";
        for (int i = 1; i < board.length; i++) {
            str += " (" + board[i] + ")";
        }
        return str;
    }
}
