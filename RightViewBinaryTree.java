package Assignment23;

import java.util.LinkedList;
import java.util.Queue;

class A
{
    int data;
    A left, right;
    A(int item) 
    {
        data = item;
        left = right = null;
    }
}
public class RightViewBinaryTree 
{
    A root;

    void printRightView() 
    {
        if (root == null) 
        {
            return;
        }
        Queue<A> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            for (int i = 0; i < size; i++) 
            {
                A node = queue.poll();
                if (i == size - 1) 
                {
                    System.out.print(node.data + " ");
                }
                if (node.left != null) 
                {
                    queue.add(node.left);
                }
                if (node.right != null) 
                {
                    queue.add(node.right);
                }
            }
        }
    }
    public static void main(String args[]) {
        RightViewBinaryTree tree = new RightViewBinaryTree();
        tree.root = new A(1);
        tree.root.left = new A(2);
        tree.root.right = new A(3);
        tree.root.left.left = new A(4);
        tree.root.left.right = new A(5);
        tree.root.right.left = new A(6);
        tree.root.right.right = new A(7);
        tree.root.right.right.right = new A(8);
        
        tree.printRightView();
    }
}

