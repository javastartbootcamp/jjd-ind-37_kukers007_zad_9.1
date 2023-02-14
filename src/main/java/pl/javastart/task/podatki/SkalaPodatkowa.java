package pl.javastart.task.podatki;

import pl.javastart.task.firma.finanse.Przychod;

public class SkalaPodatkowa extends FormaOpodatkowania {

    private static final double KWOTA_WOLNA_OD_PODATKU = 10_000;
    private static final double OPROCENTOWANIE_PIERWSZEGO_PROGU = 0.18;
    private static final double OPROCENTOWANIE_DRUGIEGO_PROGU = 0.32;
    private static final double PIERWSZY_PROG = 100_000;
    private static final String NAME = "Skala Podatkowa";

    public SkalaPodatkowa() {
    }

    @Override
    public double wyliczPodatek(final double przychod, final double koszty) {
        double dochod = przychod - koszty;
        double bezPodatku = 0.0;
        if (dochod <= KWOTA_WOLNA_OD_PODATKU) {
            return bezPodatku;
        } else if (dochod > KWOTA_WOLNA_OD_PODATKU && (dochod - KWOTA_WOLNA_OD_PODATKU) < PIERWSZY_PROG) {
            return ((dochod - KWOTA_WOLNA_OD_PODATKU) * OPROCENTOWANIE_PIERWSZEGO_PROGU);
        } else if (dochod > PIERWSZY_PROG) {
            double sum = (PIERWSZY_PROG - KWOTA_WOLNA_OD_PODATKU) * OPROCENTOWANIE_PIERWSZEGO_PROGU;
            double sum2 = (dochod - PIERWSZY_PROG) * OPROCENTOWANIE_DRUGIEGO_PROGU;
            return sum + sum2;
        }
        return -1;
    }

    @Override
    public String getInfo() {
        return NAME;

    }
}
