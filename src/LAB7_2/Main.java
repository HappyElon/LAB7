package LAB7_2;

public class Main {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(1, 2);
        MovablePoint bottomRight = new MovablePoint(4, 5);

        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);
        System.out.println(topLeft.toString());
        System.out.println(bottomRight.toString());
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(topLeft.toString());
        System.out.println(bottomRight.toString());
    }
}

