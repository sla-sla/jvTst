public class Main {
    public static void main(String[] args) {
        String name = "Петя";

        Car car = new Car();
        System.out.println(Transport.spbToMoscow(name, car));

        Ship ship = new Ship();
        System.out.println(Transport.spbToMoscow(name, ship));
    }
}