import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine<HotDrink> {
    
    public HotDrinkVendingMachine(ArrayList<HotDrink> hotDrinks){
        super(hotDrinks);
    }
    
    public void GetProduct(String nam, int vol, double temp) {
        System.out.println(getProducts().size());
        for (HotDrink product : getProducts()) {
            if (product.getName().equals(nam) && product.getVolume() == vol && product.getTemperature() == temp) {
                product.printProduct();
            }
            else System.out.println("Такого нет");
        }
    }
}

