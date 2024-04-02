class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insertNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    public static void removeAfter(Node n) { //removeafter method
        if (n == null || n.next == null) {
            return;
        }
        n.next = n.next.next;
    }

    public static Node copy(Node head) { //copy method
        if (head == null) {
            return null;
        }
        Node headCopy = new Node(head.data);
        Node curr = headCopy;
        Node firstCurr = head.next;

        while (firstCurr != null) {
            curr.next = new Node(firstCurr.data);
            curr = curr.next;
            firstCurr = firstCurr.next;
        }
        return headCopy;
    }

    public static void removeDuplicate(Node head, int key) { //removeduplicate method
        if (head == null) {
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public static int max(Node head) { //max method
        if (head == null) {
            return 0;
        }

        int maxNum = head.data;
        Node current = head.next;

        while (current != null) {
            if (current.data > maxNum) {
                maxNum = current.data;
            }
            current = current.next;
        }
        return maxNum;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        //moving through linkedlist
        while (currNode != null) {
            System.out.print(currNode.getData() + " ");
            currNode = currNode.getNext();
        }
    }
}