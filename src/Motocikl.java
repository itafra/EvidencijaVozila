public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String marka, String registarskiBroj, int godinaProizvodnje, String tipMotora) {
        super(marka, registarskiBroj, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }
    public static void main(String[] args) {
        Motocikl motocikl = new Motocikl("Honda", "ZG1234AC", 2022, "Benzinski motor");
        motocikl.prikaziPodatke();
    }
    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Tip motora motocikla je: " + tipMotora);
    }
    public String getTipMotora() {
        return tipMotora;
    }
    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }
}

