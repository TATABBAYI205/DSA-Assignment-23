package Assignment23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class B {
    int data;
    B left, right;
    B(int item) 
    {
        data = item;
        left = right = null;
    }
}
class NodeWithHD 
{
    B b;
    int hd;
    NodeWithHD(B b, int hd) 
    {
        this.b = b;
        this.hd = hd;
    }
}
public class BottomViewBinaryTree 
{
    B root;
    void printBottomView() 
    {
        if (root == null) 
        {
            return;
        }
        TreeMap<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<NodeWithHD> queue = new LinkedList<>();
        queue.add(new NodeWithHD(root, 0));
        while (!queue.isEmpty()) 
        {
            NodeWithHD nodeWithHD = queue.poll();
            B b = nodeWithHD.b;
            int hd = nodeWithHD.hd;
            bottomViewMap.put(hd, b.data);
            if (b.left != null) 
            {
                queue.add(new NodeWithHD(b.left, hd - 1));
            }
            if (b.right != null) 
            {
                queue.add(new NodeWithHD(b.right, hd + 1));
            }
        }
        for (int key : bottomViewMap.keySet()) 
        {
            System.out.print(bottomViewMap.get(key) + " ");
        }
    }
    public static void main(String args[]) 
    {
        BottomViewBinaryTree tree = new BottomViewBinaryTree();
        tree.root = new B(20);
        tree.root.left = new B(8);
        tree.root.right = new B(22);
        tree.root.left.left = new B(5);
        tree.root.left.right = new B(3);
        tree.root.right.right = new B(25);
        tree.root.left.right.left = new B(10);
        tree.root.left.right.right = new B(14);
        
        tree.printBottomView();
    }
}

