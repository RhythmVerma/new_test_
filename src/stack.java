public class stack {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        System.out.println("Area of rectangle = " + r1.area());
    }

    static class Rectangle {
        int length;
        int breadth;

        Rectangle(int l, int b) {
            length = l;
            breadth = b;
        }

        int area() {
            return length * breadth;
        }
    }
}
// wap to transfer money from one to another
