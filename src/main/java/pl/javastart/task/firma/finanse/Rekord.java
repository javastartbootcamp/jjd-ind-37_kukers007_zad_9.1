package pl.javastart.task.firma.finanse;

public class Rekord {
    private String nazwa;
    private double kwota;

    public Rekord(String nazwa, double kwota) {
        this.nazwa = nazwa;
        this.kwota = kwota;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }
}