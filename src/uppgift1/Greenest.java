package uppgift1;

import javax.swing.*;
import java.util.ArrayList;

public class Greenest {
    public static void main(String[] args) {
        // Skapa arraylist och addera enums egenskaper till Arraylist för loopen.
        ArrayList<Växter> växt = new ArrayList<>();
        växt.add(Namnlist.IGGE.getKaktus());
        växt.add(Namnlist.LAURA.getPalm());
        växt.add(Namnlist.MEATLOAF.getKöttVäxt());
        växt.add(Namnlist.OLOF.getPalm());
        System.out.println(växt);
        boolean boo = true;
        String nameInput = JOptionPane.showInputDialog("Vilken växt ska få mat?: ");
        // Loopen andvänds för att visa meddelande om namnet finns i arraylistan .
        for (Växter växter : växt) {
            if (!växter.getName().equalsIgnoreCase(nameInput)) {
                boo = false;
            } else {
                boo = true;
                break;
            }
        }
        /*Loopar och visar info av namnet som angiven.*/
        for (Växter växtNamn : växt) {
            if (växtNamn.getName().equalsIgnoreCase(nameInput)) {
                JOptionPane.showMessageDialog(null,
                        "Namn: "+växtNamn + "\nKlass: " + växtNamn.getClass().getSimpleName() + "\n"
                                + "Vätska: " + växtNamn.vätskeBehov()+ "\n" + "Antal liter: " + växtNamn.getLiter() + "L");
                break;
            }
        }
        /*Visar om namnet som angivit inte finns i listan
        Kan inte lägga i samma if satsen uppe, meddelandet ska visa flera gånger.*/
        if (!boo) {
            JOptionPane.showMessageDialog(null, "Det finns inte namnet i växterna.");
        }
    }
}
