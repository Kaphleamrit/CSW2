import java.util.Stack;

public class PreOrderIter {
    //create an empty stack s , push curr to the stack, if current not null and stack not empty print 

    public static void main(String[] args) {
        

        tree.root = new Node(5);
        tree.root.left = new Node(6);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(7);
        tree.root.right.right = new Node(7);

    }


    public static void traverse(Node root) {

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(!stack.isEmpty() || curr != null ) {
            if(curr !=null) {
                stack.push(root);
                curr = curr.left;
            }
            else {
                stack.pop();
                System.out.println(stack.peek());
                curr = stack.peek().right;
            }
        }
    }
    
}
