/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

/**
 *
 * @author Tim
 */
public class Locatie {
    int ID;
    String naam;
    String straatnaam;
    String huisNr;
    String plaats;
    String postcode;
    int aantalTafels;
    int spelersPerTafel;
    
    public Locatie (int ID, String naam, String straatnaam, String huisNr, String plaats, String postcode, int aantalTafels, int spelersPerTafel) {
        this.ID = ID;
        this.naam = naam;
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.plaats = plaats;
        this.postcode = postcode;
        this.aantalTafels = aantalTafels;
        this.spelersPerTafel = spelersPerTafel;
    }
}
