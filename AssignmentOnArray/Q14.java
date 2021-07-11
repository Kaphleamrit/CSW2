import java.util.Arrays;

/**
 * Q14 Write a function that takes as input an n X n 2D array, and rotates the
 * array by 90 degrees clockwise.
 */
public class Q14 {

	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int[] row : grid) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		rotate(grid, 4, 4);
	}

	static void rotate(int[][] grid, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = i; j < n; j++) {
				int temp = grid[i][j];
				grid[i][j] = grid[j][i];
				grid[j][i] = temp;
			}
		}
		int i = 0;
		int j = n - 1;
		while (i < j) {
			for (int k = 0; k < m; k++) {
				int temp = grid[k][i];
				grid[k][i] = grid[k][j];
				grid[k][j] = temp;
			}
			i++;
			j--;
		}
		for (int[] row : grid) {
			System.out.println(Arrays.toString(row));
		}

	}
}
