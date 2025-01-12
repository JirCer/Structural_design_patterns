package decorator_pattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Decorator Test Types Of Coffee")
class DecoratorTest {
    private static ArabicaCoffeeType basicCoffee;
    private static BrazilianCoffee brazilianCoffee;
    private static EthiopianCoffee ethiopianCoffee;
    private static YemeniCoffee yemeniCoffee;
    private static ByteArrayInputStream bais;

    @BeforeAll
    static void setUp() {
        basicCoffee = new ArabicaCoffeeType();
        brazilianCoffee = new BrazilianCoffee(new ArabicaCoffeeType());
        ethiopianCoffee = new EthiopianCoffee(new ArabicaCoffeeType());
        yemeniCoffee = new YemeniCoffee(new ArabicaCoffeeType());
        System.out.println("setUp method called");
    }
    @AfterAll
    static void tearDown() {
        basicCoffee = null;
        brazilianCoffee = null;
        ethiopianCoffee = null;
        yemeniCoffee = null;
        System.out.println("tearDown method called");
    }



    @Test
    void testBasicCoffee() {
        basicCoffee = new ArabicaCoffeeType();

        String description = basicCoffee.prepareCoffee();
        double price = basicCoffee.priceCoffee();

        assertThat(description, containsString("Type coffee Arabica"));
        assertThat(price, is(2.5));
    }

    @Test
    void testBrazilianCoffee() {
        brazilianCoffee = new BrazilianCoffee(new ArabicaCoffeeType());

        String description = brazilianCoffee.prepareCoffee();
        double price = brazilianCoffee.priceCoffee();

        assertThat(description, containsString("Type coffee Arabica"));
        assertThat(description, containsString("Brazilian coffee with caramel and milk"));
        assertThat(price, is(5.5));
    }

    @Test
    void testEthiopianCoffee() {
        ethiopianCoffee = new EthiopianCoffee(new ArabicaCoffeeType());

        String description = ethiopianCoffee.prepareCoffee();
        double price = ethiopianCoffee.priceCoffee();

        assertThat(description, containsString("Type coffee Arabica"));
        assertThat(description, containsString("Ethiopian coffee with chocolate and cinnamon"));
        assertThat(price, is(6.5));
    }

    @Test
    void testYemeniCoffee() {
        yemeniCoffee = new YemeniCoffee(new ArabicaCoffeeType());

        String description = yemeniCoffee.prepareCoffee();
        double price = yemeniCoffee.priceCoffee();

        assertThat(description, containsString("Type coffee Arabica"));
        assertThat(description, containsString("Yemeni Coffee with honey and whipped cream"));
        assertThat(price, is(4.50));
    }
    @Test
    void testMenuWithBasicCoffee() throws IOException {
//        Simulate user input "1" followed by "0" to exit
        bais = new ByteArrayInputStream("1\n0\n".getBytes());
        System.setIn(bais);



    }
}