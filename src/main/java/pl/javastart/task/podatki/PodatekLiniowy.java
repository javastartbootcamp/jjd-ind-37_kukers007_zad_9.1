package pl.javastart.task.podatki;

public class PodatekLiniowy extends FormaOpodatkowania {

    private static final double STALA_STAWKA_OPROCENTOWANIA = 0.19;
    private static final String NAME = "Podatek Liniowy";

    @Override
    public double wyliczPodatek(double przychody, double koszt) {
        double dochod = przychody - koszt;
        return dochod * STALA_STAWKA_OPROCENTOWANIA;
    }

    @Override
    public String getInfo() {
        return NAME;
    }
}