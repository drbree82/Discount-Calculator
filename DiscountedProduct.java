
/**
 * Write a description of class DiscountedProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiscountedProduct extends Product {

    private float discount;
    private String name;
    private double price;
    private int quantity;

    public DiscountedProduct(String name, double price, int quantity){
        super(name, price, quantity);
    }
    
    //Get//

    public float getDiscount(){
        return discount;
    }

    //Set//

    public void setDiscount(float value){
        this.discount = value;
    }
    
    
} // class DiscountedProduct
