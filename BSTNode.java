public class BSTNode {

    public int data;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public BSTNode(int data,  BSTNode left,  BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}