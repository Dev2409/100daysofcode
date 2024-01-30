public class BST_Rec {
    class Node{
        Node left;
        Node right;
        int key;
        Node(int key){
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }
    public Node root=null;
    public void insertIte(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (key < current.key) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            }
            if (key > current.key) {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            } else {
                return;
            }
        }
    }
    public void inorder(Node root){
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key + "");
            inorder(root.right);
        }
    }
    public void insert(int key){
        insertIte(key);
    }
    public boolean search(Node root,int num){
        while(root!=null){
            if(num==root.key){
                return true;
            }
            else if(root.key<num){
                root=root.right;
            }
            else {
                root = root.left;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        BST_Rec temp=new BST_Rec();
        temp.insert(10);
        temp.insert(15);
        temp.insert(12);
        temp.insert(18);
        temp.insert(20);
        temp.inorder(temp.root);
        boolean res=temp.search(temp.root,17);
        System.out.println(res);
    }
}
