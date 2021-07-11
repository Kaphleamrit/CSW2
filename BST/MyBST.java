import java.util.ArrayList;
import java.util.List;

/**
 * MyBST
 */
public class MyBST {
	Node root;

	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

		@Override
		public String toString() {
			return "[ " + data + " ]";
		}
	}

	Node search(int data, Node root) throws Exception {

		if (root == null || root.data == data)
			return root;
		if (data < root.data)
			return search(data, root.left);
		else
			return search(data, root.right);
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.data)
			root.left = insertRec(root.left, key);
		else if (key > root.data)
			root.right = insertRec(root.right, key);

		return root;
	}

	void deleteKey(int key) {
		root = deleteKey(root, key);
	}

	Node deleteKey(Node root, int key) {
		if (root == null)
			return root;

		if (key < root.data)
			root.left = deleteKey(root.left, key);
		else if (key > root.data)
			root.right = deleteKey(root.right, key);
		else {
			// key equals the node to be deleted
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			root.data = getLeftMost(root.right);

			root.right = deleteKey(root.right, root.data);
		}

		return root;

	}

	int getLeftMost(Node root) {

		int min = root.data;

		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	List<Integer> kthLargest(Node root, int k) {
		List<Integer> list = new ArrayList<>();
		kthLargestHelper(root, k, list);
		return list;
	}

	void kthLargestHelper(Node root, int k, List<Integer> list) {

		if (root != null) {
			kthLargestHelper(root.right, k, list);
			if (list.size() < k)
				list.add(root.data);
			kthLargestHelper(root.left, k, list);
		}

	}

	void kLar(Node root, int k, int count) {
		if (root == null || count == k) {
			return;
		}
		kLar(root.right, k, count++);
		if (count + 1 == k)
			System.out.println(root.data);

		kLar(root.left, k, count++);

	}

	void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root + " ");
		inOrder(root.right);
	}

	int nextGreater(Node root, int num) {
		int toReturn = 0;

		Node iter = root;

		while (iter != null) {
			if (num < root.data) {
				iter = iter.left;
			} else {
				toReturn = iter.data;
				iter = iter.right;
			}
		}
		return toReturn;

	}

	public static void main(String[] args) throws Exception {

		MyBST bst = new MyBST();
		bst.insert(20);
		bst.insert(30);
		bst.insert(13);
		bst.insert(16);
		bst.inOrder(bst.root);
		System.out.println();
		// System.out.println(bst.kthLargest(bst.root, 1));
		// bst.kLar(bst.root, 2, 0);
		// System.out.println(bst.nextGreater(bst.root, 17));
		bst.deleteKey(13);
		bst.inOrder(bst.root);
	}

}

// find the first key greater than the given value in a BST