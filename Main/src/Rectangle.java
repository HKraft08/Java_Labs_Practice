public class Rectangle {

    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void area() {
        System.out.println("Area: " + (this.width * this.height));
    }

    void perimeter() {
        System.out.println("Perimeter: " + (2 * (this.width + this.height)));
    }
}
