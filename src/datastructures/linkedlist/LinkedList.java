package datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node getNode(int index) {
        if (index >= length || index < 0) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean insertNode(int index, int value) {
        if (index < 0 || index > length) return false;
        Node newNode = new Node(value);
        Node before = head;
        Node after = head;

        for (int i = 0; i < index - 1; i++) {
            before = after;
            after = after.next;

        }
        before.next = newNode;
        newNode.next = after;
        return true;

    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length - 1; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node removeNode(int index) {
        if (index < 0 || index - 1 > length) return null;
        Node before = head;
        Node after = head;
        if (index == 1) return removeFirst();
        if (index == length - 1) return removeLast();
        for (int i = 0; i < index - 1; i++) {
            before = after;
            after = after.next;
        }
        after = after.next;
        before.next = after;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return head;

    }

    public boolean setNode(int index, int value) {
        if (index < 0 || index > length) return false;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;

        }
        temp.value = value;
        return true;

    }


    public Node removeFirst() {
        Node firstNode = head;
        if (length == 0) return null;
        head = head.next;
        firstNode.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return firstNode;
    }

}
