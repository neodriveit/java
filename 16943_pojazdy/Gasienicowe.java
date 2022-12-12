package pojazdy;

public class Gasienicowe extends pojazdy.Pojazd {

    int moc;

    public Gasienicowe (int rokProd, String rodzajSilnika, String kolor, int masa, int moc) {

        super(rokProd, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    public Gasienicowe () {}

    final void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }

    public int getMoc() { return moc; }

    public void setMoc(int moc) { this.moc = moc; }
}
class Czolg extends Gasienicowe {}
class Spychacz extends Gasienicowe {}