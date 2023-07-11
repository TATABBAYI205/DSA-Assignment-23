package Assignment23;

public class BinaryTreeDepth 
{
    static int index = 0;
    public static int calculateDepth(String preorder) 
    {
        if (index >= preorder.length()) 
        {
            return 0;
        }
        if (preorder.charAt(index) == 'l') 
        {
            index++;
            return 0;
        }
        index++; 
        int leftDepth = calculateDepth(preorder); 
        int rightDepth = calculateDepth(preorder);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void main(String[] args) 
    {
        String preorder = "nlnll";
        int depth = calculateDepth(preorder);
        System.out.println(depth);
    }
}

