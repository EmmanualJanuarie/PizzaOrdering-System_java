//importing scanner
import java.util.Scanner; // will allows us to enter text in terminal

public class pizzaMenu implements softDrinksMenu, pizzaTypesMenu, sideorderMenu{
    //Creating a method for the main menu
    static void mainMenu(){
        pizzaMenu pizzaMenu = new pizzaMenu();// Fabricating the pizzaMenu class as a local variable

        try (Scanner myObj = new Scanner(System.in)) { // prevents resource leaks
            System.out.println("*********************************");
            System.out.println("Welcome to KRUSTY CRAB PIZZA");
            System.out.println("*********************************");

            //orders
            System.out.println("What would you like to order?");
            System.out.println("1: Soft drinks");
            System.out.println("2: Pizza");
            System.out.println("3: Side orders");
            System.out.println("4: Confirm Order");
            System.out.println("5: Exit Menu");

            //coding for input

            System.out.println("Option: ");
            // Fabricating the vatiable 
            String option = myObj.nextLine();

            //printing selected option
            System.out.println("Selected Option: " + option);


            //Conditional statement
            switch(option){
                case "1":
                //call the Soft drinks method
                pizzaMenu.softDrinks();// calling softdrinks method from softDrinks file
                break;

                case "2":
                //call the pizza method
                pizzaMenu._pizzaMenu();// calling the pizza menu method from the pizza types menus file
                break;

                case "3":
                //call the side orders method
                pizzaMenu.sideOrderMenu();
                break;

                case "4":
                //call the Confirm order method
                confirmOrder.recipt();
                break;

                case "5":
                //Exit the menu
                System.out.println("Thanks for Dinning at the Krusty Crab Pizza");
                System.exit(0);
                break;

                default:
                System.out.println("Please select the correct option.");
                
            }
        }

 
    };

    public static void main(String[] args){
        //calling main menu method
        mainMenu();

    }
}
