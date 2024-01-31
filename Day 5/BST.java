/*  This for Searching: These bst have time complexity of O(h) where h is height of logn, when there is case of skewed binary tree then
there is case of O(n) time complexity*/
//In case of recursion the auxilary space require is O(h), where as in iterative it is constant
public class BST {
    class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    public Node root = null;
    public void insert(int key) {
        root = insertRec(root, key);
    }
        public Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (key < root.key) {
                root.left=insertRec(root.left, key);
            } else {
                root.right=insertRec(root.right, key);
            }
            return root;
        }

        public void inorderTraversal(Node root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.println(root.key + "");
                inorderTraversal(root.right);
            }
        }

        public static void main(String[] args) {
            BST temp=new BST();
            temp.insert(15);
            temp.insert(10);
            temp.insert(20);
            temp.insert(18);
            temp.insert(25);
            temp.inorderTraversal(temp.root);


        }

}
