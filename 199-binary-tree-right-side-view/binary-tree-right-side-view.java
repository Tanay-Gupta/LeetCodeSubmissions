/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        if (root == null)
            return list;
        q.add(root);
        while (!q.isEmpty()) {

            int size = q.size();
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                if (i == 0)
                    list.add(node.val);

                if (node.right != null)
                    q.add(node.right);
                if (node.left != null)
                    q.add(node.left);

            }
        }
        return list;
    }
}