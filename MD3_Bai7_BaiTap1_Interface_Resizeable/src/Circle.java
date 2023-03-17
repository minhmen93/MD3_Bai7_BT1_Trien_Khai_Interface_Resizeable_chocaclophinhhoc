public class Circle implements Resizeable {
    private double radius;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void resize(double percent) {
        this.radius *= (1 + percent / 100);
    }



    }

