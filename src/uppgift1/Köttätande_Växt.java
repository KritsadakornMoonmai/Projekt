package uppgift1;

public class Köttätande_Växt implements Växter{
    String name;
    double längd;

    @Override
    public String vätskeBehov() {
        return "proteindryck";
    }
    //Beräkningen av antal liter för att vattna växt.
    @Override
    public double getLiter() {
        return 0.1 + (0.2 * getLängd());
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLängd(double länge) {
        längd = länge;
    }

    @Override
    public double getLängd() {
        return längd;
    }

    // På grund av att koden från annan klass visar annorlunda, så det behövs att anropa toString
    //för att meddelandet visar ordentligt
    public String toString() {
        return getName();
    }

}
