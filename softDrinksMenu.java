/**
 * softDrinksMenu
 */
 //importing the scanner
 import java.util.Scanner;
public interface softDrinksMenu {

    static String options(){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("option: ");
            String option = myObj.nextLine();

            

            //executing option to terminal
            System.out.println("Selected option: " + option);

            switch(option){
                case "1" : 
                System.out.println("Coke has being added...");
                confirmOrder.drinksOrdered_array.add("Coke");//added the selected item to Array
                break;
                case "2" : 
                System.out.println("Pespi has being added..."); 
                confirmOrder.drinksOrdered_array.add("Pepsi");//added the selected item to Array
                break;
                case "3" : 
                System.out.println("Cappy Juice has being added..."); 
                confirmOrder.drinksOrdered_array.add("Cappy Juice");//Added the selected item to an array
                break;

                //default value
                default:
                System.out.println("Please select the required option");
            }

            //executing the user message
            System.out.println("Do you want to add another item(Y/n)?");
            String _option = myObj.nextLine();
            switch(_option){
                case "Y":
                //calling the options method
                softDrinksMenu.options();
                break;

                case "n":
                //calling the main menu from the pizzaMenu method
                pizzaMenu.mainMenu();
                break;

                //DEFAULT  option
                default:
                System.out.println("Please select 'Y' or 'n'");
                System.out.println("option: ");

                System.out.println("option: " + _option);
            }
        }

        return null;
        

    }
    
    default void softDrinks(){
        System.out.println("*********************************");
        System.out.println("YOU HAVE SELECTED SOFT DRINKS");
        System.out.println("*********************************");

        //orders
        System.out.println("What would you like to order?");
        System.out.println("1: Coke - R15.00 500ml");
        System.out.println("2: Pepsi - R16.00 500ml");
        System.out.println("3: Cappy Juice - R20.00 500ml can");

        //calling the options method
        options();
    }
};
  

