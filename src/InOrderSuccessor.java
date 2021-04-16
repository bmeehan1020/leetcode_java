/**
 * SOLVED? YES!
 *
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that node
 * in the BST. If the given node has no in-order successor in the tree, return null. The successor of a node
 * p is the node with the smallest key greater than p.val.
 */
public class InOrderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) return null;

        TreeNode successor = null;
        TreeNode trav = root;
        while (trav != null) {
            if (trav.val > p.val) {
                successor = trav;
                trav = trav.left;
            } else {
                trav = trav.right;
            }
        }

        return successor;
    }

    public static void main(String[] args) {
        InOrderSuccessor inOrderSuccessor = new InOrderSuccessor();
        TreeNode n = new TreeNode(2);
        n.left = new TreeNode(1);
        n.right = new TreeNode(3);
        System.out.println(inOrderSuccessor.inorderSuccessor(n, n.left).val);
    }
}

