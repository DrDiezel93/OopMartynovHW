public class Drink extends Product{
    private int volume;

    public Drink (String name, int price, int vol){
        super(name, price);
        this.volume = vol;
    }

    public int getVolume() {
        return volume;
    }

    public void consume(){
        System.out.println("Напиток потреблен");
    }

    @Override
    public void printProduct(){
        System.out.printf("Name: " + getName() + "; " + "Volume: " + getVolume());
        System.out.println();
    }

}
