package extra;

import java.util.ArrayList;


public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralIterate(grid));
    }
    
    static ArrayList<Integer> spiralIterate(int[][] grid) {
        int size = grid.length;
        ArrayList<Integer> list = new ArrayList<>();
        int rowHigh = size - 1;
        int colHigh = size -1;
        int rowLow = 0;
        int colLow = 0;

        while(rowLow <= rowHigh) {
            for(int i = colLow ; i<colHigh; i++ ) {
                list.add(grid[rowLow][i]);
            }
            for(int i= rowLow; i<rowHigh; i++) {
                list.add(grid[i][colHigh]);
            }
            for(int i=colHigh; i>colLow; i--) {
                list.add(grid[rowHigh][i]);
            }
            for(int i =rowHigh; i>rowLow; i--) {
                list.add(grid[i][colLow]);
            }
            rowLow +=1;
            colLow +=1;
            rowHigh -=1;
            colHigh -=1;
        }
        return list;
    }
}
