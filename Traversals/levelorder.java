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

public class levelorder {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            ArrayList<Integer> curr = new ArrayList<>();
            for(int i = 0; i < size; i++){
                if(que.peek().left != null){
                    que.offer(que.peek().left);
                }
                if(que.peek().right != null){
                    que.offer(que.peek().right);
                }
                curr.add(que.poll().val);
            }
            ans.add(curr);
        }
        return ans;
    }
}
