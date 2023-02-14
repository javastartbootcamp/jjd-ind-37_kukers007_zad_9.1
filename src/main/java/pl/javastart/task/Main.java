package pl.javastart.task;

import pl.javastart.task.firma.Firma;
import pl.javastart.task.podatki.*;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new RyczaltEwidencjonowany());
        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajPrzychod("Remont Mieszkania", 30_000);
        firma.dodajPrzychod("Remont Mieszkania", 40_000);
        firma.dodajWydatek("Auto sluzbowe", 30_000);
        firma.wyswietlPodsumowanie();

        Firma firma1 = new Firma("Fuszerka", new NaCzarno());
        firma1.dodajPrzychod("Remont Mieszkania", 23_000);
        firma1.dodajWydatek("Piwko", 100);
        firma1.dodajWydatek("Walki, pedzle, szpachelki", 1_500);
        firma.wyswietlPodsumowanie();

        Firma firma2 = new Firma("PolKom", new PodatekLiniowy());
        firma2.dodajPrzychod("Remont Mieszkania", 20_000);
        firma2.dodajPrzychod("Remont Mieszkania", 30_000);
        firma2.dodajWydatek("Gładzie i farby", 20_000);
        firma2.wyswietlPodsumowanie();

        firma.wyswietlPodsumowanie();
        Firma janNowakServices = new Firma("Jan Nowak IT Services", new SkalaPodatkowa());
        janNowakServices.dodajPrzychod("Programowanie", 150_000);
        janNowakServices.dodajWydatek("Energetyki", 20_000);
        janNowakServices.wyswietlPodsumowanie();
    }
}
