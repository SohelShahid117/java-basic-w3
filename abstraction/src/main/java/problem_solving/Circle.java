package problem_solving;

public class Circle extends Shape {

    Circle(double r) {
        super(r, r);
    }

    void area() {

        double result = 3.1416 * base * base;
        System.out.println("circle area:" + result);

    }

}
