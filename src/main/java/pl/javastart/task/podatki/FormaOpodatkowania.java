package pl.javastart.task.podatki;

public class FormaOpodatkowania {
    private String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double wyliczPodatek(double przychod) {
        return -1;
    }

    public double wyliczPodatek(double przychod, double koszt) {
        return -1;
    }

    public String getInfo() {
        return nazwa;
    }
}