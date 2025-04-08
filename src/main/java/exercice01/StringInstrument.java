package exercice01;

/**
 * PROGRAM: StringInstrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public String play() {

        return "A string instrument is playing";
    }

    @Override
    public String toString() {
        return "StringInstrument{} " + super.toString();
    }
}