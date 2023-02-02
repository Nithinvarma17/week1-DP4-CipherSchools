public class Class28 {
    static class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val){
        this.val=val;
    }
     
	TreeNode(int val, TreeNode left, TreeNode right)
	{
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
   
        int moves = 0;
        public int distributeCoins(TreeNode root) {
            getNumAndCoins(root);
            return moves;
        }
        
        
        private int[] getNumAndCoins(TreeNode node) {
            if (node == null) return new int[] {0, 0};
            int[] left = getNumAndCoins(node.left);
            int[] right = getNumAndCoins(node.right);
            moves += Math.abs(left[0] - left[1]) + Math.abs(right[0] - right[1]);
            return new int[] {left[0] + right[0] + 1, left[1] + right[1] + node.val};
        }
    
}
