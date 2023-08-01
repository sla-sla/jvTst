import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        String name = "Петя";

        Ship ship = new Ship();
        Car car = new Car();

        // when:

        boolean isValue1 = Transport.spbToMoscow(name, ship).contains("поплыл");
        boolean isValue2 = Transport.spbToMoscow(name, car).contains("поехал");

        // then:
        Assertions.assertTrue(isValue1);
        Assertions.assertTrue(isValue2);

    }
}