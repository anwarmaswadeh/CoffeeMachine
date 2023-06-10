
package coffeemachine1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws EspressoSingleBeans, EspressoSingleWater, EspressoDoubleBeans, EspressoDoubleWater
            , AmricanoSingleBeans, AmricanoSingleWater, AmricanoDoubleBeans, AmricanoDoubleWater {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wants to Start Mechine Y or N ?");
        char c = scan.next().charAt(0);
        if(c == 'Y'|| c == 'y'){
            CoffeeMachine coffee = new CoffeeMachine();
            String menu = " Coffee Menu \n"
                    + "Choose the type of coffee you want:\n"
                    + "1. Espresso\n"
                    + "2. Americano\n"
                    + "3. EXIT";
            do {
                System.out.println(menu);
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("\"Choose the number of shots you want: \\n\"\n" +
                        "+ \"1. Single shot\\n\"\n" +
                        "+ \"2. Double shot\\n\"\n" +
                        "+ \"3. EXIT\";");
                        coffee.makeCoffee(1,scan.nextInt());
                        break;
                    case 2:
                        System.out.println("\"Choose the number of shots you want: \\n\"\n" +
                        "+ \"1. Single shot\\n\"\n" +
                        "+ \"2. Double shot\\n\"\n" +
                        "+ \"3. EXIT\";");
                        coffee.makeCoffee(2,scan.nextInt());
                        break;
                    case 3: 
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!!");
                }
            } while (true);



            }
        }
    }
