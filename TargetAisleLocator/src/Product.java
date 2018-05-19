/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 * Holds the description of the product class
 */
public class Product {
    private String aisle_num;
    private String name;

    public Product(){
        name = null;
    }

    public Product(int id, String aisle, String name, int size){
        aisle_num = aisle;
        name = this.name;
    }

    public String getAisle_num() {
        return aisle_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setAisle_num(String aisle_num) {
        this.aisle_num = aisle_num;
    }


}
