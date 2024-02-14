//Time complexity of all the operations in BST is O(h) where h is height of BST
public class BST_floor {
    class Node{
        public Node left;
        public Node right;
        int key;
        Node(int key){
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }
    public Node root=null;
    public Node addNode(Node root,int key){
        Node newnode=new Node(key);
        if(root==null){
            root=newnode;
            return root;
        }
        if(root.key<key){
            root.right=addNode(root.right,key);
        }
        else if(root.key>key){
            root.left=addNode(root.left,key);
        }
        return root;
    }
    public void insert(int key){
        root=addNode(root,key);
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    public int floor(Node root,int num){
        int floorRes=-1;
        while(root!=null){
            if(root.key==num){
                return root.key;
            }
            if(root.key<num){
                floorRes=root.key;
                root=root.right;
            }
            else{
                root=root.left;
            }

        }
        return floorRes;


    }

    public static void main(String[] args) {
        BST_floor temp=new BST_floor();
        temp.insert(15);
        temp.insert(10);
        temp.insert(20);
        temp.insert(18);
        temp.insert(25);
        temp.inorder(temp.root);
        int ans=temp.floor(temp.root,21);
        System.out.println("Floor Value is:"+ans);
    }
}
