public class Tuzky {
    private String nazev;
    private int cena;

    public Tuzky(String nazev, int cena) {
        this.nazev = nazev;
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public int getCena() {
        return cena;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
