package pl.javastart.task.podatki;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final double STAWKA_OPROCENTOWANIA = 0.15;
    static final String NAME = "Ryczalt Ewidencjonowany";

    public RyczaltEwidencjonowany() {
    }

    @Override
    public double wyliczPodatek(double przychod, double koszt) {
        return przychod * STAWKA_OPROCENTOWANIA;
    }

    @Override
    public String getInfo() {
        return NAME;
    }
}

