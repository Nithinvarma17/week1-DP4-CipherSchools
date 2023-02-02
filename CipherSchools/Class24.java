package Class23;
public class Class24 {
    public static boolean isFullBinary(TreeNode root){
        if(root = null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left!=null && root.right!=null){
            boolean isLeft = isFullBinary(root.left);
            boolean isRight = isFullBinary(root.right);
            return isLeft && isRight;
        }
    }
    public static int countNodes(TreeNode root){
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        return 1+leftNodes+rightNodes;
    }
    public static boolean isCompleteBinary(TreeNode root,int index,int number){
        if(root==null){
            return true;
        }
        if(index>=number){
            return false;
        }
        boolean leftbin=isCompleteBinary(root.left,2*index+1,number);
        boolean rightbin=isCompleteBinary(root.right,2*index+1,number);
        return leftbin && rightbin;

    }
    public static void main(String[] args) {
        
    }
    
}
