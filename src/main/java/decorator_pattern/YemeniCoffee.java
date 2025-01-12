package decorator_pattern;

public class YemeniCoffee extends CoffeeDecorator{
    public YemeniCoffee(Coffee newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() + "Yemeni Coffee with honey and whipped cream";
    }
    public double priceCoffee(){
        return super.priceCoffee() + 2.0;
    }
}
