// n queens problem backtracking
import java.util.*;
public class Backtacking2{
    public boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        //board.length gives length of row in 2d array
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }
       
        //vertical
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
       
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) //(r-1,c-1)
         {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++)//(r-1,c+1)
        {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        //lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--)//(r+1,c-1)
        {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++)
        //(r+1,c+1) 
        {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
       
        return true;
    }
   
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
       
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q'; //row =row+Q
                else
                    row += '.'; //row =row+ .
            }
            newBoard.add(row);
        }
       
        allBoards.add(newBoard);
    }
 
public void helper(char[][] board,List<List<String>> allBoards ,int col){
if(col==board.length)//if board length is n and col become n that indicated it is outside of board
//cause length start from 1 wereas column started from 0
{
    saveBoard(board, allBoards); //basecase
    return ;
}
for(int row =0;row<board.length;row++){
    if(isSafe(row, col, board))
    //to find is that function return true or not
     {
        board[row][col] = 'Q';
        helper(board, allBoards, col+1);
        board[row][col] = '.';
    }

}

}
    public List<List<String>> solveNQueens(int n)
    //list has list of string which will return answer
    {
        List<List<String>> allBoards = new ArrayList<>(); 
        //uses array list fn where we insert string
        // Scanner A = new Scanner(System.in);
        // int row = A.nextInt();
        // int col =A.nextInt();
        char[][] board = new char[n][n];
        helper(board, allBoards,0);
        return allBoards ;
    }
    public static void main(String[] args) {
       Backtacking2 solver = new Backtacking2();
        List<List<String>> solutions = solver.solveNQueens(4); // Solve for 8 queens
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

