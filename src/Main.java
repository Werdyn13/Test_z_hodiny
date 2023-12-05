import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tuzky tuzka1 = new Tuzky("Tužka1", 9);
        Tuzky tuzka2 = new Tuzky("Tužka2", 18);
        Tuzky tuzka3 = new Tuzky("Tužka3", 12);

        ArrayList<Tuzky> zbozi = new ArrayList<>();
        zbozi.add(tuzka1);
        zbozi.add(tuzka2);
        zbozi.add(tuzka3);

        // Try-with-resources, automaticky uzavírá BufferedWriter po dokončení
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Soubor.txt"))) {
            for (Tuzky t : zbozi) {
                writer.write("Název: " + t.getNazev() + ", Cena: " + t.getCena());
                writer.newLine();
            }
            System.out.println("Data byla zapsána do souboru.");
        } catch (IOException e) {
            // Vypíše chybovou zprávu, pokud se nepodaří zapsat do souboru
            e.printStackTrace();
        }
    }
}
