import java.util.ArrayList;

public class VendingMachine<T extends Product>{
    
    private ArrayList<T> products;

    public VendingMachine(){
        this.products = new ArrayList<>();
    }

    public VendingMachine(ArrayList<T> products){
        this.products = new ArrayList<>();
    }

    public void AddProduct(T prod){
        this.products.add(prod);
    }
    
    public void GetProduct (String nam){
        for (T element : products) {
            if (element.getName().equals(nam)) {
                element.printProduct();
            }
        }
    }
    public ArrayList<T> getProducts() {
        return products;
    }

    public void GetProduct2(String nam, int vol, double temp) {
        System.out.println(products.size());
        for (T product : products) {
            if (product.getName().equals(nam) && ((HotDrink)product).getVolume() == vol && ((HotDrink)product).getTemperature() == temp) {
                ((HotDrink)product).printProduct();
            }
        }
    }
}
