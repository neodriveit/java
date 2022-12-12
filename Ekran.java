public class Ekran {

    String producent;
    String model;
    String typ;
    int szerokosc_px;
    int wysokosc_px;
    double rozmiar_cale;

    public static String poleModel;

    public Ekran(){ poleModel=model; };
    public Ekran(String producent, String model, String typ, int szerokosc_px, int wysokosc_px, double rozmiar_cale) {
        this(producent,model,typ, szerokosc_px, wysokosc_px);
        this.rozmiar_cale=rozmiar_cale;
        poleModel=model;
    }

    public Ekran(String producent, String model, String typ, int szerokosc_px, int wysokosc_px) {
        this.producent=producent;
        this.model=model;
        this.typ=typ;
        this.szerokosc_px=szerokosc_px;
        this.wysokosc_px=wysokosc_px;
        poleModel=model;
    }

    public Ekran(String producent, String model, int szerokosc_px, int wysokosc_px, double rozmiar_cale) {
        this.producent=producent;
        this.model=model;
        this.szerokosc_px=szerokosc_px;
        this.wysokosc_px=wysokosc_px;
        this.rozmiar_cale=rozmiar_cale;
        poleModel=model;
    }

    public Ekran(String producent, String model, String typ) {
        this.producent=producent;
        this.model=model;
        this.typ=typ;
        poleModel=model;
    }
    public void setProducent(String producent) {
        this.producent = producent;
    }
    public void setModel(String model) {
        this.model = model; poleModel=model;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public void setSzerokosc_px(int szerokosc_px) {
        this.szerokosc_px = szerokosc_px;
    }
    public void setWysokosc_px(int wysokosc_px) {
        this.wysokosc_px = wysokosc_px;
    }
    public void setRozmiar_cale(double rozmiar_cale) { this.rozmiar_cale = rozmiar_cale;
    }

    public String getProducent() { return producent; }
    public String getModel() { return model; }
    public String getTyp() { return typ; }
    public int getSzerokosc_px() { return szerokosc_px; }
    public int getWysokosc_px() { return wysokosc_px; }
    public double getRozmiar_cale() { return rozmiar_cale; }




}