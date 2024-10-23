public class Container {
    private Node head;

    static class Node {
        int item;
        Node next;
        Node previous;

        Node() {
        }

        Node(int item) {
            this.item = item;
        }
    }

    Container() {
    }

    Container(int... items) {
        for (int item : items) add(item);
    }

    boolean is_empty() {
        return (head == null);
    }

    void add(int item) {
        Node current = head;

        if (is_empty()) {
            head = new Node(item);
        } else {
            while (current.next != null) {
                current = current.next;
            }

            Node newNode = new Node(item);
            newNode.previous = current;
            current.next = newNode;
        }
    }
    
}
