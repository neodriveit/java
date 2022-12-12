package pojazdy;

public class Ciezarowka extends pojazdy.Kolowe {

    int udzwig;

    public void podniesSkrzynie() { System.out.println("Podniesiono skrzynie"); }

    public Ciezarowka(int rokProd, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int udzwig) {
        super(rokProd, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.udzwig = udzwig;
    }

    public Ciezarowka () {}

    public int getUdzwig() { return udzwig; }
    public void setUdzwig(int udzwig) { this.udzwig = udzwig; }
}
