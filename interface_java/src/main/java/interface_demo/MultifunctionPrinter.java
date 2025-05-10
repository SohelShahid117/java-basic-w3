package interface_demo;

public class MultifunctionPrinter implements Printable, Scanable {

    @Override
    public void print() {
        System.out.println("print the Bill");
    }

    @Override
    public void scan() {
        System.out.println("Scan the check");
    }

    void hello() {
        System.out.println("hello shahid");
    }

}
