class Solution{
    
    // function to check if node is leaf node or not.
    static boolean isLeaf(Node root){
        return (root.left == null) && (root.right == null);
    }
    //function to add left boundry
    static void addLeftBoundry(Node node , ArrayList<Integer> ans){
        Node curr = node.left;
        while(curr != null){
            if(isLeaf(curr) == false) ans.add(curr.data);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    // function to add right boundry
    static void addRightBoundry(Node root, ArrayList < Integer > res) {
        Node cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }
    // function to add leaves
    static void addLeaves(Node node , ArrayList<Integer> ans){
        if(isLeaf(node) == true){
            ans.add(node.data);
            return;
        }    
        if(node.left != null ) addLeaves(node.left, ans);
        if(node.right != null) addLeaves(node.right , ans);
    }
    
	ArrayList <Integer> boundary(Node node){
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(isLeaf(node) == false) ans.add(node.data);
	    addLeftBoundry(node , ans);
	    addLeaves(node , ans);
	    addRightBoundry(node , ans);
	    return ans;
	}
}