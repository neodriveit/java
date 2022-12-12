package pojazdy;

public class Kolowe extends pojazdy.Pojazd {

    String rozmiarOpony;

    public Kolowe (int rokProd, String rodzajSilnika, String kolor, int masa, String rozmiarOpony) {
        super(rokProd, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kolowe () {}

    void uruchomSilnik(String rodzajSilnika) {
        System.out.println("Uruchomiono silnik " + rodzajSilnika);
    }

    public String getrozmiarOpony() { return rozmiarOpony; }
    public void setRozmiarOpony(String rozmiarOpony) { this.rozmiarOpony = rozmiarOpony; }
}