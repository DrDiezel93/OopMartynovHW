import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Сникерс", 80);
        Product product2 = new Product("Чипсы", 100);
        Drink drink1 = new Drink("Лимонад", 95, 500);
        Drink drink2 = new Drink("Сок", 150, 1000);
        HotDrink hotDrink1 = new HotDrink("Кофе", 120, 200, 96.3);
        HotDrink hotDrink2 = new HotDrink("Tea", 100, 100, 97.5);
        VendingMachine<HotDrink> hMachine = new HotDrinkVendingMachine(null);
        hMachine.AddProduct(hotDrink1);
        hMachine.AddProduct(hotDrink2);
        // hMachine.AddProduct(product1);
        // hMachine.AddProduct(product2);
        // hMachine.AddProduct(drink1);
        // hMachine.AddProduct(drink2);
        hMachine.GetProduct2("Tea", 100, 97.5);
    }
}