import java.util.Arrays;

public class CQueueWithArray {
	int capacity = 5;
	int[] arr = new int[5];
	int size;
	int head = -1;
	int tail = -1;

	public void enqueue(int data) throws Exception {
		if (size >= capacity)
			throw new Exception("filled");

		if (head == -1 && tail == -1) {
			arr[head++] = data;
			tail++;
		} else {

			tail = (tail + 1) % capacity;
			arr[tail] = data;
		}

		size++;
	}

	public void dequeue() throws Exception {
		if (size == 0)
			throw new Exception("empty queue");
		arr[head] = 0;
		head = (head + 1) % capacity;
		size--;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
}

class Driver2 {
	public static void main(String[] args) throws Exception {
		CQueueWithArray queue = new CQueueWithArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.enqueue(6);
		System.out.println(queue);
	}
}