/**
 * CircularQueue
 */
public class CircularQueue {
	Node head;
	Node tail;
	int size;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "[" + data + "]";
		}
	}

	public void enqueue(int data) {
		Node toAdd = new Node(data);

		if (head == null) {
			head = toAdd;
			tail = toAdd;
			head.next = head;
			tail.next = head;

		}

		else {
			tail.next = toAdd;
			tail = tail.next;
			tail.next = head;
		}
		size++;
	}

	public void dequeue() throws Exception {
		if (head == null)
			throw new Exception("empty dequeue");

		tail.next = head.next;
		head = head.next;
		size--;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int flag = 0;
		Node iter = head;
		while (flag <= size) {
			sb.append(iter);
			iter = iter.next;
			flag++;
		}
		return sb.toString();
	}

}

class Driver {
	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue();

		queue.enqueue(5);
		queue.enqueue(9);
		queue.enqueue(0);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
	}

}