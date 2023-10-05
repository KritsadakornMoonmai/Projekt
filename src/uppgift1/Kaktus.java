package uppgift1;

public class Kaktus implements Växter{
    String name;
    double längd;
    // Returnerar vätsketyp för Kaktusen.



    @Override
    public String vätskeBehov() {
        return "mineralvatten";
    }
    //Beräkningen av antal liter för att vattna växten
    @Override
    public double getLiter() {
        return 0.2;
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
    public void setLängd(double Alänge) {
        längd = Alänge;
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
