import java.util.*;
public class Scenario2_Preorder {
    public List<Integer> iterativePreorder(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> st=new ArrayDeque<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            result.add(node.val);
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
        }
        return result;
    }
}
