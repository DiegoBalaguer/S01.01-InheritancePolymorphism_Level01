package exercice01;

/**
 * PROGRAM: PercussionInstrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public String play() {

        return "A percussion instrument is playing";
    }

    @Override
    public String toString() {
        return "PercussionInstrument{} " + super.toString();
    }
}
