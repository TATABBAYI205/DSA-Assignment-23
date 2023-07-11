package Assignment23;

import java.util.LinkedList;
import java.util.Queue;

class Node 
{
    int data;
    Node left, right;
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
public class LeftViewBinaryTree 
{
    Node root;
    void printLeftView() 
    {
        if (root == null) 
        {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            boolean isFirstNode = true;
            for (int i = 0; i < size; i++) 
            {
                Node node = queue.poll();
                if (isFirstNode) 
                {
                    System.out.print(node.data + " ");
                    isFirstNode = false;
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
    public static void main(String args[]) 
    {
        LeftViewBinaryTree tree = new LeftViewBinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(5);
        tree.root.right = new Node(2);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(1);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(7);
        
        tree.printLeftView();
    }
}
