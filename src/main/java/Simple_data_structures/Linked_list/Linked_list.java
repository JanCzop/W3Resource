package Simple_data_structures.Linked_list;

import Simple_data_structures.Sorted_linked_list.Node_SLL;

public class Linked_list {
    private Node_LL head;

    public Linked_list() {
        this.head = null;
    }

    public Linked_list(Node_LL head) {
        this.head = head;
    }

    public void add_node(int data) {
        Node_LL newNode = new Node_LL(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node_LL current = head;
        while (current.getNext_node() != null) {
            current = current.getNext_node();
        }
        current.setNext_node(newNode);
    }

    public boolean delete_node(int data) {
        if (head == null) return false;
        if (head.getData() == data) {
            head = head.getNext_node();
            return true;
        }
        Node_LL previous = head;
        Node_LL current = head.getNext_node();
        while (current != null) {
            if (current.getData() == data) {
                previous.setNext_node(current.getNext_node());
                return true;
            }
            previous = current;
            current = current.getNext_node();
        }
        return false;
    }

    public Node_LL find_node(int data) {
        Node_LL current = head;
        while (current != null) {
            if (current.getData() == data) return current;
            current = current.getNext_node();
        }
        return null;
    }

    public int count() {
        int count = 0;
        Node_LL current = head;
        while (current != null) {
            count++;
            current = current.getNext_node();
        }
        return count;
    }

    public void reverse_list() {
        Node_LL previous = null;
        Node_LL current = head;
        Node_LL next = null;
        while (current != null) {
            next = current.getNext_node();
            current.setNext_node(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }

    public Node_LL getHead() {
        return head;
    }

    public void setHead(Node_LL head) {
        this.head = head;
    }
}
