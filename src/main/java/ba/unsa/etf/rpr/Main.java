package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(15, 30, 45);

        System.out.println(clock.getString());
        clock.next();
        System.out.println(clock.getString());
        clock.move(-48);
        System.out.println(clock.getString());
        clock.set(0, 0, 0);
        System.out.println(clock.getString());
    }
}