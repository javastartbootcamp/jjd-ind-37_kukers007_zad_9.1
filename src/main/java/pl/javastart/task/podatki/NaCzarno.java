package pl.javastart.task.podatki;

public class NaCzarno extends FormaOpodatkowania {
    private static final String NAME = "Na Czarno";

    @Override
    public double wyliczPodatek(double przychod, double koszt) {
        return 0.0;
    }

    @Override
    public String getInfo() {
        return NAME;
    }
}