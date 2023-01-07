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
class zigzagLevelOrderTrav {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList <TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        queue.offer(root);
        boolean flag = true;

        while (!queue.isEmpty()) {
            int len = queue.size();
            ArrayList <Integer> curr = new ArrayList <Integer>();
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);

                if (queue.peek().right != null) queue.offer(queue.peek().right);

                if (flag == true) curr.add(queue.poll().val);
                else curr.add(0, queue.poll().val);
            }
            flag = !flag;
            ans.add(curr);
        }
        return ans;
    }
}