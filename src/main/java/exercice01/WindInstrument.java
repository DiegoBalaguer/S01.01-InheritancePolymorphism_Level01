package exercice01;

/**
 * PROGRAM: WindInstrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class WindInstrument extends Instrument {

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A wind instrument is playing";
    }

    @Override
    public String toString() {
        return "WindInstrument{} " + super.toString();
    }
}
