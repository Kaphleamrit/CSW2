import java.util.HashSet;

public class CircularLl {
	Node head;
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

	public void addLast(int num) {
		Node toAdd = new Node(num);
		if (head == null) {
			head = toAdd;
			head.next = head;
		} else {
			Node tempNode = head;
			int counter = 1;
			while (counter < size) {
				tempNode = tempNode.next;
				counter++;
			}
			tempNode.next = toAdd;
			toAdd.next = head;
		}
		size++;
	}

	public static boolean checkCycle(Node head) {
		HashSet<Node> set = new HashSet<>();

		while (head != null) {
			if (set.contains(head))
				return true;
			set.add(head);
			head = head.next;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tempNode = head;
		int counter = 0;

		while (counter <= size) {
			sb.append(tempNode);
			tempNode = tempNode.next;
			counter++;
		}
		return sb.toString();

	}
}

class Driver1 {
	public static void main(String[] args) {
		CircularLl list = new CircularLl();
		list.addLast(1);

		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);

		System.out.println(list);
		System.out.println(CircularLl.checkCycle(list.head));

	}

}
