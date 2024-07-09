package Simple_data_structures.Binary_tree;

import java.util.List;

public class Black_red_tree implements Binary_tree_interface {

    private Node_BR root;
    private Node_BR TNULL;

    public Black_red_tree() {
        TNULL = new Node_BR(0,false);
        root = TNULL;
    }


    @Override
    public void insert(int data) {
        Node_BR node_to_insert = new Node_BR(data, true);
        Node_BR parent = null;
        Node_BR current = this.root;

        while (current != TNULL){
            parent = current;
            if(current.getData() > data) current = current.getLeft();
            else current = current.getRight();
        }
        node_to_insert.setParent(parent);
        if(parent == null){
            this.root = current;
            current.setIs_red(false);
            return;
        }
        else if(parent.getData() > data) parent.setLeft(current);
        else parent.setRight(current);

        if(parent != this.root) fix_insert(node_to_insert);
    }

    private void fix_insert(Node_BR current){
        Node_BR uncle;
        while(current.getParent().is_red()){
            if(current.getParent() == current.getParent().getParent().getLeft()){
                uncle = current.getParent().getParent().getRight();
                if(uncle.is_red()){
                    // Uncle is red, so we have to swap him and parent to black, and grandpa to red
                    current.getParent().setIs_red(false);
                    uncle.setIs_red(false);
                    current.getParent().getParent().setIs_red(true);
                    current = current.getParent().getParent();
                }
            }
            else {
                uncle = current.getParent().getParent().getLeft();

            }
        }
    }

    @Override
    public boolean delete(int data) {
        return false;
    }

    @Override
    public boolean search(int data) {
        return false;
    }

    @Override
    public List inorder_to_list() {
        return null;
    }

    @Override
    public List preorder_to_list() {
        return null;
    }

    @Override
    public List postorder_to_list() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int depth() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int find_min() {
        return 0;
    }

    @Override
    public int find_max() {
        return 0;
    }



    public Node_BR getRoot() {
        return root;
    }

    public void setRoot(Node_BR root) {
        this.root = root;
    }

    public Node_BR getTNULL() {
        return TNULL;
    }

    public void setTNULL(Node_BR TNULL) {
        this.TNULL = TNULL;
    }
}
