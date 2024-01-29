public class BST_Balance {
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
    public int isBalanced(Node root){
        if(root==null){
            return 1;
        }
        int lh=isBalanced(root.left);
        if(lh==-1){
            return -1;
        }
        int rh=isBalanced(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        else{
            return Math.max(lh,rh)+1;
        }

    }
    public static void main(String[] args) {
        BST_Balance temp=new BST_Balance();
        temp.insert(15);
        temp.insert(10);
        temp.insert(20);
        temp.insert(18);
        temp.insert(25);
        temp.inorder(temp.root);
        int ans=temp.isBalanced(temp.root);
        if(ans>0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not");
        }

    }
}
