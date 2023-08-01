public class Car extends Transport {
    public Car(){
        super(100);
    }
    String action = " поехал на машине ";
    @Override
    public String transfer(String name, String from, String to) {
        spendFuel(10);
        return name +  action + from + to;
    }
}
