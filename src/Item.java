public class Item
{
    private String name;
    private double price;
    private int quantity;
    
    public Item(String s, double x, int y)
    {
        name = s;
        price = x;
        quantity = y;
    }
    
    @Override
    public String toString()
    {
        return (name + "     " + "$" + price + "            " + quantity + "          " + "$" + (price * quantity));
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return (price * quantity);
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}
