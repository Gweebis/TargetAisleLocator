import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 */
public class Kiosk {
    // list of products in Target
    public HashMap<Product,String> products;

    public static void main(String[] args){
        try{
            File file = new File("products.txt");
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(( line = br.readLine()) != null){
                String[] readLine = line.split(",");
            } //end while

        }catch(Exception e){
            System.out.println("The file does not exist. Exiting program...");
            System.exit(0);
        }
    }

    public static Product search(HashMap<Product, String> map, String name) {
        for (int i = 0; i < products.size(); i++) {
            if (map.)
        }
    }
}
