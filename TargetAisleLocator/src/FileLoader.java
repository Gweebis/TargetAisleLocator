import java.io.*;
import java.util.HashMap;

/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 */
public class FileLoader {
    private HashMap<Product, String> products;

    public FileLoader() throws IOException{
        File file = new File("products.txt");
        FileReader fr = new FileReader (file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while(( line = br.readLine()) != null){
            String[] readLine = line.split(",");
            Product newProduct = new Product();
            newProduct.setName(readLine[1]);
            products.put(newProduct, readLine[2]);
        } //end while
    }

    public HashMap<Product, String> getProducts(){return products;}

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
