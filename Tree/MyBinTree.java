import java.util.Scanner;

/**
 * MyTree
 */


public class MyBinTree {
	class Node {

	Node left, right;
	int key;

	public Node(int item) {
		key = item;
		left = right = null;
	}

}

	public static Node create() {
		Node root = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key:");
		int data = sc.nextInt();

		if (data == -1) {
			sc.close();
			return null;
		}

		root = new Node(data);
		System.out.println("Enter left node of  " + root.key);
		root.left = create();
		System.out.println("Enter right node of  " + root.key);
		root.right = create();
		sc.close();
		return root;
	}

	public static void inOrder(Node root) {

		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);
	}

	public void preOrder(Node root) {
		if (root == null)
			return;

		System.out.println(root.key);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.key);
	}

	public static boolean isHeightBalanced(Node root) {

		int leftHeight;
		int rightHeight;

		if (root == null)
			return true;

		leftHeight = getHeight(root.left);
		rightHeight = getHeight(root.right);

		if (Math.abs(leftHeight - rightHeight) <= 1 && isHeightBalanced(root.left)
				&& isHeightBalanced(root.right))
			return true;

		return false;
	}

	public static int getHeight(Node root) {
		
		if(root == null) return 0;

		return 1 + Math.max(getHeight(root.left) , getHeight(root.right));
	}




	public static void main(String[] args) {

		Node root = create();
		inOrder(root);
		System.out.println(isHeightBalanced(root));

	}
}

// create a binary tree that contains integer 5 ,6 ,7,9 and traverse them in a
// particular order.



// maxDepth(Node root) {

// 	if(root == null) return 0;

// 	int leftMax = maxDepth(root.left);
// 	int rightMax = maxDepth(root.right);
// 	return Math.max(leftMax,rightMax) + 1;
// }