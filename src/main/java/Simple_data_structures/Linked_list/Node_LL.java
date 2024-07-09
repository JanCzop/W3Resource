package Simple_data_structures.Linked_list;

public class Node_LL {
    private int data;


    private Node_LL next_node;

    public Node_LL(int data) {
        this.data = data;
        this.next_node = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node_LL getNext_node() {
        return next_node;
    }

    public void setNext_node(Node_LL next_node) {
        this.next_node = next_node;
    }
}
