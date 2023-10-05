package uppgift1;

public class Palm implements  Växter{
    String name;
    double längd;


    // Returnerar vätsketyp för Palmen.
    @Override
    public String vätskeBehov() {
        return "kranvatten";
    }

    //Beräkningen av antal liter för att vattna växten

    @Override
    public double getLiter() {
        return 0.5 * getLängd();
    }

    @Override
    public void setName(String Aname) {
        name = Aname;
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

    public String toString() {
        return getName();
    }



}
