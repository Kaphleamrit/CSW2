import java.util.ArrayList;
import java.util.Collections;

/**
 * Heapify
 */
public class Heapify {
	ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Heapify heap = new Heapify();
		heap.add(4);
		heap.add(1);
		heap.add(22);
		heap.add(10);
		heap.add(6);
		heap.add(2);
		heap.add(1);
		heap.add(50);
		System.out.println(heap.list);
		System.out.println(heap.remove());
		System.out.println(heap.list);

	}

	void add(int key) {
		list.add(key);
		heapifyUp(list.size() - 1);

	}

	void heapifyUp(int i) {

		int parentIndex = (i - 1) / 2;
		if (list.get(i) > list.get(parentIndex)) {
			Collections.swap(list, i, parentIndex);
			heapifyUp(parentIndex);
		}
	}

	int remove() {
		Collections.swap(list, list.size() - 1, 0);
		int toRem = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		heapifyDown(0);
		return toRem;

	}

	void heapifyDown(int i) {
		int leftIndex = 2 * i + 1;
		int rightIndex = 2 * i + 2;
		int n = list.size() - 1;

		if (leftIndex <= n && list.get(i) < list.get(leftIndex)
				|| rightIndex <= n && list.get(i) < list.get(rightIndex)) {

			if (list.get(leftIndex) > list.get(rightIndex)) {
				Collections.swap(list, i, leftIndex);
				heapifyDown(leftIndex);
			} else {
				Collections.swap(list, i, rightIndex);
				heapifyDown(rightIndex);
			}
		}
	}

}