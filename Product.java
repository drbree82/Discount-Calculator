
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Get Methods//

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotalPrice(){
        return quantity * price;
    }

    //Set Methods//
    public void setName(String value){
        this.name = value;
    }

    public void setPrice(double value){
        this.price = value;
    }

    public void setQuantity(int value){
        this.quantity = value;
    }
} // class Product
