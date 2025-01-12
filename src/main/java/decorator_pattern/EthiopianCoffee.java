package decorator_pattern;

public class EthiopianCoffee extends CoffeeDecorator{
    public EthiopianCoffee(Coffee newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() + "Ethiopian coffee with chocolate and cinnamon";
    }
    public double priceCoffee(){
        return super.priceCoffee() + 4.0;

    }
}
