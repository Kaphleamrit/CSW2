import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q2 Write a program which takes as input an array of digits encoding a decimal
 * number D and update the array to represent the number D + 1
 */
public class Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 9, 9, 9));

		int n = list.size() - 1;
		list.set(n, list.get(n) + 1);
		int i = n;

		while (list.get(i) == 10 && i > 0) {
			list.set(i, 0);
			list.set(i - 1, list.get(i - 1) + 1);
			i--;
		}

		if (list.get(0) == 10) {
			list.set(0, 0);
			list.add(0, 1);
		}

		System.out.println(list);
	}
}