import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

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

    }

    public static ArrayList<Product> Search (HashMap<Product, String> map, String name) {
        private ArrayList<Product> searchedlist;
        for (Product key : map.keySet()){
            // iterate over products in store
            if name.contains(key.name) {
                searchedlist.add(key); // add to the searchedlist if store have similar item
                System.out.println(key.name);
            }
        }
        return searchedlist;
    }
}
