package pojazdy;

public class Szynowe extends pojazdy.Pojazd {
    @Override
    void uruchomSilnik() { System.out.println("Uruchomiono silnik pojazdu szynowego"); }
}

class Pociag extends Szynowe {
    static String wlasciciel = "P.K.P";
}