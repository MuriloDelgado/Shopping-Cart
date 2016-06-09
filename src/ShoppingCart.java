import java.util.*;

public class ShoppingCart
{
    private String display;
    private int itemCount;
    private double totalPrice;
    private int capacity;
    Item[] Cart;
    
    public ShoppingCart()
    {
        itemCount = 0;
        totalPrice = 0;
        capacity = 5;
        
        Cart = new Item[capacity];
    }
    
    public void increaseSize()
    {
        capacity += 3; // Increasing capacity of cart
    }
    
    public double addToCart(Item a)
    {                        
        totalPrice += (a.getPrice()); // Adding price of items to total price
        
        Cart[itemCount] = a; // Adding item to cart
        itemCount++; // Counting items up
        
        if (itemCount == Cart.length) // Check to see if cart needs greater capacity
            this.increaseSize();
        
        return totalPrice; // Returning total price
    }
    
    @Override
    public String toString()
    {                    
        display = "";
        for (int x = 0; x < itemCount; x++)
            display += Cart[x].toString() + "\n";
       return display;
    }
    
    public double getPrice()
    {
        return totalPrice;
    }
}
