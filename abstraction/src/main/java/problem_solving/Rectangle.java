package problem_solving;

public class Rectangle extends Shape {

    Rectangle(double dim1, double dim2) {
//        this.base = dim1;
//        this.height = dim2;
        super(dim1, dim2);
    }

    void area() {
//        double result = dim1 * dim2;
        double result = base * height;
        System.out.println("Recatngle area:"+result);
    }

}
