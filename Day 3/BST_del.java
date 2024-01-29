public class BST_del {
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
    public Node delNode(Node root,int num){
        if(root==null){
            return null;
        }
        else if (root.key>num) {
            root.left=delNode(root.left,num);
        }
        else if(root.key<num){
            root.right=delNode(root.right,num);
        }
        //If nodes are found
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.key=minValue(root);
            root.right=delNode(root.right,root.key);
        }
        return root;
    }
    public int minValue(Node root){
        int minValue=root.key;
        while(root.left!=null){
            minValue=root.key;
            root=root.left;
        }
        return minValue;
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
    public static void main(String[] args) {
        BST_del temp=new BST_del();
        temp.insert(15);
        temp.insert(10);
        temp.insert(20);
        temp.insert(18);
        temp.insert(25);
        temp.inorder(temp.root);
        temp.delNode(temp.root,10);
        System.out.println("----------");
        temp.inorder(temp.root);

    }
}
