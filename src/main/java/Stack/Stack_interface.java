package Stack;

public interface Stack_interface <T>{
    T pop();
    T peek();
    void push(T data);
    boolean is_empty();
    int count();
}
