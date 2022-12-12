package pojazdy;

private class Pojazd {

    int rokProd;
    String rodzajSilnika;
    String kolor;
    int masa;

    void uruchomSilnik() {
        System.out.println("Silnik Uruchomino");
    }

    public Pojazd (int rokProd, String rodzajSilnika, String kolor, int masa){
        this.rokProd = rokProd;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }
    public Pojazd() {}
    public int getRokProd() { return rokProd; }
    public int getMasa() { return masa; }
    public String getRodzajSilnika() { return rodzajSilnika; }
    public String getKolor() { return kolor; }
    public void setRokProd(int rokProd) { this.rokProd = rokProd; }
    public void setMasa(int masa) { this.masa = masa; }
    public void setRodzajSilnika(String rodzajSilnika) { this.rodzajSilnika = rodzajSilnika; }
    public void setKolor(String kolor) { this.kolor = kolor; }
}