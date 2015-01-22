/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

/**
 *
 * @author Quinten
 */
import java.awt.Color;
import java.sql.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EditMasterclass extends javax.swing.JFrame {

    MasterclassView parent;
    int classID;
    private int docent;
    private int minimumRating;
    private double prijs;
    private String naam;
    private Date datum;
    private int locatieID;

    public EditMasterclass(MasterclassView parent, int classID) {
        initComponents();
        this.parent = parent;
        this.classID = classID;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        naamField = new javax.swing.JTextField();
        minRatingField = new javax.swing.JTextField();
        prijsField = new javax.swing.JTextField();
        locatieComboBox = new javax.swing.JComboBox();
        dagComboBox = new javax.swing.JComboBox();
        maandComboBox = new javax.swing.JComboBox();
        jaarComboBox = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        docentCB = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Bewerk masterclass");

        jLabel2.setText("ClassID:");

        jLabel3.setText("Naam:");

        jLabel4.setText("Locatie:");

        jLabel5.setText("Datum:");

        jLabel6.setText("Naam docent:");

        jLabel7.setText("Minimum rating:");

        jLabel8.setText("Prijs:");

        idField.setEditable(false);

        minRatingField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minRatingFieldKeyTyped(evt);
            }
        });

        prijsField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prijsFieldKeyTyped(evt);
            }
        });

        dagComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        maandComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november", "december" }));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        warningLbl.setForeground(new java.awt.Color(240, 240, 240));
        warningLbl.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(warningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locatieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(naamField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jaarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(docentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(prijsField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(minRatingField, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locatieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(minRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prijsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (getValues()) {
            if (editMasterclass()) {
                this.setVisible(false);
                this.dispose();
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void minRatingFieldKeyTyped (java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minRatingFieldKeyTyped
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_minRatingFieldKeyTyped

    private void prijsFieldKeyTyped (java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prijsFieldKeyTyped
        if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9') && evt.getKeyChar() != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_prijsFieldKeyTyped
    
    private boolean editMasterclass() {
        boolean succes = false;
        String query = "UPDATE MasterClass SET docent = ?, minimumRating = ? "
                + "WHERE EvenementID = ?;";
        String query2 = "UPDATE Evenement SET naam = ?, prijs = ?, datum = ?, locatieID = ? "
                + "WHERE EvenementID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            PreparedStatement stat2 = conn.prepareStatement(query2);
            
            stat.setInt(1, docent);
            stat.setInt(2, minimumRating);
            stat.setInt(3, classID);
            
            stat2.setString(1, naam);
            stat2.setDouble(2, prijs);
            stat2.setDate(3, datum);
            stat2.setInt(4, locatieID);
            stat2.setInt(5, classID);
            
            if (!checkDate(locatieID, datum)) {
                int confirm = JOptionPane.showConfirmDialog(this, "<html>Er is op deze datum al een "
                        + "evenement op deze locatie.<br>Weet u zeker dat u ook een masterclass wilt plannen?</html>",
                        "Locatie bezet", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    stat.executeUpdate();
                    stat2.executeUpdate();
                    succes = true;
                }
            }
            else {
                stat.executeUpdate();
                stat2.executeUpdate();
                succes = true;
            }
            
            stat.close();
            stat2.close();
            parent.getMasterclasses();
        }
        catch (SQLException e) {
            FullHouse.showDBError(e);
        }
        return succes;
    }
    
    private void fillFields() {
        String query = "SELECT * FROM Evenement E "
                + "JOIN MasterClass MC ON E.EvenementID = MC.EvenementID "
                + "JOIN Speler S ON MC.docent = S.spelerID "
                + "WHERE E.EvenementID = ? ;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setInt(1, classID);
            ResultSet result = stat.executeQuery();
            result.next();
            
            naam = result.getString("E.naam");
            docent = result.getInt("docent");
            prijs = result.getDouble("prijs");
            minimumRating = result.getInt("minimumRating");

            idField.setText("" + classID);
            naamField.setText(naam);
            prijsField.setText("" + prijs);
            minRatingField.setText("" + minimumRating);

            fillDatumCB();
            datum = result.getDate("datum");
            String dag = datum.toString().substring(8);
            int maand = Integer.parseInt(datum.toString().substring(5, 7));
            String jaar = datum.toString().substring(0, 4);
            dagComboBox.setSelectedItem(dag);
            maandComboBox.setSelectedIndex(maand - 1);
            jaarComboBox.setSelectedItem(jaar);

            fillLocatieCB(locatieID);
            fillDocentCB(docent);

            result.close();
            stat.close();

        } catch (SQLException e) {
            FullHouse.showDBError(e);
        }
    }

    private void fillLocatieCB(int current) {
        String query = "SELECT LocatieID, naam FROM Locatie";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            fillBox(locatieComboBox, result, 1, new int[] {2}, current);
            result.close();
            stat.close();

        } catch (SQLException e) {
            FullHouse.showDBError(e);
        }
    }
    
    private void fillDocentCB(int current) {
        String query = "SELECT spelerID, naam, voorletters FROM Speler WHERE isDocent = ? ORDER BY naam;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setBoolean(1, true);
            ResultSet result = stat.executeQuery();
            fillBox(docentCB, result, 1, new int[] {2, 3}, current);
            
            result.close();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    private void fillDatumCB () {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 10; i++) {
            int year = currentYear + i;
            jaarComboBox.addItem(year);
        }
    }

    private void fillBox(JComboBox box, ResultSet result, int idColumn, int[] desColumn, int currentID) throws SQLException {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ModelItem current = new ModelItem(0, "");
        ModelItem item1 = new ModelItem(-1, "Selecteer");
        model.addElement(item1);
        while (result.next()) {
            int id = result.getInt(idColumn);
            String beschrijving = "";
            for (int i = 0; i < desColumn.length; i++) {
                beschrijving = beschrijving + result.getString(desColumn[i]) + " ";
            }
            ModelItem item = new ModelItem(id, beschrijving);
            if (id == currentID) {
                current = item;
            }
            model.addElement(item);
        }
        box.setModel(model);
        box.setSelectedItem(current);
    }
    
    private boolean getValues () {
        naam = naamField.getText();
        ModelItem item = (ModelItem) locatieComboBox.getSelectedItem();
        locatieID = item.id;
        if (locatieID == -1) {
            warningLbl.setText("Selecteer een locatie");
            warningLbl.setForeground(Color.red);
            return false;
        }
        item = (ModelItem) docentCB.getSelectedItem();
        docent = item.id;
        if (docent == -1) {
            warningLbl.setText("Selecteer een docent");
            warningLbl.setForeground(Color.red);
            return false;
        }
        datum = getDatum();
        if (datum.before(new Date(System.currentTimeMillis()))) {
            warningLbl.setText("<html>Datum ligt in het verleden.<br>Selecteer een andere datum</html>");
            warningLbl.setForeground(Color.red);
            return false;
        }
        if (naam.length() < 2) {
            warningLbl.setText("Naam moet minimaal twee karakters bevatten");
            warningLbl.setForeground(Color.red);
            return false;
        }
        
        try {
            minimumRating = Integer.parseInt(minRatingField.getText());
            prijs = Double.parseDouble(prijsField.getText());
        }
        catch (Exception e) {
            warningLbl.setText("Controleer rating en prijs");
            warningLbl.setForeground(Color.red);
            return false;
        }
        
        return true;
    }
    
    private Date getDatum() {
        int dag = Integer.parseInt((String) dagComboBox.getSelectedItem());
        int maand = maandComboBox.getSelectedIndex() + 1;
        int jaar = Integer.parseInt((String) jaarComboBox.getSelectedItem());
        return Date.valueOf(jaar + "-" + maand + "-" + dag);
    }
    
    
    
    private boolean checkDate(int locatieID, Date datum) throws SQLException {
        String query = "SELECT * FROM Evenement WHERE locatieID = ? AND datum = ?";
        Connection conn = SimpleDataSource.getConnection();
        PreparedStatement stat = conn.prepareStatement(query);
        
        stat.setInt(1, locatieID);
        stat.setDate(2, datum);
        
        ResultSet result = stat.executeQuery();
        if (!result.next()) {
            return true;
        } else {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox dagComboBox;
    private javax.swing.JComboBox docentCB;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox jaarComboBox;
    private javax.swing.JComboBox locatieComboBox;
    private javax.swing.JComboBox maandComboBox;
    private javax.swing.JTextField minRatingField;
    private javax.swing.JTextField naamField;
    private javax.swing.JTextField prijsField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
