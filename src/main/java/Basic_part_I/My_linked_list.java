package Basic_part_I;

public class My_linked_list {

    public Node_l_list head;

    public static class Node_l_list {
        public int data;
        public Node_l_list next_node;
    }

    public void print_list(){
        int counter = 0;
        Node_l_list node = this.head;
        while (node != null){
            System.out.println("Node " + counter + ", data: " + node.data);
            node = node.next_node;
        }
    }

    public void reverse_list(){
        Node_l_list previous = null;
        Node_l_list current = this.head;
        Node_l_list next = null;
        while(current != null){
            next = current.next_node;
            current.next_node = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }
}
