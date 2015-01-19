/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package full.house;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author jannedevos
 */
public class SpelerGen {
    
    private static String genTelefoon()
    {
        String telefoonNummer = "06";
        
        for (int k = 0; k < 8; k++)
        {
            int getal = (int) (Math.random() * 9);
            telefoonNummer = telefoonNummer + getal;
        }
        return telefoonNummer;
    }
    
    
    private static String[] genNamen()      
    {
        String[] voorLetter = {"J.J.", "A.B.", "S.G.", "K.A.", "S.J.", "H.J.", "D.H.", "T.E.", "H.K.", "S.T."};
        String[] achterNaam = {"Jansen", "Jong", "Heijs", "Boer", "Nietveld", "Kooijman", "Wolf", "Lans", "Edelaar", "Bakker"};
        String[] email = {"@fullhouse.com", "@hotmail.com", "@me.com"};
        String[] straatNaam = {"Hoofdstraat", "Kerkstraat", "Dorpstraat", "Hoofdplein", "Kerkplein"};
        String[] woonplaats = {"Rotterdam", "Amsterdam", "Den Haag", "Leiden", "Hoofddorp"};
        String[] postcode = {"1246HS", "2304PZ", "2039JK", "3402ZX", "2130PQ"};
        
        for (int i = 0; i < voorLetter.length; i++)
        {
            for (int j = 0; j < achterNaam.length; j++)
            {
                String voorLetterVeld = voorLetter[i];
                String achterNaamVeld = achterNaam[j];
                String straatNaamVeld = straatNaam[(int) (Math.random() * straatNaam.length)];
                String huisNummerVeld = "" + (int) (Math.random() * 200);
                String woonplaatsVeld = woonplaats[(int) (Math.random() * woonplaats.length)];
                String postcodeVeld = postcode[(int) (Math.random() * postcode.length)];
                String telefoonVeld = genTelefoon();
                String emailVeld = voorLetter[i] + achterNaam[j] + email[(int) (Math.random() * email.length)];
                Double ratingVeld = Math.random() * 200;
                
                String query = "INSERT INTO Speler(naam, voorletters, straatnaam, huisNr, woonplaats, postcode, telefoonNr, email, rating, gewonnenGeld, isDocent)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    Connection conn = SimpleDataSource.getConnection();
                    PreparedStatement stat = conn.prepareStatement(query);
                    stat.setString(1, achterNaamVeld);
                    stat.setString(2, voorLetterVeld);
                    stat.setString(3, straatNaamVeld);
                    stat.setString(4, huisNummerVeld);
                    stat.setString(5, woonplaatsVeld);
                    stat.setString(6, postcodeVeld);
                    stat.setString(7, telefoonVeld);
                    stat.setString(8, emailVeld);
                    stat.setDouble(9, ratingVeld);
                    stat.setInt(10, 0);
                    stat.setBoolean(11, false);

                    stat.executeUpdate();
                    stat.close();
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return null;
    }
    
    
    
    
    
}
