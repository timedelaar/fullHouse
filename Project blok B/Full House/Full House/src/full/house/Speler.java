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
    int winsten;
    boolean docent;
    
    public Speler (String naam, String voorletters, String straatnaam, String huisNr, String woonplaats, String postcode, String telefoonNr, String email, boolean docent) {
        this.naam = naam;
        this.voorletters = voorletters;
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.woonplaats = woonplaats;
        this.postcode = postcode;
        this.telefoonNr = telefoonNr;
        this.email = email;
        this.rating = 100;
        this.winsten = 0;
        this.docent = docent;
    }
    
    public Speler (int ID, String naam, String voorletters, String straatnaam, String huisNr, String woonplaats, String postcode, String telefoonNr, String email, int rating, int winsten, boolean docent) {
        this.ID = ID;
        this.naam = naam;
        this.voorletters = voorletters;
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.woonplaats = woonplaats;
        this.postcode = postcode;
        this.telefoonNr = telefoonNr;
        this.email = email;
        this.rating = rating;
        this.winsten = winsten;
        this.docent = docent;
    }
}
