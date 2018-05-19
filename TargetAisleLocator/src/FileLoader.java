import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 */
public class FileLoader {
    private HashMap<Product, String> products = new HashMap<>();

    public FileLoader() throws IOException{
        File file = new File("products.txt");
        FileReader fr = new FileReader (file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while(( line = br.readLine()) != null){
            String[] readLine = line.split(",");
            Product newProduct = new Product(readLine[0], readLine[1]);
            products.put(newProduct, newProduct.getAisle_num());
        } //end while
    }

    public ArrayList<Product> searchStore(HashMap<Product, String> map, String name) {
        ArrayList<Product> searchedlist = new ArrayList<>();
        boolean foundMatches = false;
        System.out.println("Searching items...");
        for (Product key : map.keySet()){
            // iterate over products in store
            if (name.matches(key.getName())) {
                foundMatches = true;
                searchedlist.add(key); // add to the searchedlist if store have similar item
                System.out.println(key.getName());
            }
        }
        if (!(foundMatches)){
            System.out.println("No items matching the criteria were found.");
        }
        return searchedlist;
    }

    public HashMap<Product, String> getProducts(){return products;}
}
