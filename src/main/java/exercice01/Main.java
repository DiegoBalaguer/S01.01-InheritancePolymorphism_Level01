package exercice01;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

import java.util.ArrayList;

public class Main {

    private static ArrayList<Instrument> instruments;

    public static void main(String[] args) {

        process();

    }

    private static void process() {

        instruments = new ArrayList<>();

        System.out.println("Force the class load via a static member: ");
        System.out.println(Instrument.class);
        System.out.println(Instrument.getCounter());

        InstrumentStates st = new InstrumentStates(instruments);
        st.loadInstruments();
        st.viewIntruments();
        st.playingInstruments();
    }
}

