import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Q10 Implement an algorithm that takes as input an array of distinct elements
 * and a size,and returns a subset of the given size of the array elements. All
 * subsets should be equally likely. Return the result in input array itself.
 */
public class Q10 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Random r = new Random();
		int k = 9;
		int n = 100;

		for (int i = 0; i < k; i++) {
			int rand = r.nextInt(n - 1 - i) + i;
			Integer x = map.get(i);
			Integer y = map.get(rand);
			if (x == null && y == null) {
				map.put(rand, i);
				map.put(i, rand);
			} else if (x == null && y != null) {
				map.put(rand, x);
				map.put(i, rand);
			} else if (x != null && y == null) {
				map.put(i, y);
				map.put(rand, i);
			} else {
				map.put(i, y);
				map.put(rand, x);
			}
		}

		System.out.println(map);
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < k; ++i) {
			result.add(map.get(i));
		}
		System.out.println(result);
	}
}
