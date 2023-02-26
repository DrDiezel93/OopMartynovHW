import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine<Product>{
    
    private ArrayList<Drink> drinks;

    public DrinkVendingMachine(String namMach){
        this.drinks = new ArrayList<>();
    }

    public void AddProduct(Drink drink){
        drinks.add(drink);
    }
}
