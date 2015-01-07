/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

/**
 *
 * @author Tim
 */
public class RatingTest {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        berekenRating();
    }
    
    private static void seating () {
        String[] namen = maakNamen();
        int tafels = 6;
        int stoelen = 10;
        int benodigdeTafels = namen.length / stoelen + 1;
        if (namen.length < tafels*stoelen) {
            String[][] tafelIndeling = new String[tafels][stoelen];
            for (int i = 0; i < namen.length; i++) {
                int tafel = (int) (Math.random() * benodigdeTafels);
                int stoel = (int) (Math.random() * stoelen);
                if (tafelIndeling[tafel][stoel] == null) {
                    tafelIndeling[tafel][stoel] = namen[i];
                }
                else {
                    i --;
                }
            }
            for (int i = 0; i < tafelIndeling.length; i++) {
                for (int j = 0; j < tafelIndeling[i].length; j++) {
                    System.out.println("Tafel " + (i+1) + " Stoel " + (j+1) + ": " + tafelIndeling[i][j]);
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("Te weinig stoelen!");
        }
    }
    
    private static String[] maakNamen () {
        String[] voor = {"Jan", "Tim", "Daniella", "Jens", "Patrick", "Ruud", "Bart"};
        String[] achter = {"Klaassen", "Edelaar", "Swart", "de Boer", "ter Steeg", "van der Niet", "Janssen"};
        String[] namen = new String[voor.length * achter.length];
        int n = 0;
        for (int i = 0; i < voor.length; i++) {
            for (int j = 0; j < achter.length; j++) {
                namen[n] = voor[i] + " " + achter[j];
                n ++;
            }
        }
        return namen;
    }
    
    private static void berekenRating () {
        Tafel tafel = new Tafel();
        for (int k = 0; k < 100; k++) {
            int i = 0;
            while (tafel.spelers[i+1] != null) {
                int eigen = tafel.spelers[i].rating;
                int totaalRest = 0;
                int j = i + 1;
                while (tafel.spelers[j] != null) {
                    totaalRest = totaalRest + tafel.spelers[j].rating;
                    j ++;
                }
                int aantalRest = j - i - 1;
                int gemiddeldeRest = (int) Math.round((double) totaalRest/aantalRest);
                j = i + 1;
                while (tafel.spelers[j] != null) {
                    tafel.spelers[j].rating = tafel.spelers[j].rating + winst(gemiddeldeRest, eigen);
                    j ++;
                }
                tafel.spelers[i].rating = eigen + verlies(gemiddeldeRest, eigen);
                i ++;
            }
        }
    }
    
    private static int winst (int gemiddelde, int eigen) {
        return (int) Math.round((double) eigen / (double) gemiddelde * 2);
    }
    
    private static int verlies (int gemiddelde, int eigen) {
        return (int) Math.round((double) eigen / (double) gemiddelde * -10);
    }
}
