import java.io.*;
import java.util.*;

/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 */
public class Kiosk{

    private HashMap<Product, String> products;
    private HashMap<Product, String> shoppingcart;

    public static void main (String[] args) throws IOException{
        FileLoader fl = new FileLoader();
        // list of products in Target
        HashMap<Product,String> products = fl.getProducts();
        //initial display
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to Target's Aisle Locator Kiosk!");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("Available commands are: help, search, display, add, and quit.");
        System.out.println("To learn more about a command, enter help,command");
        System.out.println("Please enter a command...");

        Scanner sc = new Scanner(System.in);
        boolean loop = true;//boolean for keeping the session open - will become false once quit; is entered
        ArrayList<Product> lastSearch = new ArrayList<>();
        ArrayList<Product> shoppingCart = new ArrayList<>();
        //start session
        while (loop) {
            System.out.print("> ");
            String line = sc.nextLine();
            ArrayList<String> inputArray = new ArrayList<>(Arrays.asList(line.split(",")));

            switch(inputArray.get(0)){
                case "search":
                    lastSearch = fl.searchStore(products, inputArray.get(1));
                    break;
                case "help":
                    switch (inputArray.get(1)){
                        case "search":
                            System.out.println("Search: syntax search,item");
                            System.out.println("Searches the store's current inventory for an item and returns the " +
                                    "aisle number where it's located. If nothing is found, an error is displayed.");
                            break;
                        case "display":
                            System.out.println("Display: syntax display");
                            System.out.println("Displays the aisle locations of all products currently in the cart" +
                                    "in numeric order.");
                            break;
                        case "add":
                            System.out.println("Add: syntax add,productname");
                            System.out.println("Adds the item to your shopping cart that can be displayed at a " +
                                    "later time.");
                    }

                    break;
                case "display":
                    System.out.println("Displaying items at shopping cart....");
                    for(int i = 0; i < shoppingCart.size(); i++){
                        System.out.println(shoppingCart.get(i).getName() + " located at Aisle " +
                        shoppingCart.get(i).getAisle_num());
                    }
                    break;
                case "add":
                    boolean added = false;
                    for(int i = 0; i < lastSearch.size(); i++){
                        if(lastSearch.get(i).getName().matches(inputArray.get(1))){
                            added = true;
                            shoppingCart.add(lastSearch.get(i));
                            continue;
                        }
                    }
                    if(added){
                        System.out.println(inputArray.get(1) + " added to shopping cart successfully.");
                    }
                    else{
                        System.out.println(inputArray.get(1) + " not found in last search results. Try searching again.");
                    }
                    break;

                case "quit":
                    loop = false;
                    break;
                default:
                    System.out.println("Unrecognized command, please try again.");
                    break;
            }

        }
        //end of session
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("THANKS, AND HAVE A JOLLY DAY");
        System.out.println("----------------------------");

    }

}
