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
    String straatnaam;
    String huisNr;
    String plaats;
    String postcode;
    int maxSpelers;
    
    public Locatie (String straatnaam, String huisNr, String plaats, String postcode, int maxSpelers) {
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.plaats = plaats;
        this.postcode = postcode;
        this.maxSpelers = maxSpelers;
    }
    
    public Locatie (int ID, String straatnaam, String huisNr, String plaats, String postcode, int maxSpelers) {
        this.ID = ID;
        this.straatnaam = straatnaam;
        this.huisNr = huisNr;
        this.plaats = plaats;
        this.postcode = postcode;
        this.maxSpelers = maxSpelers;
    }
}
