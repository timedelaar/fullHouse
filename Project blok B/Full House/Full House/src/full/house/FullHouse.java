/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import javax.swing.JOptionPane;


/**
 *
 * @author Tim
 */
public class FullHouse {

    private static MainWindow window;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        window = new MainWindow();
        window.setLocation(100,50);
        window.setVisible(true);
    }
    
    public static void showDBError (Exception e) {
        JOptionPane.showMessageDialog(window, "<html>Er is een fout opgetreden bij de communicatie met de database.<br>"
                        + "Controleer of U verbinding met het internet heeft.<br>"
                        + "Contacteer uw beheerder als deze fout zich blijft voordoen", "Database error", JOptionPane.ERROR_MESSAGE);
        System.out.println(e);
    }
    
    public static String addZeroes (String s, int length) {
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }
}
