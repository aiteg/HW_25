package Task_2;

public abstract class Pizza {
    private int price;
    private int weight;

    public Pizza(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public Pizza() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void cook();

    public abstract void delivery();

    @Override
    public String toString() {
        return "\nЦена: " + price + "сом" + "\nВес: " + weight + "кг" ;
    }
}


