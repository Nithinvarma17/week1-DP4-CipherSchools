
import java.util.ArrayList;
import java.util.List;
public class Class32 {
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
    

    List<Integer> arrS= new ArrayList<>(); 
    
    public void inorder(TreeNode root) 
    { 
        if (root == null) 
            return;
        
        inorder(root.left); 
        
        arrS.add(root.val); 
        
        inorder(root.right); 
        
        return; 
    }
    
    public TreeNode createBST(int low, int high) 
    {
        if(low > high)
           return null;
        
        int mid= low + (high - low)/2;
        
        int data= arrS.get(mid);
        
        
        TreeNode left= createBST(low, mid - 1);
        TreeNode right= createBST(mid + 1, high);
        
        TreeNode node= new TreeNode(data, left, right);
        return node;
    }
    
    public TreeNode balanceBST(TreeNode root) 
    {
        TreeNode rootN= null;
        if(root == null)
            return rootN;
        
        inorder(root);
        rootN= createBST(0, arrS.size() - 1); 
        return rootN;
    }

}
