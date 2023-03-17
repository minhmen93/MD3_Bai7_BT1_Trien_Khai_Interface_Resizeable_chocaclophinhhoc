public class Rectangle implements Resizeable {
        private double width;
        private double height;

        public Rectangle() {

        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public void resize(double percent) {
            this.height *= (1 + percent / 100);
            this.width *= (1 + percent / 100);
        }

        public double getArea() {
            return width * height;
        }
    }


