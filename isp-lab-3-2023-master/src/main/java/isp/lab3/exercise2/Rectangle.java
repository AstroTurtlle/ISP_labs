package isp.lab3.exercise2;

public class Rectangle {
    private int length = 2;
    private int width = 1;
    private String color = "red";

    Rectangle() {}

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
    public String getColor() { return color; }
    public int getArea() { return length*width; }
    public int getPerimeter() { return 2*(length+width); }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();

        System.out.println("The length is " + rectangle.getLength());
        System.out.println("The width is " + rectangle.getWidth());
        System.out.println("The color is " + rectangle.getColor());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
