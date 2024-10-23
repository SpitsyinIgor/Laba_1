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
}
