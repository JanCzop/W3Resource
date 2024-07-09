package Simple_data_structures.Binary_tree;

public class Node_BT {
    private int data;
    private Node_BT left,right;

    public Node_BT(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public Node_BT getLeft() {
        return left;
    }

    public void setLeft(Node_BT left) {
        this.left = left;
    }

    public Node_BT getRight() {
        return right;
    }

    public void setRight(Node_BT right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
