//importing the scanner method
import java.util.Scanner;

public interface sideorderMenu {

    static void options(){
        try (Scanner myObj = new Scanner(System.in)) {// prevents the resources from being leaked
            System.out.println("option: ");
            String option = myObj.nextLine();

               //execution to the terminal
               System.out.println("Selected option: " + option);

               //Switch statement to determine wha tthe user selected
               switch(option){
                    case "1":
                    System.out.println("Lava Cake has been added...");
                    confirmOrder.side_dishesOrdered_array.add("Lava Cake");//Added the lava cake to the array
                    break;

                    case "2":
                    System.out.println("Anchovies has been added...");
                    confirmOrder.side_dishesOrdered_array.add("Anchovies");//Added the anchovies to the array
                    break;

                    case "3":
                    System.out.println("Chilli Bowl has been added...");
                    confirmOrder.side_dishesOrdered_array.add("Chilli Bowl");//Added the chilli bowl to the array
                    break;

                    //Default option
                    default:
                    System.out.println("Please select the correctr option");
               }

               //Message to user to ask is they would like to contine
               System.out.println("Would you like to add another item(Y/n)?");
               String _options = myObj.nextLine();

                 //Switch statement to determine if user want;s to add a item or not
                 switch(_options){
                    case "Y":
                    sideorderMenu.options();
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
    default void sideOrderMenu(){
        System.out.println("*********************************");
        System.out.println("YOU HAVE SELECTED SIDE ORDER MENU");
        System.out.println("*********************************");

        //Orders
        System.out.println("What would you like to order?");
        System.out.println("1: Lava Cake R20.00 ");
        System.out.println("2: Anchovies R35.00");
        System.out.println("3: Chilli Bowl R40.00");

        options();
    }
}
