public class BSTTreeRunner {

    public static void main(String []args){
        System.out.println("Hello World");
        BSTTree bst = new BSTTree();
        bst.root = new BSTNode(2);
        bst.add(7, bst.root);
        bst.add(3, bst.root);
        bst.add(6, bst.root);
        bst.add(4, bst.root);
        bst.add(6, bst.root);
        bst.print(bst.root);
        bst.print(bst.deleteNode(bst.root,6));
        System.out.println("After delete");
        bst.print(bst.root);
        bst.print(bst.deleteNode(bst.root,6));
        System.out.println("After delete");
        bst.print(bst.root);

    }
}
