class Main {
  public static void main(String[] args) {
    
  }
   public static void ex1(BinNode<Integer> root) {
        if (root == null) 
            return;
        if (root.getValue() % 2 == 0 && !hasOddChild(root))
            System.out.println(root.getValue());
        ex1(root.getLeft());
        ex1(root.getRight());
    }

    public static int ex2(BinNode<Integer> root) {
        if (root == null)
            return 0;
        int count = 0;
        if (root.getValue() % 2 == 0 && !hasOddChild(root))
            count = 1;
        return count + ex2(root.getLeft()) + ex2(root.getRight());
    }

    public static boolean ex3(BinNode<Integer> root) {
        if (root == null) 
            return false;
        if (root.getValue() % 2 == 0 && !hasOddChild(root))
            return true;
        return ex3(root.getLeft()) || ex3(root.getRight());
    }

    public static boolean ex4(BinNode<Integer> root) {
        if (root == null) 
            return true;
        if (root.getValue() % 2 != 0 || hasOddChild(root)) 
            return false;
        return ex4(root.getLeft()) && ex4(root.getRight());
    }

    public static boolean hasOddChild(BinNode<Integer> root) {
        if (root.hasLeft() && root.getLeft().getValue() % 2 != 0)
            return true;
        if (root.hasRight() && root.getRight().getValue() % 2 != 0) 
            return true;
        return false;
    }
  public static int Hight(BinNode<Integer> t)
	{
	    if(t==null)
	    {
	        return 0;
	    }
	    if(1+Hight(t.getRight())>1+Hight(t.getLeft()))
	    {
	        return(1+Hight(t.getRight()));
	    }
	    else
	    {
	        return(1+Hight(t.getLeft()));
	    }
	}
	public static int maxVal(BinNode<Integer> t, int num)
	{
	    if(t==null)
	    {
	        return num;
	    }
	    if(t.getValue()>num)
	    {
	        num = t.getValue();
	        return(Math.max(maxVal(t.getRight(),num),maxVal(t.getLeft(),num)));
	    }
	    return(Math.max(maxVal(t.getRight(),num),maxVal(t.getLeft(),num)));
	}
	public static boolean isBalanced(BinNode<Integer> t)
    {
        if(t == null)
        {
            return true;
        }
        if(Math.abs(Hight(t.getLeft()) - Hight(t.getRight())) > 1)
        {
            return false;
        }
        return isBalanced(t.getLeft()) && isBalanced(t.getRight());
    }
    public static boolean ex22(BinNode<Integer> t)
    {
        if(t==null)
        {
            return true;
        }
        if(!t.hasRight()&&t.hasLeft()) || t.hasRight() && !t.hasLeft();
        {
            return false;
        }
        return ex22(t.getLeft()) && ex22(t.getRight());
    }
}
