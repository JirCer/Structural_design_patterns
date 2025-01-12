package decorator_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorMenu {
    private static int chooseCoffee;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do{
            System.out.println("--------------Coffee Menu-------------");
            System.out.println("           1. Basic Coffee            ");
            System.out.println("           2. Brazilian Coffee         ");
            System.out.println("           3. Ethiopian Coffee        ");
            System.out.println("           4. Yemeni Coffee           ");
            System.out.println("           Choose your coffee:         ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            chooseCoffee = Integer.parseInt(br.readLine());
            switch(chooseCoffee){
                case 1:{
                    ArabicaCoffeeType act= new ArabicaCoffeeType();
                    System.out.println(act.prepareCoffee());
                    System.out.println(act.priceCoffee());
                }
            break;
                case 2:{
                    BrazilianCoffee bc= new BrazilianCoffee(new ArabicaCoffeeType());
                    System.out.println(bc.prepareCoffee());
                    System.out.println(bc.priceCoffee());
                }
            break;
                case 3:{
                    EthiopianCoffee ec = new EthiopianCoffee(new ArabicaCoffeeType());
                    System.out.println(ec.prepareCoffee());
                    System.out.println(ec.priceCoffee());
                }
            break;
                case 4:{
                    YemeniCoffee yc= new YemeniCoffee(new ArabicaCoffeeType());
                    System.out.println(yc.prepareCoffee());
                    System.out.println(yc.priceCoffee());
                }
            break;
                default:
                    System.out.println("Invalid choice");
            }
            return;
        }
        while (chooseCoffee != 0);

    }

}
