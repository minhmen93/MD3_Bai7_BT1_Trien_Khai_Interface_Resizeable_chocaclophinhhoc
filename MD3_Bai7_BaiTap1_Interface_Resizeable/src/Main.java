

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        Resizeable rectangle;
        rectangle = new Rectangle(6, 3);
        shapes[0] = new Circle(5);
        shapes[1] = rectangle;
        shapes[2] = new Square(3);
        Random random = new Random();
        for (Resizeable shape : shapes) {
            double percent = random.nextInt(100) + 1;
            System.out.println("Area before resizing: " + shape.getArea());
            shape.resize(percent);
            System.out.println("Area after resizing: " + shape.getArea());
            System.out.println();
    }
}
     }

