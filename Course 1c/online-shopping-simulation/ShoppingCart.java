public class ShoppingCart {
    //Item is a temporary name, the method only cares about the parameter name you gave it
    public void addItem(Product item){
        item.displayInfo();
        System.out.println("Item added to shopping cart.\n");
    }
}
