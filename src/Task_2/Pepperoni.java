package Task_2;

public class Pepperoni extends Pizza {
    private boolean spiceAvailability;

    public Pepperoni(int price, int weight, boolean spiceAvailability) {
        super(price, weight);
        this.spiceAvailability = spiceAvailability;
    }

    public Pepperoni(boolean spiceAvailability) {
        this.spiceAvailability = spiceAvailability;
    }

    @Override
    public void cook() {
        System.out.println("\nГотовиться пицца Pepperoni");
    }

    @Override
    public void delivery() {
        System.out.println("Доставляется пицца:" +  this.toString());
    }

    @Override
    public String toString() {
        return "\nТип пиццы: Pepperoni" + "\nНаличие остроты: " + spiceAvailability + super.toString();
    }
}
