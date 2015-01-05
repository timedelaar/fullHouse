/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Tim
 */
public class EditToernooi extends javax.swing.JFrame {

    ToernooiView parent;
    Toernooi toernooi;
    
    
    /**
     * Creates new form AddUserFrame
     */
    public EditToernooi(ToernooiView parent, Toernooi toernooi) {
        initComponents();
        this.parent = parent;
        this.toernooi = toernooi;
        fillFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        naamLbl = new javax.swing.JLabel();
        voorlettersLbl = new javax.swing.JLabel();
        postcodeLbl = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        inlegField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        dayBox = new javax.swing.JComboBox();
        monthBox = new javax.swing.JComboBox();
        yearBox = new javax.swing.JComboBox();
        locatieCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maxSpelersField = new javax.swing.JTextField();
        minSpelersField = new javax.swing.JTextField();
        soortCB = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bewerk toernooi");

        addUserLbl.setText("Bewerk toernooi gegevens");

        idLbl.setText("toernooi ID:");

        naamLbl.setText("locatie:");

        voorlettersLbl.setText("datum:");

        postcodeLbl.setText("inleg:");

        idField.setEditable(false);

        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        dayBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november", "december" }));

        yearBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabel1.setText("max. spelers:");

        jLabel2.setText("min. spelers:");

        jLabel3.setText("soort:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUserLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voorlettersLbl)
                            .addComponent(naamLbl)
                            .addComponent(idLbl)
                            .addComponent(postcodeLbl)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inlegField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locatieCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soortCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(minSpelersField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addComponent(maxSpelersField, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naamLbl)
                    .addComponent(locatieCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voorlettersLbl)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inlegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postcodeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maxSpelersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(minSpelersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soortCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        updateValues();
        if (editToernooi()) {
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_saveBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void fillFields() {
        fillLocatieBox();
        idField.setText("" + toernooi.ID);
        
        String datum = toernooi.datum.toString();
        String day = datum.substring(8);
        int month = Integer.parseInt(datum.substring(5, 7));
        String year = datum.substring(0, 4);
        dayBox.setSelectedItem(day);
        monthBox.setSelectedIndex(month-1);
        yearBox.setSelectedItem(year);
        
        inlegField.setText("" + toernooi.inleg);
        maxSpelersField.setText("" + toernooi.maxSpelers);
        minSpelersField.setText("" + toernooi.minSpelers);
        fillSoortBox();
    }
    
    private void fillLocatieBox () {
        String query = "SELECT locatieID, naam FROM Locatie;";
        ModelItem current = null;
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            while (result.next()) {
                int id = result.getInt(1);
                String beschrijving = result.getString(2);
                ModelItem item = new ModelItem(id, beschrijving);
                model.addElement(item);
                if (id == toernooi.locatieID) {
                    current = item;
                }
            }
            locatieCB.setModel(model);
            locatieCB.setSelectedItem(current);
            
            result.close();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    private void fillSoortBox () {
        String query = "SELECT soortID, beschrijving FROM ToernooiSoort;";
        ModelItem current = null;
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            while (result.next()) {
                int id = result.getInt(1);
                String beschrijving = result.getString(2);
                ModelItem item = new ModelItem(id, beschrijving);
                model.addElement(item);
                if (id == toernooi.soort) {
                    current = item;
                }
            }
            soortCB.setModel(model);
            soortCB.setSelectedItem(current);
            
            result.close();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    private void updateValues () {
        ModelItem item = (ModelItem) locatieCB.getSelectedItem();
        toernooi.locatieID = item.id;
        int day = Integer.parseInt((String) dayBox.getSelectedItem());
        int month = monthBox.getSelectedIndex()+1;
        int year = Integer.parseInt((String) yearBox.getSelectedItem());
        toernooi.datum = Date.valueOf(year + "-" + month + "-" + day);
        toernooi.inleg = Integer.parseInt(inlegField.getText());
        toernooi.maxSpelers = Integer.parseInt(maxSpelersField.getText());
        toernooi.minSpelers = Integer.parseInt(minSpelersField.getText());
        item = (ModelItem) soortCB.getSelectedItem();
        toernooi.soort = item.id;
    }
    
    private boolean editToernooi () {
        String query = "UPDATE Toernooi SET maximumSpelers = ?, minimumSpelers = ?, soortToernooi = ? "
                + "WHERE evenementID=?;";
        String query2 = "UPDATE Evenement SET locatieID = ?, datum = ?, prijs = ? "
                + "WHERE evenementID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            if (checkDate(toernooi.ID, toernooi.locatieID, toernooi.datum)) {
                PreparedStatement stat = conn.prepareStatement(query);
                PreparedStatement stat2 = conn.prepareStatement(query2);
                stat.setInt(1, toernooi.maxSpelers);
                stat.setInt(2, toernooi.minSpelers);
                stat.setInt(3, toernooi.soort);
                stat.setInt(4, toernooi.ID);

                stat2.setInt(1, toernooi.locatieID);
                stat2.setDate(2, toernooi.datum);
                stat2.setInt(3, toernooi.inleg);
                stat2.setInt(4, toernooi.ID);

                stat.executeUpdate();
                stat2.executeUpdate();

                stat.close();
                stat2.close();
            }
            else {
                JOptionPane.showMessageDialog(this, "Er is op deze datum al een toernooi op deze locatie.", "Locatie onbeschikbaar", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
        parent.getToernooien();
        return true;
    }
    
    /*
     * Controleert of de locatie beschikbaar is op de gegeven datum.
     * @param locatieID De gegeven locatie.
     * @param datum De gegeven datum.
     * @return Returns true als de locatie beschikbaar is.
     */
    private boolean checkDate (int evenementID, int locatieID, Date datum) throws SQLException {
        String query = "SELECT * FROM Evenement WHERE locatieID = ? AND datum = ? AND NOT evenementID = ?;";
        Connection conn = SimpleDataSource.getConnection();
        PreparedStatement stat = conn.prepareStatement(query);
        
        stat.setInt(1, locatieID);
        stat.setDate(2, datum);
        stat.setInt(3, evenementID);
        
        ResultSet result = stat.executeQuery();
        if (result.next()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addUserLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox dayBox;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField inlegField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox locatieCB;
    private javax.swing.JTextField maxSpelersField;
    private javax.swing.JTextField minSpelersField;
    private javax.swing.JComboBox monthBox;
    private javax.swing.JLabel naamLbl;
    private javax.swing.JLabel postcodeLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox soortCB;
    private javax.swing.JLabel voorlettersLbl;
    private javax.swing.JComboBox yearBox;
    // End of variables declaration//GEN-END:variables
}
