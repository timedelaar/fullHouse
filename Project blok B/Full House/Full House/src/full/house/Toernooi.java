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
    int maxSpelers;
    int inleg;
    int spelersPerTafel;
    int totaalInleg;
    
    public Toernooi (int locatieID, Date datum, int maxSpelers, int inleg, int spelersPerTafel) {
        this.locatieID = locatieID;
        this.datum = datum;
        this.maxSpelers = maxSpelers;
        this.inleg = inleg;
        this.spelersPerTafel = spelersPerTafel;
        this.totaalInleg = 0;
    }
    
    public Toernooi (int ID, int locatieID, Date datum, int maxSpelers, int inleg, int spelersPerTafel, int totaalInleg) {
        this.ID = ID;
        this.locatieID = locatieID;
        this.datum = datum;
        this.maxSpelers = maxSpelers;
        this.inleg = inleg;
        this.spelersPerTafel = spelersPerTafel;
        this.totaalInleg = totaalInleg;
    }
}
