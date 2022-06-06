/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    // create method to store 
    // the value into list from TreeNode
    public void getValues(List list, TreeNode node){
        if(node!=null){ // check node is null or not. if root is null then this method return empty list.
            getValues(list, node.left); // recursive call to store the left value from the TreeNode
            list.add(node.val); // store the value into list
            getValues(list, node.right); // recursive call to store the right value from the TreeNode.
        }
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root) {        
       
        // ArrayList to store the value from TreeNode
        List<Integer> list = new ArrayList<Integer>();
        
        // call method to get the values from TreeNode
        getValues(list, root);
        
        // return the final list of value of TreeNode 
        // store in the arraylist
        return list;         
    }
}