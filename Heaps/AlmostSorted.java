
// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class AlmostSorted {
	public static void main(String[] args) {

		// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, -1, 2, 6, 4, 5,
		// 8));

	}

	public static void almostSorted(List<Integer> list, int k) {
		// PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		// for(int )

	}

	public static void sortApproximatelySortedData(List<Integer> list, int k) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < k && i < list.size(); ++i) {
			minHeap.add(list.get(i));
		}
		int i = 0;
		while (i < list.size()) {
			minHeap.add(list.get(i));
			Integer smallest = minHeap.remove();
			System.out.println(smallest);
			while (!minHeap.isEmpty()) {
				smallest = minHeap.remove();
				System.out.println(smallest);
			}
			i++;
		}
	}

}