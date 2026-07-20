import java.util.*;
public class Scenario3_LevelOrder {
    public List<List<Integer>> broadcastByLevel(TreeNode root){
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                level.add(n.val);
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
