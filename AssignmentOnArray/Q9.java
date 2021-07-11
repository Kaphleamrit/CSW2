import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Q9 Write a program that takes as input a permutation, and returns the next
 * permutation under dictionary ordering. If the permutation is the last
 * permutation, return the empty array. For example, if the input is < 1; 0; 3;
 * 2 > your function should return < 1; 2; 0; 3 >. If the input is < 3; 2; 1; 0
 * >, return ().
 */
public class Q9 {

	public static void main(String[] args) {
		System.out.println(nextPermutation(Arrays.asList(1, 0, 3, 2)));
	}

	public static List<Integer> nextPermutation(List<Integer> perm) {
		int k = perm.size() - 2;
		while (k >= 0 && perm.get(k) >= perm.get(k + 1)) {
			--k;
		}
		if (k == -1) {
			return Collections.emptyList();
		}
		for (int i = perm.size() - 1; i > k; --i) {
			if (perm.get(i) > perm.get(k)) {
				Collections.swap(perm, k, i);
				break;
			}
		}

		Collections.reverse(perm.subList(k + 1, perm.size()));
		return perm;
	}

}