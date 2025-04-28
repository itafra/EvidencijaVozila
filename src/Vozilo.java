import java.util.Scanner;

public class Vozilo {
    private String marka;
    private String registarskiBroj;
    private int godinaProizvodnje;

    public Vozilo(String marka, String registarskiBroj, int godinaProizvodnje) {
        this.marka = marka;
        this.registarskiBroj = registarskiBroj;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public static void main(String[] args) {
        Vozilo vozilo = new Vozilo("Toyota", "ZG1234AB", 2020);
        vozilo.prikaziPodatke();
        vozilo.ucitajPodatke();
        vozilo.prikaziPodatke();

    }

    public void ucitajPodatke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Upisite marku vozila: ");
        this.marka = scanner.nextLine();
        System.out.println("Upisite registarski broj vozila: ");
        this.registarskiBroj = scanner.nextLine();
        System.out.println("Upisite godinu proizvodnje vozila: ");
        this.godinaProizvodnje = Integer.parseInt(scanner.nextLine());
    }

    public void prikaziPodatke() {
        System.out.println("Marka vozila je: " + marka);
        System.out.println("Registarski broj vozila je: " + registarskiBroj);
        System.out.println("Godina proizvodnje vozila je: " + godinaProizvodnje);
    }

    public String getMarka() {
        return marka;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRegistarkiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }
}
