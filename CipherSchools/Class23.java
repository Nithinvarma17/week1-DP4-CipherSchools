public class Class23 {

     static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int treeheight(TreeNode root){
        
        if(root==null){
            return 0;
        }
        int leftHeight = treeheight(root.left);
        int rightHeight = treeheight(root.right);
        int finalh =Math.max(leftHeight,rightHeight);
        return finalh+1;
    }
    static int maxdia=0;
    public static int treediameter(TreeNode root){
        
        if(root==null){
            return 0;
        }
        int leftHeight = treeheight(root.left);
        int rightHeight = treeheight(root.right);
        maxdia = Math.max(maxdia,1+leftHeight+rightHeight);
        int finalh =Math.max(leftHeight,rightHeight);
        return finalh+1;
    }
    
    public static void main(String[] args) {
     
        TreeNode root = new TreeNode(5);
        root.left= new TreeNode(7);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(8);
        root.left.right=new TreeNode(2);
        root.left.right.right=new TreeNode(9);
        root.left.right.right.left=new TreeNode(1);
        root.left.right.right.left.left=new TreeNode(3);
        System.out.println(treeheight(root));
        //System.out.println(treediameter(root));
        
    }
    
}
