public class Node {
    private Object item;
    private Node next;
    private Node prev;

    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(Object item, Node next, Node prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prevNode) {
        prev = prevNode;
    }

    public Node getPrev() {
        return prev;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public String toString() {
        return item.toString();
    }

    public static void main(String[] args) {
        Node node3 = new Node("Node3");
        Node node2 = new Node("Node2", node3);
        Node node1 = new Node("Node1", node2, node3);

        node2.setPrev(node1);
        // node3.setNext(node1); // คอมเม้นอันนี้เพื่อไม่ให้วนกลับไปที่ node1
        node3.setPrev(node2);

        System.out.println("First sweep:");
        // ระวัง loop เพราะเป็น doubly linked list วนกลับไปที่เดิม
        for (Node current = node1; current != null; current = current.getNext())
            System.out.println(current);
    }
}
