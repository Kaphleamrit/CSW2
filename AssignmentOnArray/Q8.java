import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Q8 Given an array A of n elements and a permutation P, apply P to A. eg p =
 * [3,1,2,0] A = [6,3,4,6]
 */
public class Q8 {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6, 3, 4, 1));
		ArrayList<Integer> perm = new ArrayList<>(Arrays.asList(3, 1, 2, 0));

		for (int i = 0; i < A.size(); ++i) {

			int next = i;
			while (perm.get(next) >= 0) {
				Collections.swap(A, i, perm.get(next));
				int temp = perm.get(next);
				perm.set(next, perm.get(next) - perm.size());
				next = temp;
			}
		}

		System.out.println(A);
		System.out.println(perm);
	}
}
