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
    public int sumNumbers(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();

        queue.add(root);
        sum.add(root.val);
        int totalsum = 0;

        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            int currentsum = sum.poll();

            if(node.left == null && node.right == null)
            {
                totalsum += currentsum;
            }

            if(node.left != null)
            {
                queue.add(node.left);
                //currentsum += currentsum*10 + node.left.val;
                sum.add(currentsum*10 + node.left.val);
            }

            if(node.right != null)
            {
                queue.add(node.right);
                //currentsum += currentsum*10 + node.right.val;
                sum.add(currentsum*10 + node.right.val);
            }
        }
        return totalsum;
    }
}