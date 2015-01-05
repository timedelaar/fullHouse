/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

/**
 *
 * @author Tim
 */
public class Speler {
    int ID;
    String naam;
    String voorletters;
    String straatnaam;
    String huisNr;
    String woonplaats;
    String postcode;
    String telefoonNr;
    String email;
    int rating;
    double gewonnenGeld;
    boolean isDocent;
    
    public Speler (String naam, String voorletters, String postcode, String woonplaats, String straatnaam, String huisNr, String telefoonNr, String email, boolean docent) {
        this.naam = naam;
        this.voorletters = voorletters;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.telefoonNr = telefoonNr;
        this.email = email;
        this.rating = 100;
        this.gewonnenGeld = 0;
        this.isDocent = docent;
    }
    
    public Speler (int ID, String naam, String voorletters, String postcode, String woonplaats, String straatnaam, String huisNr, String telefoonNr, String email, int rating, double gewonnenGeld, boolean isDocent) {
        this.ID = ID;
        this.naam = naam;
        this.voorletters = voorletters;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.telefoonNr = telefoonNr;
        this.email = email;
        this.rating = rating;
        this.gewonnenGeld = gewonnenGeld;
        this.isDocent = isDocent;
    }
}
