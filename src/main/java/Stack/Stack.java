package Stack;

import Util.Time_util;

import java.util.*;
import java.util.function.Predicate;

public class Stack <T extends Comparable<T>> implements Stack_interface <T>{

    private Stack_node<T> top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    @Override
    public T peek() {
        if (is_empty()) throw new IllegalStateException("Stack is empty");
        return this.top.getData();
    }

    @Override
    public T pop(){
        if (is_empty()) throw new IllegalStateException("Stack is empty");
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

    public void order(boolean ascending){
        if (this.top == null || this.top.getNext() == null) return;
        boolean swapped;
        do {
            swapped = false;
            Stack_node<T> previous = null;
            Stack_node<T> current = this.top;
            Stack_node<T> next = this.top.getNext();
            while (next != null) {
                if (( ascending && current.getData().compareTo(next.getData()) > 0) ||
                        (!ascending && current.getData().compareTo(next.getData()) < 0)) {
                    swapped = true;
                    Stack_node<T> tmp = next.getNext();
                    if (previous != null) {
                        previous.setNext(next);
                    } else {
                        top = next;
                    }
                    next.setNext(current);
                    current.setNext(tmp);
                    previous = next;
                    next = current.getNext();
                }
                else {
                    previous = current;
                    current = next;
                    next = next.getNext();
                }
            }
        } while (swapped);
    }

    public void reverse_by_rec() {
        if (is_empty()) return;
        T data = pop();
        reverse_by_rec();
        insertAtBottom(data);
    }

    private void insertAtBottom(T data) {
        if (is_empty()) {
            push(data);
        } else {
            T temp = pop();
            insertAtBottom(data);
            push(temp);
        }
    }

    public void reverse_by_list(){
        List<T> list = new ArrayList<>();
        while (this.top != null) list.add(pop());
        for (T data : list) push(data);
    }

    public Stack<T> copy() {
        Stack<T> newStack = new Stack<T>();
        Stack_node<T> current = this.top;
        Stack<T> tempStack = new Stack<T>();
        while (current != null) {
            tempStack.push(current.getData());
            current = current.getNext();
        }
        while (!tempStack.is_empty()) {
            newStack.push(tempStack.pop());
        }
        return newStack;
    }

    public T find_min(){
        Stack_node<T> current = this.top;
        if (current == null) return null;
        T min = current.getData();
        while (current != null){
            if(current.getData().compareTo(min) < 0) min = current.getData();
            current = current.getNext();
        }
        return min;
    }

    public T find_max(){
        Stack_node<T> current = this.top;
        if (current == null) return null;
        T max = current.getData();
        while (current != null){
            if(current.getData().compareTo(max) > 0) max = current.getData();
            current = current.getNext();
        }
        return max;
    }

    public boolean is_present(T data){
        Stack_node<T> current = this.top;
        while (current != null){
            if (current.getData().equals(data)) return true;
            current = current.getNext();
        }
        return false;
    }

    public void remove_duplicates(){
        if (this.top == null || this.top.getNext() == null) return;
        Stack_node<T> previous = null;
        Stack_node<T> current = this.top;
        Set<T> set = new HashSet<>();
        while (current != null){
            if (set.add(current.getData())) previous = current;
            else previous.setNext(current.getNext());
            current = current.getNext();
        }
    }

    public T get(int n){
        if (n < 0 || n > count()-1) return null;
        Stack_node<T> current = this.top;
        int counter = 0;
        while (counter != n){
            counter++;
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean find(T data){
        return find_node(data) == null;
    }
    private Stack_node<T> find_node(T data){
        if (is_empty()) return null;
        Stack_node<T> current = this.top;
        while (current != null){
            if (current.getData().equals(data)) return current;
            current = current.getNext();
        }
        return null;
    }

    public T get_bottom(){
        return get(count()-1);
    }
    public T get_nth_from_top(int n){
        return get(n);
    }
    public T get_nth_from_bottom(int n){
        return get(count()-1-n);
    }
    public void swap_top(){
        if (this.top == null || this.top.getNext() == null) return;
        Stack_node<T> new_top = this.top.getNext();
        Stack_node<T> new_second = this.top;
        new_second.setNext(new_top.getNext());
        new_top.setNext(new_second);
        this.top = new_top;
    }

    public void merge(Stack<T> stack){
        if (stack == null || stack.is_empty()) return;
        if (this.top == null) this.top = stack.top;
        else {
        Stack_node<T> bottom = get_bottom_node();
        assert bottom != null;
        bottom.setNext(stack.top);
        }
        this.size += stack.size;
    }
    private Stack_node<T> get_bottom_node(){
        if (this.top == null) return null;
        Stack_node<T> current = this.top;
        while (current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }

    public boolean is_substack(Stack<T> stack){
        if (stack == null || stack.is_empty() || this.size < stack.size) return false;
        Stack_node<T> this_current = this.top;
        Stack_node<T> substack_current = stack.top;
        boolean found_subset_top = false;
        while (this_current != null && substack_current != null){
            if (this_current.getData().equals(substack_current.getData())){
                if (!found_subset_top) found_subset_top = true;
                substack_current = substack_current.getNext();
            }
            else if (found_subset_top) return false;
            this_current = this_current.getNext();
        }
        return (found_subset_top && substack_current == null);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != Stack.class) return false;
        @SuppressWarnings("unchecked")
        Stack<T> stack_ref = (Stack<T>) obj;
        if (this.size != stack_ref.size) return false;
        Stack_node<T> current_this = this.top;
        Stack_node<T> current_other = stack_ref.top;
        while(current_this != null && current_other != null){
            if (!current_this.getData().equals(current_other.getData())) return false;
            current_this = current_this.getNext();
            current_other = current_other.getNext();
        }
        return (current_this == null && current_other == null);
    }

    public Stack<T> stacks_common(Stack<T> other){
        if (other == null) return null;
        Stack<T> new_stack = new Stack<T>();
        if (this.is_empty() || other.is_empty()) return new_stack;
        Set<T> other_elems = new HashSet<>();
        Stack_node<T> current_other = other.top;
        while (current_other != null){
            other_elems.add(current_other.getData());
            current_other = current_other.getNext();
        }
        Stack_node<T> current_this = this.top;
        while (current_this != null){
            if (other_elems.contains(current_this.getData()))
                new_stack.push(current_this.getData());
            current_this = current_this.getNext();
        }
        return new_stack;
    }

    public boolean satisfies_condition(Predicate<T> predicate){
        if (this.is_empty()) return false;
        Stack_node<T> current = this.top;
        while (current != null){
            if (!predicate.test(current.getData())) return false;
            current = current.getNext();
        }
        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> stack_int = new Stack<Integer>();
        for (int i = 0; i < 10000; i++) {
            stack_int.push(random.nextInt(10000));
        }
        Stack<Integer> copy_stack = stack_int.copy();

        Time_util time_util = new Time_util();

        time_util.startMeasuring();
        stack_int.reverse_by_rec();
        System.out.println(time_util.stopMeasuring());

        time_util.startMeasuring();
        copy_stack.reverse_by_list();
        System.out.println(time_util.stopMeasuring());


    }

}
