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
}
