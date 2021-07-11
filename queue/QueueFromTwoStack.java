public class QueueFromTwoStack {
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

	
}


//implement a queue with enqueue , dequeue and max operations
