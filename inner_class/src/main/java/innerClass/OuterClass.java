package innerClass;

public class OuterClass {

    int x = 5;

//    public class InnerClass {
//    private class InnerClass {
//    protected class InnerClass {
    static class InnerClass {

        int y = 75;

        public int innerMethod() {
            return y;
        }

    }

}
