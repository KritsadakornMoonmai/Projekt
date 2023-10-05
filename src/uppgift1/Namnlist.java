package uppgift1;

// Skapa enum med växternas namn.
public enum Namnlist {
    // Ange Namn och längd av växterna.
    IGGE("Igge", 0.2),
    LAURA("Laura", 5),
    MEATLOAF("Meatloaf", 0.7),
    OLOF("Olof", 1);
    private final String namn;

    private final double längd;

    // Skapa konstuktur för att kommentar ska läggas efter dem.
    private Namnlist(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    // Jag skapar objekt här eftersom jag vill minska källkoden i huvudklassen.
    // Metod för Kaktusklass
    public Växter getKaktus() {
        Växter v1 = new Kaktus();
        // Man kan skriva vilket namn som helst. Metoden ska anropas med ett av enums med metoden.
        v1.setName(namn);
        v1.setLängd(längd);
        return v1;
    }

    // Metod för Palmklass
    public Växter getPalm() {
        Växter v2 = new Palm();
        // Man kan skriva vilket namn som helst. Metoden ska anropas med ett av enums med metoden.
        v2.setName(namn);
        v2.setLängd(längd);
        return v2;
    }
    // Metod för Köttätande Växtklass
    public Växter getKöttVäxt() {
        Växter v3 = new Köttätande_Växt();
        // Man kan skriva vilket namn som helst. Metoden ska anropas med ett av enums med metoden.
        v3.setName(namn);
        v3.setLängd(längd);
        return v3;
    }
}
