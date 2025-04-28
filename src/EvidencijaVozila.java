import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {
    private List<Vozilo> vozila;

    public EvidencijaVozila() {
        this.vozila = new ArrayList<>();
    }

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
        System.out.println("Dodano vozilo: " + vozilo.getMarka());
    }

    public List<Vozilo> getVozila() {
        return vozila;
    }

    public void spremiPodatkeUDatoteku(String nazivDatoteke) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazivDatoteke))) {
            for (Vozilo vozilo : vozila) {
                writer.write("Marka: " + vozilo.getMarka() + ", ");
                writer.write("Registarski broj: " + vozilo.getRegistarskiBroj() + ", ");
                writer.write("Godina proizvodnje: " + vozilo.getGodinaProizvodnje());
                if (vozilo instanceof Automobil) {
                    writer.write(", Broj vrata: " + ((Automobil) vozilo).getBrojVrata());
                } else if (vozilo instanceof Motocikl) {
                    writer.write(", Tip motora: " + ((Motocikl) vozilo).getTipMotora());
                }
                writer.newLine();
            }
            System.out.println("Podaci su uspješno spremljeni u datoteku: " + nazivDatoteke);
        } catch (IOException e) {
            System.err.println("Greška prilikom spremanja podataka u datoteku: " + e.getMessage());
        }
    }

    public void prikaziSvaVozila() {
    }

    public void ucitajPodatkeIzDatoteke(String file) {
    }
}