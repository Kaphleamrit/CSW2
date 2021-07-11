import java.util.ArrayList;

/**
 * Q15 Write a program which takes as input a nonnegative integer n and returns
 * the rst n rows of Pascal's triangle.
 */
public class Q15 {

	public static void main(String[] args) {
		generatePascalsTriangle();
	}

	static void generatePascalsTriangle() {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int m = 8;
		for (int i = 0; i < m; i++)
			list.add(new ArrayList<>());

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (j == 0 || i == j) {
					list.get(i).add(1);
					if (i == j)
						break;
				}

				else {
					int toSet = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
					list.get(i).add(toSet);
				}
			}
		}
		System.out.println(list);

	}
}
