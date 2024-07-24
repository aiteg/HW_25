package Task_2;

public class La_Finta extends Pizza{
    private boolean mushroomsAvailability;

    public La_Finta(int price, int weight, boolean mushroomsAvailability) {
        super(price, weight);
        this.mushroomsAvailability = mushroomsAvailability;
    }

    public La_Finta(boolean mushroomsAvailability) {
        this.mushroomsAvailability = mushroomsAvailability;
    }

    @Override
    public void cook() {
        System.out.println("\nГотовиться пицца La Finta");
    }

    @Override
    public void delivery() {
        System.out.println("Доставляется пицца:" +  this.toString());
    }

    @Override
    public String toString() {
        return "\nТип пиццы: La Finta" + "\nНаличие грибов: " + mushroomsAvailability + super.toString();
    }
}
