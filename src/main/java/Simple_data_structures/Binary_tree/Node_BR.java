package Simple_data_structures.Binary_tree;

public class Node_BR {
    private Node_BR left,right,parent;
    private int data;
    private boolean is_red;


    public Node_BR(int data, boolean is_red) {
        this.left = null;
        this.right = null;
        this.parent = null;
        this.data = data;
        this.is_red = is_red;
    }

    public Node_BR getLeft() {
        return left;
    }

    public void setLeft(Node_BR left) {
        this.left = left;
    }

    public Node_BR getRight() {
        return right;
    }

    public void setRight(Node_BR right) {
        this.right = right;
    }

    public Node_BR getParent() {
        return parent;
    }

    public void setParent(Node_BR parent) {
        this.parent = parent;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean is_red() {
        return is_red;
    }

    public void setIs_red(boolean is_red) {
        this.is_red = is_red;
    }
}
