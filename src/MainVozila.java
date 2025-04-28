public class MainVozila {
    public static void main(String[] args) {
        EvidencijaVozila evidencija = new EvidencijaVozila();

        evidencija.dodajVozilo(new Automobil("ZG-1234-AB", "Opel", 2019, 5));
        evidencija.dodajVozilo(new Motocikl("ZG-5555-KL", "Yamaha", 2021, "Dizelski motor"));

        System.out.println("Upisana vozila:");
        evidencija.prikaziSvaVozila();

        evidencija.spremiPodatkeUDatoteku("vozila.txt");
        System.out.println("Podaci spremljeni u vozila.txt");

        EvidencijaVozila evidencija2 = new EvidencijaVozila();
        evidencija2.ucitajPodatkeIzDatoteke("vozila.txt");
        System.out.println("Podaci iz datoteke:");
        evidencija2.prikaziSvaVozila();
    }
}