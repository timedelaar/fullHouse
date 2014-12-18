/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Tim
 */
public class EditLocatie extends javax.swing.JFrame {

    LocatieView parent;
    Locatie locatie;
    /**
     * Creates new form AddUserFrame
     */
    public EditLocatie(LocatieView parent, Locatie locatie) {
        initComponents();
        this.parent = parent;
        this.locatie = locatie;
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
        naamLbl = new javax.swing.JLabel();
        straatHuisNrLbl = new javax.swing.JLabel();
        woonplaatsLbl = new javax.swing.JLabel();
        postcodeLbl = new javax.swing.JLabel();
        telefoonNrLbl = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        straatnaamField = new javax.swing.JTextField();
        huisNrField = new javax.swing.JTextField();
        plaatsField = new javax.swing.JTextField();
        postcodeField = new javax.swing.JTextField();
        aantalField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spelersPerField = new javax.swing.JTextField();
        naamField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bewerk locatie");

        addUserLbl.setText("Bewerk locatie gegevens");

        naamLbl.setText("ID:");

        straatHuisNrLbl.setText("straatnaam & huisnr:");

        woonplaatsLbl.setText("woonplaats:");

        postcodeLbl.setText("postcode:");

        telefoonNrLbl.setText("aantal tafels:");

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

        jLabel1.setText("beschrijving locatie:");

        jLabel2.setText("spelers per tafel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(straatHuisNrLbl)
                            .addComponent(woonplaatsLbl)
                            .addComponent(postcodeLbl)
                            .addComponent(telefoonNrLbl)
                            .addComponent(naamLbl)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(straatnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(huisNrField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(postcodeField)
                            .addComponent(plaatsField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spelersPerField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aantalField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naamField)
                            .addComponent(idField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addUserLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naamLbl)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(naamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(straatHuisNrLbl)
                    .addComponent(huisNrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(straatnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(woonplaatsLbl)
                    .addComponent(plaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postcodeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoonNrLbl)
                    .addComponent(aantalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spelersPerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        locatie.naam = naamField.getText();
        locatie.straatnaam = straatnaamField.getText();
        locatie.huisNr = huisNrField.getText();
        locatie.plaats = plaatsField.getText();
        locatie.postcode = postcodeField.getText();
        locatie.aantalTafels = Integer.parseInt(aantalField.getText());
        locatie.spelersPerTafel = Integer.parseInt(spelersPerField.getText());
        
        editLocatie(locatie);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_saveBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    /**
     * Vult de text velden met corresponderende waardes.
     */
    private void fillFields() {
        idField.setText("" + locatie.ID);
        naamField.setText(locatie.naam);
        straatnaamField.setText(locatie.straatnaam);
        huisNrField.setText(locatie.huisNr);
        plaatsField.setText(locatie.plaats);
        postcodeField.setText(locatie.postcode);
        aantalField.setText("" + locatie.aantalTafels);
        spelersPerField.setText("" + locatie.spelersPerTafel);
    }
    
    private void editLocatie (Locatie locatie) {
        String query = "UPDATE Locatie SET naam=?, straatnaam=?, huisNr=?, woonplaats=?, postcode=?,"
                + "aantalTafels=?, spelersPerTafel=? WHERE locatieID=?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, locatie.naam);
            stat.setString(2, locatie.straatnaam);
            stat.setString(3, locatie.huisNr);
            stat.setString(4, locatie.plaats);
            stat.setString(5, locatie.postcode);
            stat.setInt(6, locatie.aantalTafels);
            stat.setInt(7, locatie.spelersPerTafel);
            stat.setInt(8, locatie.ID);
            
            stat.executeUpdate();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
        parent.getLocaties();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aantalField;
    private javax.swing.JLabel addUserLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField huisNrField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField naamField;
    private javax.swing.JLabel naamLbl;
    private javax.swing.JTextField plaatsField;
    private javax.swing.JTextField postcodeField;
    private javax.swing.JLabel postcodeLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField spelersPerField;
    private javax.swing.JLabel straatHuisNrLbl;
    private javax.swing.JTextField straatnaamField;
    private javax.swing.JLabel telefoonNrLbl;
    private javax.swing.JLabel woonplaatsLbl;
    // End of variables declaration//GEN-END:variables
}
