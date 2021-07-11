
class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinTree {
    Node root;

    static boolean pathSum(Node root, int sum, int target) {
        if (root == null)
            return false;

        if (sum == target && root.left == null && root.right == null)
            return true;

        return pathSum(root.right, sum + root.key, target) || pathSum(root.left, sum + root.key, target);

        // boolean ans = false;

        // int subSum = sum - root.key;

        // if (subSum == 0 && root.left == null && root.right == null)
        // return (ans = true);
        // if (root.left != null)
        // ans = ans || pathSum(root.left, subSum);
        // if (root.right != null)
        // ans = ans || pathSum(root.right, subSum);
        // return (ans);
    }

    static int rootLeafSum(Node root, int val) {
        if (root == null)
            return 0;

        val = val * 10 + root.key;
        if (root.left == null && root.right == null)
            return val;

        return rootLeafSum(root.left, val) + rootLeafSum(root.right, val);
       
    }
    

    static int binPath(Node root, int pSum) {
        if(root == null) return 0;
        pSum =pSum * 2 + root.key;
        
        if(root.left == null && root.right == null)
        return pSum;

        return binPath(root.left, pSum) + binPath(root.right, pSum);
    }


    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.root = new Node(1);
        tree.root.left = new Node(0);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(0);
        tree.root.right.left = new Node(1);



        System.out.println(pathSum(tree.root, 0, 200));
        System.out.println(rootLeafSum(tree.root, 0));
        System.out.println(binPath(tree.root,0));

    }

}

// public class PathSum {

// }
