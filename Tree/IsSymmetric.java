import java.util.ArrayList;
import java.util.Stack;

class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

class MyBinaryTree {
    Node root;

    boolean isMirror(Node root1, Node root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1.key == root2.key && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left))
            return true;
        return false;

    }

    boolean IsSymmetric(Node root) {
        return isMirror(root, root);
    }

    void traverseInorder(Node root) {

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                System.out.println(curr.key);
                curr = curr.right;
            }
        }
    }

    ArrayList<Integer> traversePreorder(Node root) {
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> toReturn = new ArrayList<>();

        stack.push(root);

        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            if(curr!=null) {
                toReturn.add(curr.key);
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }
        return toReturn;
    }
}


int findMax(Node root, int max) {
    if(root == null) return max;

    if(max<root.key) {
        findMax(root.left,root.key);
        findMax(root.right,root.key);
    }else {
        findMax(root.left,max);
        findMax(root.right,max);
}
    }


    int findMin(Node root, int min) {
    if(root == null) return min;

    if(min>root.key) {
        findMax(root.left,root.key);
        findMax(root.right,root.key);
    } else  {
        findMax(root.left,min);
        findMax(root.right,min);
}
    }
}



public class IsSymmetric {

    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // System.out.println(tree.IsSymmetric(tree.root));
        // tree.traverseInorder(tree.root);
        System.out.println(tree.traversePreorder(tree.root));


    }

}
