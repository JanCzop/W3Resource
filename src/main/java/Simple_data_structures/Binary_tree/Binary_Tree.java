package Simple_data_structures.Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree implements Binary_tree_interface{

    private Node_BT root;

    public Binary_Tree(){
        this.root = null;
    }
    @Override
    public void insert(int data) {
        this.root = insert_node(this.root,data);
    }

    private Node_BT insert_node(Node_BT current, int data){
        if(current == null){
            return new Node_BT(data);
        }
        if(data < current.getData()) current.setLeft(insert_node(current.getLeft(),data));
        else if(data > current.getData()) current.setRight(insert_node(current.getRight(),data));
        return current;
    }

    @Override
    public boolean delete(int data) {
        if(search_node(this.root,data) == null) return false;
        this.root = delete_node(this.root, data);
        return true;
    }

    private Node_BT delete_node(Node_BT current, int data){
        if(current == null) return null;

        if(current.getData() > data) current.setLeft(delete_node(current.getLeft(),data));
        if(current.getData() < data) current.setRight(delete_node(current.getRight(),data));
        else {
            if(current.getRight() == null) return current.getLeft();
            else if (current.getLeft() == null) return current.getRight();
            Node_BT successor = find_min_rec(current.getRight());
            current.setData(successor.getData());
            current.setRight(delete_node(current.getRight(),successor.getData()));
        }
        return current;
    }

    @Override
    public boolean search(int data) {
        return search_node(this.root,data) == null;
    }

    @Override
    public List<Node_BT> inorder_to_list() {
        List<Node_BT> list = new ArrayList<>();
        list = inorder_rec(this.root,list);
        return list;
    }

    private List<Node_BT> inorder_rec(Node_BT current, List<Node_BT> list){
        if(current != null){
            inorder_rec(current.getLeft(),list);
            list.add(current);
            inorder_rec(current.getRight(),list);
        }
        return list;
    }

    public Node_BT search_node(Node_BT current, int data){
        if(current == null) return null;

        if(current.getData() == data) return current;
        else if(current.getData() > data) return search_node(current.getLeft(), data);
        else return search_node(current.getRight(),data);
    }

    @Override
    public List<Node_BT> preorder_to_list() {
        List<Node_BT> list = new ArrayList<>();
        list = preorder_rec(this.root,list);
        return list;
    }

    private List<Node_BT> preorder_rec(Node_BT current, List<Node_BT> list){
        if(current != null){
            list.add(current);
            preorder_rec(current.getLeft(),list);
            preorder_rec(current.getRight(),list);
        }
        return list;
    }

    @Override
    public List<Node_BT> postorder_to_list() {
        List<Node_BT> list = new ArrayList<>();
        list = postorder_rec(this.root,list);
        return list;
    }

    private List<Node_BT> postorder_rec(Node_BT current, List<Node_BT> list){
        if(current != null){
            preorder_rec(current.getLeft(),list);
            preorder_rec(current.getRight(),list);
            list.add(current);
        }
        return list;
    }

    @Override
    public int count() {
        return count_rect(this.root);
    }

    private int count_rect(Node_BT current){
        if(current == null) return 0;
        return 1 + count_rect(current.getLeft()) + count_rect(current.getRight());
    }

    @Override
    public int depth() {
        return depth_rec(this.root);
    }

    private int depth_rec(Node_BT current){
        if(isEmpty()) return 0;
        int left_depth = depth_rec(current.getLeft());
        int right_depth = depth_rec(current.getRight());
        return Math.max(left_depth,right_depth)+1;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int find_min() {
        if(this.isEmpty()) throw new IllegalStateException("Tree is empty");
        return find_min_rec(this.root).getData();
    }

    private Node_BT find_min_rec(Node_BT current){
        while(current.getLeft() != null) current = current.getLeft();
        return current;
    }

    @Override
    public int find_max() {
        if(this.isEmpty()) throw new IllegalStateException("Tree is empty");
        return find_max_rec(this.root).getData();
    }

    private Node_BT find_max_rec(Node_BT current){
        while(current.getRight() != null) current = current.getRight();
        return current;
    }



    public Node_BT getRoot() {
        return root;
    }

    public void setRoot(Node_BT root) {
        this.root = root;
    }
}
