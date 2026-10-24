class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversalHelper(root, res);
        return res;
    }

    public void inorderTraversalHelper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        inorderTraversalHelper(root.left, list);
        list.add(root.val);
        inorderTraversalHelper(root.right, list);
    }
}