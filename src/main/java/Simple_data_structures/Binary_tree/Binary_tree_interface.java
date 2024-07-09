package Simple_data_structures.Binary_tree;

import java.util.List;

public interface Binary_tree_interface {
    void insert(int data);
    boolean delete(int data);
    boolean search(int data);
    List inorder_to_list();
    List preorder_to_list();
    List postorder_to_list();
    int count();
    int depth();
    boolean isEmpty();
    int find_min();
    int find_max();
}
