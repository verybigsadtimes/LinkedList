import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digits:"); //creating linkedlist
        for (int i = 0; i < 5; i++) {
            try {
                int data = Integer.parseInt(scanner.nextLine());
                list.insertNode(data);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid int:");
                i--;
            }
        }
        //prints original list
        System.out.println("Linked list:");
        LinkedList.printList(list);
        System.out.println();

        //removeAfter method output
        System.out.println("removeAfter output:");
        LinkedList.removeAfter(list.head);
        LinkedList.printList(list);
        System.out.println();

        //copy method output
        System.out.println("copy output:");
        Node headCopy = LinkedList.copy(list.head);
        LinkedList copiedList = new LinkedList();
        copiedList.head = headCopy;
        LinkedList.printList(copiedList);
        System.out.println();

        //removeDuplicate method output
        System.out.println("removeDuplicate output (enter int to remove duplicates of:");
        try {
            int key = Integer.parseInt(scanner.nextLine());
            LinkedList.removeDuplicate(list.head, key);
            System.out.println("list after removeDuplicate:");
            LinkedList.printList(list);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid int.");
        }

        //max method output
        int max = LinkedList.max(list.head);
        System.out.println("max method output: " + max);
    }
}