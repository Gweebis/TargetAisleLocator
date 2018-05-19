/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 * Holds the description of the product class
 */
public class Product {
    private String aisle_num;
    private String prod_name;

    public Product(String name, String aisle){
        aisle_num = aisle;
        prod_name = name;
    }

    public String getAisle_num() {
        return aisle_num;
    }

    public String getName() {
        return prod_name;
    }

    public void setName(String name) {
        this.prod_name = name;
    }

    public void setAisle_num(String aisle_num) {
        this.aisle_num = aisle_num;
    }


}
