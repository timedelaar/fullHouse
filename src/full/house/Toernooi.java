/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import java.sql.Date;

/**
 *
 * @author Tim
 */
public class Toernooi {
    int ID;
    int locatieID;
    Date datum;
    int inleg;
    int maxSpelers;
    int minSpelers;
    int soort;
    
    public Toernooi (int ID, int locatieID, Date datum, int inleg, int maxSpelers, int minSpelers, int soort) {
        this.ID = ID;
        this.locatieID = locatieID;
        this.datum = datum;
        this.inleg = inleg;
        this.maxSpelers = maxSpelers;
        this.minSpelers = minSpelers;
        this.soort = soort;
    }
}
