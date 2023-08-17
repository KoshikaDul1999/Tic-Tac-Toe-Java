class TicTacToe
{
    char[][] board;
    public TicTacToe(){
        board = new char[3][3];
        initBoard();
    }

    void initBoard()
    {
        for (int i=0; i< board.length; i++)
        {
            for (int j=0; j<board[i].length; j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    void disBoard()
    {
        System.out.println("-------------");
        for (int i=0; i< board.length; i++)
        {
            System.out.print("| ");
            for (int j=0; j<board[i].length; j++)
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char mark)
    {
        board[row][col] = mark;
    }
}

public class Main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.disBoard();
        t.placeMark(0, 0, 'X');
        t.placeMark(2, 1, 'O');
        t.disBoard();
    }
}