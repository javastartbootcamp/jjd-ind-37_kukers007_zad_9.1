package pl.javastart.task.firma;

import pl.javastart.task.firma.finanse.Koszt;
import pl.javastart.task.firma.finanse.Przychod;
import pl.javastart.task.firma.finanse.Rekord;
import pl.javastart.task.podatki.FormaOpodatkowania;
import java.util.Arrays;

public class Firma {

    private final String nazwa;
    private final FormaOpodatkowania formaOpodatkowania;
    private int indexP = 0;
    private int indexW = 0;
    private Rekord[] koszty = new Rekord[100];
    private Rekord[] przychody = new Rekord[100];

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaWydatkwow = zsumujWydatki();
        double sumaPrzychodow = zsumujPrzychody();
        double wyliczonyPodatek = formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkwow);
        String nazwaPodatku = formaOpodatkowania.getInfo();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", nazwaPodatku);
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkwow);
        System.out.printf("Podatek do zapłacenia: %.2f zł", wyliczonyPodatek);
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double suma = 0;
        for (Rekord koszt : koszty) {
            if (koszt == null) {
                break;
            }
            suma += koszt.getKwota();
        }
        return suma;
    }

    private double zsumujPrzychody() {
        double suma = 0;
        for (Rekord przych : przychody) {
            if (przych == null) {
                break;
            }
            suma += przych.getKwota();
        }
        return suma;
    }

    public void dodajPrzychod(String nazwa, double kwota) {
        przychody[indexP] = new Przychod(nazwa, kwota);
        indexP++;
        if (indexP >= przychody.length) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
    }

    public void dodajWydatek(String nazwa, double kwota) {
        koszty[indexW] = new Koszt(nazwa, kwota);
        indexW++;
        if (indexW >= koszty.length) {
            koszty = Arrays.copyOf(koszty, koszty.length * 2);
        }
    }
}