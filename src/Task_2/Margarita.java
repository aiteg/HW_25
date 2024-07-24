package Task_2;

public class Margarita extends Pizza {
    private boolean meatAvailability;

    public Margarita(int price, int weight, boolean meatAvailability) {
        super(price, weight);
        this.meatAvailability = meatAvailability;
    }

    public Margarita(boolean meatAvailability) {
        this.meatAvailability = meatAvailability;
    }

    @Override
    public void cook() {
        System.out.println("\nГотовиться пицца Margarita");
    }

    @Override
    public void delivery() {
        System.out.println("Доставляется пицца:" +  this.toString());
    }

    @Override
    public String toString() {
        return "\nТип пиццы: Margarita" + "\nНаличие мяса: " + meatAvailability + super.toString();
    }
}
