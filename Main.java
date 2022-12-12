public class Main {
    public static void main(String []args){


        Ekran ekran1 = new Ekran("LG", "X800","OLED", 500, 900, 3.3);
        System.out.println(Ekran.poleModel);
        Ekran ekran2 = new Ekran("SONY", "S6322","LCD", 6750, 5800);
        System.out.println(Ekran.poleModel);
        Ekran ekran3 = new Ekran("SAMSUNG", "C4002","LCD");
        System.out.println(Ekran.poleModel);
        Ekran ekran4 = new Ekran("CHINALED", "SMART STANDARD","AMOLED", 1200, 1930);
        System.out.println(Ekran.poleModel);
        Ekran ekran5 = new Ekran("NONAME", "5A", 1200, 900, 24);
        System.out.println(Ekran.poleModel);
        Ekran ekran6 = new Ekran();
        System.out.println(Ekran.poleModel);

        ekran2.setRozmiar_cale(63);
        ekran3.setSzerokosc_px(4100);
        ekran3.setWysokosc_px(5700);
        ekran3.setRozmiar_cale(37.5);
        ekran4.setRozmiar_cale(3.77);
        ekran5.setTyp("CRT");

        ekran6.setProducent("PHILIPS");
        ekran6.setModel("Smart Idea");
        ekran6.setTyp("LCD");
        ekran6.setSzerokosc_px(7300);
        ekran6.setWysokosc_px(6900);
        ekran6.setRozmiar_cale(52);

    }
}
