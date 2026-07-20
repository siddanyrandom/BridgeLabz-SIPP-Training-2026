public class Scenario4_Height {
    int height(TreeNode node){
        if(node==null) return -1;
        return Math.max(height(node.left),height(node.right))+1;
    }
    public boolean isTooDeep(TreeNode root,int threshold){
        return height(root)>threshold;
    }
}
