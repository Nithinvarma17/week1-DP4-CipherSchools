public class Class30 {
    static class Node {
        int data;
        Node left;
        Node right;
  
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        
        public void inorder(Node root){
            if(root==null){
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+"-->");
            inorder(root.right);
        }
        public void preorder(Node root){
            if(root==null){
                return ;
            }
           
            System.out.print(root.data+"-->");
             preorder(root.left);
            preorder(root.right);
        }
        public void postorder(Node root){
            if(root==null){
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"-->");
        }
    }
  
    public static void main(String args[]) {
        System.out.println("enter the elements in the array Nodes interms of preorder in the tree if u want to insert null enter -1");
        int nodes[] = {6,5,3,-1,4,-1,-1,2,1,-1,-1,-1,4,1,-1,3,-1,-1,7,9,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        
        System.out.println("the inorder traversal is : ");
        tree.inorder(root);
        //System.out.println(root.data);
        System.out.println();
        System.out.println("the preorder traversal is : ");
        tree.preorder(root);
        System.out.println();
        System.out.println("the postorder traversal is : ");
        tree.postorder(root);
    }
  
}
