class TicTacToe
{
    char[][] board;
    public TicTacToe(){
        board = new char[3][3];
        initBoard();
    }

    void initBoard(){
        for (int i=0; i< board.length; i++)
        {
            for (int j=0; j<board[i].length; j++)
            {
                board[i][j] = ' ';
            }
        }
    }
}







public class Main {
    public static void main(String[] args) {

    }
}