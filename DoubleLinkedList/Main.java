package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        System.out.println("Traverse DLL: ");
        doublyLinkedList.traverseDLL();

        System.out.println("Reverse Traverse DLL: ");
        doublyLinkedList.reverseTraverseDLL();

        int searchValue = 2;
        System.out.println("Search for value " + searchValue + ": " + doublyLinkedList.searchNode(searchValue));

        doublyLinkedList.deleteNodeDLL(1);
        System.out.println("DLL after deleting node at location 1: ");
        doublyLinkedList.traverseDLL();

        doublyLinkedList.deleteEntireDLL();
        System.out.println("DLL after deleting entire list: ");
        doublyLinkedList.traverseDLL();
    }
}
