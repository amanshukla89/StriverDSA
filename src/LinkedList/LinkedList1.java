package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList1 {

    void main() {
        int[] arr = {2,5,6,8};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
    }

}
