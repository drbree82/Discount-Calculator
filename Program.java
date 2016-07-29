import java.util.Scanner;
/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DiscountedProduct product1 = new DiscountedProduct("",0,0);
        String product = kb.nextLine();
        double price = kb.nextDouble();
        kb.nextLine();
        int quantity = kb.nextInt();
        product1.setName(product);
        product1.setPrice(price);
        product1.setQuantity(quantity);
        if (product1.getQuantity() >= 10){
            product1.setDiscount(0.1f);
            System.out.printf("%d x %s @ %.2f \nSubtotal: %.2f\n10%% Discount: $%.2f\nTotal: $%.2f", product1.getQuantity(), product1.getName(), product1.getTotalPrice(),product1.getPrice(), product1.getDiscount()*product1.getTotalPrice(),product1.getTotalPrice() - (product1.getDiscount()*product1.getTotalPrice()));
        } else{
            System.out.printf("%d x %s @ %.2f \nTotal %.2f", product1.getQuantity(), product1.getName(), product1.getPrice(), product1.getTotalPrice());
        }
    } //main

} // class Program
