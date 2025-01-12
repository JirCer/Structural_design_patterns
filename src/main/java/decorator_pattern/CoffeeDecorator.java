package decorator_pattern;

public abstract class CoffeeDecorator implements Coffee {
    public Coffee newCoffee;

    public CoffeeDecorator(Coffee newCoffee) {
        this.newCoffee = newCoffee;
    }
    @Override
    public String prepareCoffee(){
        return newCoffee.prepareCoffee();
    }
    @Override
    public double priceCoffee(){
        return newCoffee.priceCoffee();
    }




}
