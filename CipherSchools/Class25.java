public class Class25 {
    public static int deepestlevel(TreeNode root){
       int deep=0;
        while(root!=null){
            deep++;
            root=root.left;

        }
        return deep;

    }
    public static boolean isPerfectBin(TreeNode root,int current,int deepest){
        if(root.left==null && root.right==null){
            if(current==deepest){
                return true;
            }
            return false;
        }
        if(root.left!=null && root.right!=null){
            boolean leftperfect = isPerfectBin(root.left,current+1,deepest);
            boolean rightperfect = isPerfectBin(root.right,current+1,deepest);
            return leftperfect && rightperfect;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
    
}
