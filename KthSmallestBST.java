public class KthSmallestBST {

    int count;
    int result;
    
    //TC:
    //SC:
    public int kthSmallest(TreeNode root, int k) {
        result = 0;
        helper(root, k);
        return result;
    }
    
    private void helper(TreeNode root, int k) {
        //Base        
        if(root == null) {
            return;
        }
        //Logic
        helper(root.left, k);
        count ++;
        if(count == k) {
            result = root.val;
            return;
        }
        helper(root.right, k);
        
    }
    public static void main(String[] args) {
        KthSmallestBST kthSmallestBST = new KthSmallestBST();
        TreeNode root = new TreeNode().getSampleBST();
        int result = kthSmallestBST.kthSmallest(root, 2);
        System.out.println("The result is"+ result);
    }
}