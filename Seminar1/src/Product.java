public class Product {
    private String name;
    private int price;

    public Product(String nam, int pr){
        this.name = nam;
        this.price = pr;
    }

    public Product(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void consume(){
        System.out.println("Продукт потреблен");
    }
    public void printProduct(){
        System.out.printf("Name: " + getName());
        System.out.println();
    }
}
