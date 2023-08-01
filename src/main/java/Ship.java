public class Ship extends Transport{
    public Ship() {
        super(500);
    }
    String action = " поплыл из ";
    @Override
    public String transfer(String name, String from, String to) {

        spendFuel(80);
        return name + action + from + to;
    }
}
