public class HotDrink extends Drink{
    private double temperature;

    public HotDrink (String name, int price, int vol, double temp){
        super(name, price, vol);
        this.temperature = temp;
    }

    public double getTemperature() {
        return temperature;
    }
    
    @Override
    public void printProduct(){
        System.out.printf("Name: " + getName() + "; " + "Volume: " + getVolume() + "; " + "Temperature: " + getTemperature());
        System.out.println();
    }
}
