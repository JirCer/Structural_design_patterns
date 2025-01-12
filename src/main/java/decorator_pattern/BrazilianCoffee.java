package decorator_pattern;

public class BrazilianCoffee extends CoffeeDecorator{
    public BrazilianCoffee(Coffee newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() + "Brazilian coffee with caramel and milk";
    }
    public double priceCoffee(){
        return super.priceCoffee() + 3.0;
    }
}
