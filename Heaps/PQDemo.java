import java.util.Comparator;
import java.util.PriorityQueue;

public class PQDemo {
	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>(10, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() > o2.length() ? -1 : o1.length() < o2.length() ? 1 : 0;
			}
		});
		pq.add("after");
		pq.add("ox");
		pq.add("ball");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}
}

// wap that takes an input a set of sorted sequences and compute the union of
// these sequences as a sorted sequence.
// [3,5,7] , [0,6], [0,6,28]
