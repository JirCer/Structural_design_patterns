package decorator_pattern;

public class ArabicaCoffeeType implements Coffee {

    @Override
    public String prepareCoffee() {
        return "Type coffee Arabica\n";
    }

    @Override
    public double priceCoffee() {
        return 2.50;
    }

}
