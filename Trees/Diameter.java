public class Scenario5_Diameter {
    int diameter=0;
    public int longestCommunicationPath(TreeNode root){
        diameter=0;
        dfs(root);
        return diameter;
    }
    int dfs(TreeNode node){
        if(node==null) return -1;
        int l=dfs(node.left),r=dfs(node.right);
        diameter=Math.max(diameter,l+r+2);
        return Math.max(l,r)+1;
    }
}
