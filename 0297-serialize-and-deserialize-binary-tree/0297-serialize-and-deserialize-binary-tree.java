/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public void helper(StringBuilder result , TreeNode root){
        if(root == null){
            result.append("null,");
            return;
        }
        else{
            result.append(Integer.toString(root.val));
            result.append(",");
            helper(result,root.left);
            helper(result,root.right);
        }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder ();
        helper(result , root);
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] arr = data.split(",");
        List<String> ls = new LinkedList<>(Arrays.asList(arr));
        return HD(ls);

    }
    public TreeNode HD(List<String> ls){
        if(ls.get(0).equals("null"))
        {
            ls.remove(0);
            return null;
        }
        else{
            TreeNode root = new TreeNode(Integer.parseInt(ls.get(0)));
            ls.remove(0);

            root.left = HD(ls);
            root.right = HD(ls);


            return root;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));