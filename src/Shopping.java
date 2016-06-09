import java.util.*;

public class Shopping
{
    public static void main(String[] args)
    {
        String name; // Used for item name
        double price; // Used for item price
        int quantity; // Used for item quantity
        
        Scanner scan = new Scanner(System.in); // Scanner item
        ShoppingCart Cart = new ShoppingCart(); // New shopping cart item
        
        System.out.println ("Welcome to our virtual store!");
        System.out.println ("Enter in the name of the item: ");
        name = scan.next(); // Getting item name
        
        System.out.println ("Enter in the item price: ");
        price = scan.nextDouble(); // Getting item price
        
        System.out.println ("Enter in the item quantity: ");
        quantity = scan.nextInt(); // Getting item quantity
        
        Cart.addToCart(new Item(name, price, quantity)); // Adding item to cart              
        
        System.out.println();
        System.out.println ("Current Cart"); // Printing out cart
        System.out.println ();
        System.out.println ("Item     Unit Price     Quantity     Total");
        System.out.println (Cart.toString());

        System.out.println ("Total Price: $" + Cart.getPrice());
        System.out.println();
        System.out.println ("Enter Y if you would like to keep shopping or N to quit");
        char answer = scan.next().charAt(0);
        
        while (answer != 'N')
        {                       
            System.out.println ("Enter in the name of the item: ");
            name = scan.next(); // Getting item name
        
            System.out.println ("Enter in the item price: ");
            price = scan.nextDouble(); // Getting item price
        
            System.out.println ("Enter in the item quantity: ");
            quantity = scan.nextInt(); // Getting item quantity
        
            Cart.addToCart(new Item(name, price, quantity)); // Adding item to cart
        
            System.out.println ("Current Cart");
            System.out.println ();
            System.out.println ("Item     Unit Price     Quantity     Total");
            System.out.println (Cart.toString());
            System.out.println();
            System.out.println ("Total Price: $" + Cart.getPrice());
        
            System.out.println ("Enter Y if you would like to keep shopping or N to quit");
            answer = scan.next().charAt(0);
        }
        
        System.out.println();
        System.out.println ("Thanks for Shopping with us!");
        System.out.println ("Please pay $" + Cart.getPrice());
    }
}