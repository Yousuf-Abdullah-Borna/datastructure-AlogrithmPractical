
/**
 * This class is to test the tree util files 
 *
 * @author (Yousuf Abdullah Borna)
 * @version (1/18/2021)
 */

public class TreeTesting
{
   public static void main(String args[]){
    
       
       TraversalUtil traversal = new TraversalUtil();
       
       TreeNode root = new TreeNode(1);
       
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       
       
       //traversal.preOrder(root);
       //traversal.inOrder(root);
       traversal.postOrder(root);
       
       
    
    
    }
}
