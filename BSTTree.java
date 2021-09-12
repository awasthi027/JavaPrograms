


public class BSTTree {
    
     public BSTNode root;
     
    public void add(int data, BSTNode root) {
        BSTNode node = new  BSTNode(data);
        if (root == null) {
            root = node;
        }
        if (data > root.data && root.right == null) {
            root.right = node;
        }else if (data < root.data && root.left == null) {
            root.left = node;
        }else if (data > root.data) {
             add(data,root.right);
        }else {
             add(data,root.left);
        }
    }
    
    public  BSTNode deleteNode(BSTNode root, int data) {
 
        if(root == null) return root;
 
        if(data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if(data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            // node with no leaf nodes
            if(root.left == null && root.right == null) {
                System.out.println("deleting "+data);
                return null;
            } else if(root.left == null) {
                // node with one node (no left node)
                System.out.println("deleting " + data);
                return root.right;
            } else if(root.right == null) {
                // node with one node (no right node)
                System.out.println("deleting " + data);
                return root.left;
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                int minValue = minValue(root.right);
                root.data = minValue;
                root.right = deleteNode(root.right, minValue);
                System.out.println("deleting " + data);
            }
        }
 
        return root;
    }
 
    private int minValue(BSTNode node) {
 
        if(node.left != null) {
            return minValue(node.left);
        }
        return node.data;
    }
    
    public void print(BSTNode root) {
         if (root == null) {
             return;
          }
          print(root.left);
           System.out.println(root.data);
          print(root.right);
    }
}





