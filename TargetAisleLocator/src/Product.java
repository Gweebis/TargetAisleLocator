/**
 * ${CLASS_NAME}
 * Created by Gwen on 5/18/2018.
 * Version number: ${VERSION}.
 * Revisions: ${LOG}
 * Holds the description of the product class
 */
public class Product {
    private int prod_id;
    private int aisle_num;
    private String name;
    private int inventory_size;

    public Product(){
        name = null;
    }

    public Product(int id, int aisle, String name, int size){
        prod_id = id;
        aisle_num = aisle;
        name = this.name;
        inventory_size = size;

    }

    public int getProd_id() {
        return prod_id;
    }

    public int getAisle_num() {
        return aisle_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAisle_num(int aisle_num) {
        this.aisle_num = aisle_num;
    }

    public int getInventory_size() {
        return invetory_size;
    }

    public void setInventory_size(int inventory_size) {
        this.inventory_size = inventory_size;
    }

}
