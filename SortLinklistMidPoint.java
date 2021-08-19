public class HelloWorld{

     public static void main(String []args){
          System.out.println("Hello World");
          Node  ten = new Node(10);
          Node  nine = new Node(9,ten);
          Node eight = new Node(8,nine);
          Node seven = new Node(7,eight);
          Node two = new Node(2,seven);
          Node six = new Node(6,two);
          Node five = new Node(5,six);
          Node four = new Node(4,five);
          Node three = new Node(3,four);
          Node root = new Node(1, three);
          sortLinkList(root);
     }

     public static void sortLinkList(Node node) {
          Node midNode = node;
          Node tail = null;
          while (midNode != null) {
               if (midNode.data > midNode.next.data) {
                    tail = midNode.next;
                    midNode.next = midNode.next.next;
                    break;
               }
               midNode = midNode.next;
          }

          Node head = node;
          while(head.data != tail.data) {
               Node temp =  head.next;
               if (temp.data > tail.data) {
                    head.next = tail;
                    tail.next = temp;
                    break;
               }
               head = head.next;
          }
          print(node);
     }
     public static void print(Node root) {
          Node head = root;
          while(head != null) {
               System.out.println(head.data);
               head = head.next;
          }
     }
}


class Node {
     int data;
     Node next;
     Node(int data, Node next) {
          this.data = data;
          this.next = next;
     }
     Node(int data) {
          this.data = data;
          this.next = null;
     }
}