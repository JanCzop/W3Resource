package Stack;

public class Stack_node<T> {
    private T data;
    private Stack_node<T> next;
    public Stack_node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Stack_node<T> getNext() {
        return next;
    }

    public void setNext(Stack_node<T> next) {
        this.next = next;
    }
}
