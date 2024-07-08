package Simple_data_structures.Sorted_linked_list;

import Basic_part_I.My_linked_list;

public class Sorted_linked_list {
    private Node_SLL head;

    public Sorted_linked_list() {
        this.head = null;
    }

    public Sorted_linked_list(Node_SLL head) {
        this.head = head;
    }

    public boolean add_node(int data){
        Node_SLL node = new Node_SLL(data);

        if(this.head == null) {
            head = node;
            return true;
        }
        if(this.head.getData() >= node.getData()){
            if(this.head.getData() == node.getData()) return false;
            else {
                node.setNext_node(this.head);
                this.head = node;
                return true;
            }
        }
        Node_SLL previous = this.head;
        Node_SLL current = this.head.getNext_node();
        while(current != null){
            if(current.getData() == node.getData()) return false;
            if(current.getData() > node.getData()){
                previous.setNext_node(node);
                node.setNext_node(current);
                return true;
            }
            else {
                previous = current;
                current = current.getNext_node();
            }
        }
        previous.setNext_node(node);
        node.setNext_node(null);
        return true;
    }

    public boolean delete_node(int data){
        if(this.head == null) return false;
        if(head.getData() == data){
            this.head = this.head.getNext_node();
            return true;
        }
        Node_SLL previous = this.head;
        Node_SLL current = this.head.getNext_node();
        while(current != null){
            if(current.getData() == data){
                previous.setNext_node(current.getNext_node());
                return true;
            }
            previous = current;
            current = current.getNext_node();
        }
        return false;
    }

    public Node_SLL find_node(int data){
        Node_SLL current = this.head;
        while (current != null){
            if(current.getData() == data) return current;
            current = current.getNext_node();
        }
        return null;
    }

    public int count(){
        int count = 0;
        Node_SLL current = this.head;
        while (current != null){
            count++;
            current = current.getNext_node();
        }
        return count;
    }

    public void reverse_list(){
        Node_SLL previous = null;
        Node_SLL current = this.head;
        Node_SLL next = null;
        while(current != null){
            next = current.getNext_node();
            current.setNext_node(previous);
            previous = current;
            current = next;
        }
        this.head = previous;
    }
















    public Node_SLL getHead() {
        return head;
    }

    public void setHead(Node_SLL head) {
        this.head = head;
    }
}
