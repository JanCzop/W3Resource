package Basic_part_I;

public class My_binary_tree {


    public static class Node_b_tree{
        public int data;
        Node_b_tree left,right;

        public Node_b_tree(int data){
            this.data = data;
            right = left = null;
        }
    }
}
