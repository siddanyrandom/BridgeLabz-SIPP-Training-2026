public class Scenario6_Postorder {
    void deleteNode(TreeNode node){}
    public void deleteFolderTree(TreeNode node){
        if(node==null) return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node);
    }
}
