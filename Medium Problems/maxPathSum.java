class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }
    private int maxPath(TreeNode root){
        if(root == null) return 0;
        //used Math.max(0 , fun()) to avoid -ve value 
        int leftSum = Math.max(0 , maxPath(root.left));
        int rightSum = Math.max(0 , maxPath(root.right));
        max = Math.max(max , root.val + leftSum + rightSum);
        return Math.max(leftSum , rightSum) + root.val;
    }
}