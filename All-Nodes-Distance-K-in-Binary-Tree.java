/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        teraBaap(root,map);
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<TreeNode,Boolean> visited = new HashMap<>();
        q.add(target);
        int count = 0;
        visited.put(target,true);
        while(!q.isEmpty()){
            if(count == k){
                break;
            }
            count++;
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node.left != null && !visited.containsKey(node.left)){
                    q.add(node.left);
                    visited.put(node.left,true);
                }
                if(node.right != null && !visited.containsKey(node.right)){
                    q.add(node.right);
                    visited.put(node.right,true);
                }
                if(map.get(node) != null && !visited.containsKey(map.get(node))){
                    q.add(map.get(node));
                    visited.put(map.get(node),true);
                }
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        while(!q.isEmpty()){
            li.add(q.poll().val);
        }
        return li;
    }

    public void teraBaap(TreeNode root, HashMap<TreeNode,TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        map.put(root,null);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left != null){
                q.add(node.left);
                map.put(node.left,node);
            }
            if(node.right != null){
                q.add(node.right);
                map.put(node.right,node);
            }
        }
    }
}