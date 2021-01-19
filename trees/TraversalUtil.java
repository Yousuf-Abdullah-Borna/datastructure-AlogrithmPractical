
/**
 * Important utility methods to use in the binary tree
 *
 * @author (Yousuf Abdullah Borna)
 * @version (1/18/2021)
 */

public class TraversalUtil
{
   public static void preOrder(TreeNode root){
    
         if (root == null){
            
            return;
            }
            
         System.out.print(root.data+" ");   
         preOrder(root.left);
         preOrder(root.right);
    
    }
    
    
    public static void inOrder(TreeNode root){
    
        if(root == null){
        
        
        return;
        }
        
        
         inOrder(root.left);
         System.out.print(root.data+" ");
         inOrder(root.right);
    
    
    
    }
    
    
    public static void postOrder(TreeNode root){
    
        if(root == null){
        
        
        return;
        }
        
        
         inOrder(root.left);
         inOrder(root.right);
         System.out.print(root.data+" ");
    
    
    
    }
    
    
   
}
