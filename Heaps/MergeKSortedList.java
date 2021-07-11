import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

	public static void main(String[] args) {
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}

		});

		int[] arr1 = { 3, 5, 7 };
		int[] arr2 = { 0, 6 };
		int[] arr3 = { 0, 6, 28 };

		int size = 0;
		int p1, p2, p3;
		p1 = p2 = p3 = 0;

		pq.add(arr1[p1]);
		pq.add(arr2[p2]);
		pq.add(arr3[p3]);

		ArrayList<Integer> res = new ArrayList<>();

		while (size <= arr1.length + arr2.length + arr3.length && !pq.isEmpty()) {
			int min = pq.poll();
			res.add(min);
			size++;

			if (p1 < arr1.length - 2 && min == arr1[p1]) {
				p1++;
				pq.add(arr1[p1]);
			} else if (p2 < arr1.length - 2 && min == arr2[p2]) {
				p2++;
				pq.add(arr2[p2]);
			} else if (p3 < arr1.length - 2 && min == arr3[p3]) {
				p3++;
				pq.add(arr3[p3]);
			}

		}

		System.out.println(res);
	}

}
