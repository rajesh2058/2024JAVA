// A sudoku solution must satisfy all of the following rules:
// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

public class sudoku {
    
        public boolean isSafe(char[][] board, int row, int col, int number) {
            //column
            for(int i=0; i<board.length; i++) {
                if(board[i][col] == (char)(number+'0')) {
                    return false;
                }
            }
           
            //row
            for(int j=0; j<board.length; j++) {
                if(board[row][j] == (char)(number+'0')) {
                    return false;
                }
            }
           
            //grid
            int sr = 3 * (row/3);
            int sc = 3 * (col/3);
           
            for(int i=sr; i<sr+3; i++) {
                for(int j=sc; j<sc+3; j++) {
                    if(board[i][j] == (char)(number+'0')) {
                        return false;
                    }
                }
            }
           
            return true;
        }
       
        public boolean helper(char[][] board, int row, int col) //step 3
         {
            if(row == board.length) 
            //it is length of row but column has same length aswell
            {
                return true;
            }
           
            int nrow = 0;
            int ncol = 0;
           
            if(col == board.length-1) {
                nrow = row + 1;
                ncol = 0;
            } else {
                nrow = row;
                ncol = col + 1;
            }
           
            if(board[row][col] != '.') {
                if(helper(board, nrow, ncol)) {
                    return true;
                }
            } else {
               
                //fill the place
                for(int i=1; i<=9; i++) {
                    if(isSafe(board, row, col, i)) {
                        board[row][col] = (char)(i+'0');
                        if(helper(board, nrow, ncol))
                            return true;
                        else
                             board[row][col] = '.';
                    }
                }
            }
                          
            return false;
        }
       
        public void solveSudoku(char[][] board) {
            helper(board, 0, 0);   //step 2
            //char value is provided and it gives row and column value to helper fun 
            //calls helper function
        }
        public static void main(String[] args) {
            sudoku Sudoku = new sudoku();
            //call sudoku call with specific function
            // Define a sample Sudoku puzzle
            //2d array with function
            char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
            };
    
            // Solve the Sudoku puzzle
            Sudoku.solveSudoku(board);//step 1 
    
            // Print the solved Sudoku puzzle
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
     }
     
