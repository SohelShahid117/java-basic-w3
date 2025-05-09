package problem_solving;

public class Test {

    public static void main(String[] args) {
        Shape S;
        S = new Rectangle(10, 20);
        S.area();

        S = new Circle(10);
        S.area();

        S = new Triangle(10, 20);
        S.area();

    }

}
