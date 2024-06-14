// THIS GOES IN YOUR MAIN CLASS TO TEST YOUR CODE:
// -----------------------------------------------

package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

//        myLinkedList.prepend(3);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);


//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        LinkedList.Node getNode = myLinkedList.getNode(2);
////
////        System.out.println("Node value is: " + getNode.value);
////        if (myLinkedList.insertNode(2, 2)) {
////            System.out.println("Node Inserted Successfully");
////        }
////        if (myLinkedList.setNode(3, 3)) {
////            System.out.println("Node Set Successfully");
////        }
//

//        myLinkedList.getLength();
//
//        System.out.println("Node Removed: " + myLinkedList.removeNode(3).value);
//        myLinkedList.getLength();
////        myLinkedList.reverseLinkedList();

//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
//        myLinkedList.reverse();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        System.out.println("Middle Node is : "+myLinkedList.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Linked List:
            1
            2
            3

        */

    }

}


// THIS CODE GOES IN YOUR LINKEDLIST CLASS:
// ----------------------------------------



