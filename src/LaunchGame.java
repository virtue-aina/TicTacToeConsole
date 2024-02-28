
    class TicTacToe {

        char[][] board;

        public TicTacToe(){
            board = new char[3][3];
            initBoard();

        }

        void initBoard() {
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    board[row][col] = ' ';
                }
            }
        }


        void displayBoard() {
                System.out.println("-------------");

                for (int row = 0; row < board.length; row++) {
                    System.out.print("| ");
                    for (int col = 0; col < board[row].length; col++) {
                        System.out.print(board[row][col] + " | ");
                    }
                    System.out.println();
                    System.out.println("-------------");
                }


            }


        void placeMark(int row, int col, char mark){
            board[row][col] =mark;


        }






    }

    public class LaunchGame {

        public static void main(String[] args) {
            TicTacToe t = new TicTacToe();

            t.displayBoard();
            t.placeMark(0,0, 'X');
            t.displayBoard();
        }
    }



