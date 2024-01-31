import java.util.LinkedList;
import java.util.*;

public class tree_level {
    class Node{
        Node left;
        Node right;
        int key;
        Node(int key){
            this.key=key;
            left=null;
            right=null;
        }

    }
    public Node root=null;
    public void insert(int key){
        root=addNode(root,key);
    }
    public Node addNode(Node root,int key){
        Node newnode=new Node(key);
        if(root==null){
            root=newnode;
            return root;
        }
        if(root.key<key){
            root.right=addNode(root.right,key);

        }
        else{
            root.left=addNode(root.left,key);
        }
        return root;

    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key+"");
            inorder(root.right);
        }

    }
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp.key + "");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public int maxWidth(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node> queue1=new LinkedList<>();
        int maxRes=0;
        queue1.offer(root);
        while(!queue1.isEmpty()){
            int levelWidth=queue1.size();
            maxRes=Math.max(levelWidth,maxRes);
            for(int i=0;i<levelWidth;i++){
                Node temp=queue1.poll();
                if(temp.left!=null){
                    queue1.offer(temp.left);
                }
                if(temp.right!=null){
                    queue1.offer(temp.right);
                }

            }

        }
        return maxRes;
    }
    public static void main(String[] args) {
        tree_level temp=new tree_level();
        temp.insert(15);
        temp.insert(10);
        temp.insert(20);
        temp.insert(18);
        temp.insert(25);
        temp.inorder(temp.root);
        System.out.println("----------");
        temp.levelOrder(temp.root);
        int res=temp.maxWidth(temp.root);
        System.out.println(res);

    }
}
