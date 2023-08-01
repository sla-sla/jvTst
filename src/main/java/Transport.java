public abstract class Transport {
    private int fuel;

    public Transport(int fuel){
        this.fuel = fuel;
    }

    public void spendFuel(int fuel){
        this.fuel -= fuel;
    }
    public abstract String transfer(String name, String from, String to);

    public static String spbToMoscow(String name, Transport transport){
       return transport.transfer(name, "SPB", "Moscow");

    }
}
