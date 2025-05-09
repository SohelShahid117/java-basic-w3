package problem_solving;

public class Triangle extends Shape {

    //base,height
    Triangle(double a, double b) {
//        this.base = a;
//        this.height = b;
        super(a, b);
    }

    void area() {
        double result = 0.5 * base * height;
        System.out.println("Triangle area:" + result);

    }

}
