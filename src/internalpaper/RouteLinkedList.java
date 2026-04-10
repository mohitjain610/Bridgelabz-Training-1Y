package internalpaper;

public class RouteLinkedList<T extends Checkpoint> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
}

