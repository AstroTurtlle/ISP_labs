package isp.lab3.exercise1;

public class Tree {
    public int height;
    public Tree() {
        this.height = 15;
    }
    public void grow(int meters) {
        if(meters >= 1)
            this.height = this.height + meters;
    }

    @Override
    public String toString() {
        return "The height is " + height;
    }

    public static void main(String args[]) {
        Tree tree1 = new Tree();
        System.out.println("First height is " + tree1.height);

        tree1.grow(30);
        System.out.println("Second height is " + tree1.height);

        System.out.println(tree1.toString());
    }
}
