import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class postorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }

    public static void postOrder(TreeNode root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        ans.add(root.val);
        postOrder(root.left, ans);
        postOrder(root.right, ans);
    }
}