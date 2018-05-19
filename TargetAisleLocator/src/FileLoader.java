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
            newProduct.setAisle_num(readLine[2]);
            products.put(newProduct, newProduct.getAisle_num());
        } //end while
    }

    public HashMap<Product, String> getProducts(){return products;}
}
