package Stack;

public class Stack <T> implements Stack_interface <T>{

    private Stack_node<T> top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    @Override
    public T pop() {
        return this.top.getData();
    }

    @Override
    public T peek(){
        T data_to_retrieve = this.top.getData();
        this.top = this.top.getNext();
        this.size--;
        return data_to_retrieve;
    }

    @Override
    public void push(T data) {
        Stack_node<T> node_to_push = new Stack_node<>(data);
        node_to_push.setNext(this.top);
        this.top = node_to_push;
        this.size++;
    }

    @Override
    public boolean is_empty() {
        return this.size == 0;
    }

    @Override
    public int count() {
        return this.size;
    }
}
