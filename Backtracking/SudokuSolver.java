import java.util.Arrays;

/**
 * SudokuSolver
 */
public class SudokuSolver {

    public static void main(String[] args) {
      int[][]  grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
                        {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
                        {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
                        {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
                        {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
                        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                        {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
                        {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
                        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
      if(solveSudoku(grid,0,0))
      for(int[] row : grid)
       System.out.println(Arrays.toString(row));
      else System.out.println("Solution doesn't exist");


    }

    static boolean solveSudoku(int[][] grid, int row , int col) {
        int n= 9;
        if(row == n-1 && col == n) return true;

        if(col==9) {
            col=0;
            row++;
        }

        if(grid[row][col] != 0) {
          return  solveSudoku(grid,row,col+1);
        }

        for(int i=1; i<10; i++) {
            if(isSafe(grid, row, col, i)) {
                grid[row][col] = i;

                if(solveSudoku(grid,row,col+1)) 
                    return true;
              
            } 
            grid[row][col] = 0;
        }
           return false;
        
    }

    static boolean isSafe(int[][] grid, int row, int col,int num) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++) {
            if(grid[i][col] == num) {
                return false;
            }
        }
        for(int j=0; j<n; j++) {
            if(grid[row][j] == num) {
                return false;
            }
        }

        int start = row - row % 3;
        int end = col - col % 3;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(grid[i + start][j+end] == num) return false;
            }
        }
        return true;
    }
}