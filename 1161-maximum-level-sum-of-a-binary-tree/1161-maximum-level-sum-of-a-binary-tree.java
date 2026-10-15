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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        int level = 1;
        int maxlevel = 1;
        queue.add(root);
        int maxsum = Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            int currentsum = 0;
            int n = queue.size();
            for(int i= 0; i < n; i++)
            {
                TreeNode node = queue.poll();
                currentsum += node.val;
                if(node.left != null)
                {
                    queue.add(node.left);
                }
                if(node.right != null)
                {
                    queue.add(node.right);
                }
            }

            if(currentsum > maxsum)
            {
                maxsum = currentsum;
                maxlevel = level;
            }
            level++;
        }
        return maxlevel;
    }
}