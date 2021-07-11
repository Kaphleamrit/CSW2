import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Q1 Write a program to implement dutch national ag partition
 */
public class Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(
				Arrays.asList(0, 1, 0, 1, 1, 2, 2, 0, 2, 1, 0, 2, 2, 1, 0));
		int low = 0, mid = 0, high = list.size() - 1;
		int pivot = list.get(1);

		System.out.println(list);
		while (mid <= high) {
			if (list.get(mid) < pivot)
				Collections.swap(list, mid++, low++);
			else if (list.get(mid) == pivot)
				mid++;
			else
				Collections.swap(list, mid, high--);
		}

		System.out.println(list);
	}
}