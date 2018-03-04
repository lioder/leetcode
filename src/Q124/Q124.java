package Q124;

/**
 * Created by Kry·L on 2018/3/4.
 */
public class Q124 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(new Solution().maxPathSum(root));
    }
}

class Solution {
    public int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max = root.val;
        pathToLeaf(root);
        return max;
    }

    /**
     * 寻找最长路径
     *
     * @param root
     * @return 从root到某个叶结点的最长路径
     */
    public int pathToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 这里如果路径长度是负的，就不要了（取0）
        int left = Math.max(0, pathToLeaf(root.left));
        int right = Math.max(0, pathToLeaf(root.right));

        max = Math.max(max, left + right + root.val);
        return root.val + Math.max(left, right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
