class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        HM(root, max);
        return max[0];
    }

    public int HM(TreeNode root, int[] max) {
        if (root == null) return 0; 

        int l = Math.max(0, HM(root.left, max));
        int r = Math.max(0, HM(root.right, max));

        int cr = root.val + l + r;  
        max[0] = Math.max(max[0], cr);

        return root.val + Math.max(l, r); 
    }
}
