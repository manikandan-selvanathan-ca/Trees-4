public class LCABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val <root.val) return lowestCommonAncestor(root.left, p, q);
        else if(p.val > root.val && q.val > root.val)  return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
    
    public static void main(String[] args) {
        LCABinarySearchTree lcaBinarySearchTree = new LCABinarySearchTree();
        TreeNode root = new TreeNode().getSampleBST();
        TreeNode p = new TreeNode().getSampleBSTTwo();
        TreeNode result = lcaBinarySearchTree.lowestCommonAncestor(root, p, p.right);
    }
}
