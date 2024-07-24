package Task_2;

public class Main {
    public static void main(String[] args) {
        Margarita margarita = new Margarita(300, 1, true);

        margarita.cook();
        margarita.delivery();

        La_Finta laFinta = new La_Finta(400, 2, false);

        laFinta.cook();
        laFinta.delivery();

        Pepperoni pepperoni = new Pepperoni(6000, 10, true);

        pepperoni.cook();
        pepperoni.delivery();

    }
}
