package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(Maths.sin(Double.parseDouble(arg)));
            System.out.println(Maths.fact(Integer.parseInt(arg)));
        }
    }
}