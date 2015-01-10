/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tim
 */
public class TableModel extends DefaultTableModel {
    
    public boolean isCellEditable (int row, int column) {
        return false;
    }
}
