import java.util.Stack;

/**
 * MyStack
 */
public class MyStack {
	Node head;
	int maxSize = 10;
	int size = 0;
	Stack<Integer> stack = new Stack<Integer>();

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

	public void push(int data) {
		Node toAdd = new Node(data);
		if (head == null) {
			head = toAdd;
			stack.push(head.data);
		} else if (size > maxSize)
			throw new StackOverflowError("overflow");
		else {
			toAdd.next = head;
			head = toAdd;
			if (stack.peek() > head.data)
				stack.push(stack.peek());
			else
				stack.push(head.data);
		}
		size++;
	}

	public int peek() throws Exception {
		if (head == null)
			throw new Exception("cannot peek into empty stack");
		return head.data;
	}

	public void pop() throws Exception {
		if (head == null)
			throw new Exception("cannot pop from an empty stack");
		head = head.next;
		stack.pop();
		size--;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node currNode = head;
		while (currNode != null) {
			sb.append(currNode);
			currNode = currNode.next;
		}

		return sb.toString();
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int max() {
		int toReturn = head.data;
		Node iter = head;
		while (iter != null) {
			if (iter.data > toReturn)
				toReturn = iter.data;
			iter = iter.next;
		}
		return toReturn;
	}

	public int maxAPI() {
		return stack.peek();
	}

}

class Driver {
	public static void main(String[] args) throws Exception {
		MyStack stack = new MyStack();
		stack.push(20);
		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(21);
		System.out.println(stack);
		System.out.println(stack.maxAPI());
		stack.pop();
		System.out.println(stack.maxAPI());
	}

}