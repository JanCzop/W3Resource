package Simple_data_structures.Sorted_linked_list;

public class Node_SLL {
    private int data;


    private Node_SLL next_node;

    public Node_SLL(int data) {
        this.data = data;
        this.next_node = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node_SLL getNext_node() {
        return next_node;
    }

    public void setNext_node(Node_SLL next_node) {
        this.next_node = next_node;
    }
}
