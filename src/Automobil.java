public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String marka, String registarskiBroj, int godinaProizvodnje, int brojVrata) {
        super(marka, registarskiBroj, godinaProizvodnje);
        this.brojVrata = brojVrata;
    }

        public static void main(String[] args) {
            Automobil automobil = new Automobil("Toyota", "ZG1234AB", 2020, 4);
            automobil.prikaziPodatke();
        }

    public int getBrojVrata() {
    return brojVrata;
    }
    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata automobila je: " + brojVrata);
    }
}
