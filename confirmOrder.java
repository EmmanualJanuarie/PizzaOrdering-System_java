//importing arrayLsit
import java.util.ArrayList;
//importing list
import java.util.List;


public interface confirmOrder {

    // Publicaly declaring variables and arrays
     //for pizza order
     List<String> pizzaOrdered_array = new ArrayList<>();  
     List<Float> pizzaPrice_array = new ArrayList<>();//array for pizza price
    
      //for drink order
      List<String> drinksOrdered_array = new ArrayList<>();//array for the softdrinks ordered
      List<Integer> drinksPrices_array = new ArrayList<>();//array for the drink prices


      //for side-dishes order
      List<String> side_dishesOrdered_array = new ArrayList<>();//array for the sidedishes ordered
      List<Integer> side_dishesPrices_array = new ArrayList<>();//array for the sidedishes prices

      //while loop to calculate the sum of the pizza
      int ArrayLength_pizza = pizzaPrice_array.;
    //   while(){

    //   }
     


    static void recipt(){
        System.out.println("*********************************");
        System.out.println("**********YOUR RECIEPT***********");

        // For loop created for pizza order
       for (String x : pizzaOrdered_array) {
            System.out.println("Pizza ordered: " + x );//printing the ordered pizzas
            System.out.println("Pizza Price: R" + pizzaPrice_array);//printing the price of the pizza
            System.out.println("_______________________");
            System.out.println();
       }
        // Sum of the pizza price
        System.out.println("Total of Pizza: R" + ArrayLength_pizza);//total of the pizza prices
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

       //For loop created for softDrinks Order
       for(String x: drinksOrdered_array){
            System.out.println("SoftDrinks Ordered: " + x);//printing the ordered softdrinks
            System.out.println("SoftDrinks Price: R" + drinksPrices_array);//printing the price of the softDrinks
            System.out.println("_______________________");
            System.out.println();
       }
       // Sum of the soft drinks price
       System.out.println("Total of SoftDrinks: R");//total of the SoftDrink prices
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println();
        
       //For loop created for side orders
       for(String x : side_dishesOrdered_array){
            System.out.println("Side-dishes Ordered: " + x);//printing the ordered side-dishes
            System.out.println("Side-dishes Price: R" + side_dishesPrices_array);//printing the price of the sideDishes
            System.out.println("_______________________");
            System.out.println();
       }
         // Sum of the soft drinks price
         System.out.println("Total of Side-dishes: R");//total of the Side-dishes prices
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();

        System.out.println("*********************************");
    }
}
