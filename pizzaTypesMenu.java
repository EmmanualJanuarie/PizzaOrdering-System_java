//importing the scanner method
import java.util.Scanner;

public interface pizzaTypesMenu {
        //creating a method
        static void options(){
            try (Scanner myObj = new Scanner(System.in)) {
                System.out.println("option: ");
                String options = myObj.nextLine();
    
                //execute to the terminal
                System.out.println("Selected option: " + options);

                //switch statement to determine wich item was selected
                switch(options){
                    case "1":
                    System.out.println("Pineapple Pizza has been added...");//executing that the item has been selected
                    confirmOrder.pizzaOrdered_array.add("Pineapple Pizza");//Added pineapple pizza to the array
                    confirmOrder.pizzaPrice_array.add(30.45f);//Added the price of the pizza to the array
                    break;

                    case "2":
                    System.out.println("Pepperoni Pizza has been added...");//executing that the item has been selected
                    confirmOrder.pizzaOrdered_array.add("Pepperoni Pizza");//Added pepperoni pizza to the array
                    confirmOrder.pizzaPrice_array.add(35.00f);//Added the price of the pizza to the array
                    break;

                    case "3":
                    System.out.println("Veggie Pizza has been added...");//executing that the item has been selected
                    confirmOrder.pizzaOrdered_array.add("Veggie Pizza");//Added veggie pizza to the array
                    confirmOrder.pizzaPrice_array.add(40.00f);//Added the price of the pizza to the array
                    break;

                    //defualt option
                    default:
                    System.out.println("Please select the correct option!");//Message to user if the wrong option is entered
                }

                //user continue message
                System.out.println();
                System.out.println("Would you like to add another item(Y/n)?");
                String _options = myObj.nextLine();

                //Switch statement to determine if user want;s to add a item or not
                switch(_options){
                    case "Y":
                    pizzaTypesMenu.options();
                    break;

                    case "n":
                    pizzaMenu.mainMenu();
                    break;

                    //default option
                    default:
                    System.out.println("Please select (Y/n)");
                }

            }
        }

    default void _pizzaMenu(){
        System.out.println("*********************************");
        System.out.println("YOU HAVE SELECTED PIZZA MENU");
        System.out.println("*********************************");

        //Orders
        System.out.println("What would you like to order?");
        System.out.println("1: Pineapple Pizza R30.45 L");
        System.out.println("2: Pepperoni Pizza R35. L");
        System.out.println("3: Veggie Pizza R40.00 L");

        options();


    }
}


  
