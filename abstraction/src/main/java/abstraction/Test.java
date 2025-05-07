package abstraction;

public class Test {

    public static void main(String[] args) {

//        MobileUser mu = new MobileUser();
        MobileUser mu;

        Rahim R = new Rahim();
        R.sendMessage();

        mu = new Rahim();
        mu.sendMessage();
        mu.call();

        Karim K = new Karim();
        K.sendMessage();

        mu = new Karim();
        mu.sendMessage();

    }

}
