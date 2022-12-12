package pojazdy;

public class Osobowy extends pojazdy.Kolowe {

    int iloscOsob;

    public Osobowy(int rokProd, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProd, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }

    public Osobowy () {}

    public int getIloscOsob() { return iloscOsob; }
    public void setIloscOsob(int iloscOsob) { this.iloscOsob = iloscOsob; }

}

class Pickup extends Osobowy {}

class Sedan extends Osobowy {
    String model;
    String symbol;
}

class Skoda extends Sedan {}

class SuperB extends Skoda {}

final class Octavia extends Skoda {}

class VW extends Sedan {}
class Golf extends VW {}
