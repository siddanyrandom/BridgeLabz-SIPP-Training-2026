import java.util.*;
public class Scenario1_Inorder {
    void inorder(TreeNode node, List<Integer> result){
        if(node==null) return;
        inorder(node.left,result);
        result.add(node.val);
        inorder(node.right,result);
    }
    public List<Integer> getSortedLeaderboard(TreeNode root){
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
}
