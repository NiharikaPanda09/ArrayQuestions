public class TicTacToe {
    public static void main(String[] args) {
        int[][] tic = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};

        System.out.println(tictactoe(tic));
    }

    public static String winner(char[][] board){
        for(int i=0;i<3;i++){
            int ctA= 0;
            int ctB =0;

            for(int j=0;j<3;j++){
                  if(board[i][j] == 'X') ctA++;
                  if(board[i][j] == 'O') ctB++;
            }
            if(ctA == 3) return "A";
            if(ctB == 3) return "B";

        }
        //check for
        for(int j=0;j<3;j++){
            int ctA = 0;
            int ctB =0;

            for(int i=0;i<3;i++){
                if(board[i][j] == 'X') ctA++;
                if(board[i][j] == 'O') ctB++;

            }
            if(ctA == 3) return "A";
            if(ctB==3) return "B";
        }
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ) return "A";
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ) return "B";

        if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' ) return "A";
        if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' ) return "B";

        int ct=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j] =='X' || board[i][j] == 'O') ct++;

            }
        }
        if(ct !=9){
            return "Pending";
        }else{
            return "Draw";
        }


    }
    public  static String tictactoe(int[][] moves) {

        char[][] board = new char[3][3];

        //creating the board.
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[i][j] ='.';
            }
        }

        //initialising the board
        for(int i=0;i<moves.length;i++)
        {
            if(i%2==0)
            {
                board[moves[i][0]][moves[i][1]]='X';
            }
            else{
                board[moves[i][0]][moves[i][1]]='O';
            }
        }

        return winner(board);

    }
}
