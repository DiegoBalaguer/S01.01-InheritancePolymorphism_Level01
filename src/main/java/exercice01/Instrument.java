package exercice01;

/**
 * PROGRAM: Instrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

abstract class Instrument {

    private String name;
    private double price;
    private int position;
    private static int counter = 0;

    public Instrument(String name, double price) {
        setName(name);
        setPrice(price);
        setPosition();
    }

    static {
        System.out.println("Inside class Instrument " + counter);
    }

    public static String getCounter() {
        return "Counter value: " + counter;
    }

    private void setName(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to name.");
        } else
            this.name = r;
    }

    private void setPrice(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("The base price must be equal or greater than 1€.");
        } else
            this.price = r;
    }

    private void setPosition() {
        Instrument.counter++;
        this.position = Instrument.counter;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", position=" + position +
                '}';
    }
}
