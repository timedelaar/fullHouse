/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

/**
 *
 * @author Quinten
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MasterclassView extends javax.swing.JPanel {

    /**
     * Creates new form MasterclassView
     */
    
    public MasterclassView() {
        initComponents();
        getMasterclasses();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        masterclassTable = new javax.swing.JTable();
        newClassButton = new javax.swing.JButton();
        editClassButton = new javax.swing.JButton();
        deleteClassButton = new javax.swing.JButton();
        viewClassButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        masterclassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClassID", "Docent", "Minimum rating", "Prijs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        masterclassTable.setMinimumSize(new java.awt.Dimension(180, 64));
        masterclassTable.setPreferredSize(new java.awt.Dimension(590, 64));
        masterclassTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(masterclassTable);

        newClassButton.setText("<html><div align=center>Nieuwe<br>masterclass</div></html>");
        newClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClassButtonMouseClicked(evt);
            }
        });

        editClassButton.setText("<html><div align=center>Bewerk<br>masterclass</div></html>");
        editClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClassButtonMouseClicked(evt);
            }
        });

        deleteClassButton.setText("<html><div align=center>Verwijder<br>masterclass</div></html>");
        deleteClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClassButtonMouseClicked(evt);
            }
        });

        viewClassButton.setText("<html><div align=center>Bekijk<br>inschrijvingen</div></html>");
        viewClassButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewClassButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteClassButton, editClassButton, newClassButton, viewClassButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 306, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteClassButton, editClassButton, newClassButton, viewClassButton});

    }// </editor-fold>//GEN-END:initComponents

    /**
     * Opent dialog voor het toevoegen van nieuwe masterclass.
     * @param evt 
     */
    private void newClassButtonMouseClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClassButtonMouseClicked
        AddMasterclass addMasterclass = new AddMasterclass(this);
        addMasterclass.setLocationRelativeTo(this);
        addMasterclass.setVisible(true);
    }//GEN-LAST:event_newClassButtonMouseClicked

    /**
     * Verwijdert geselecteerde masterclass.
     * @param evt 
     */
    private void deleteClassButtonMouseClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClassButtonMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u deze masterclass wilt verwijderen?", "Verwijder toernooi?", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int[] rows = masterclassTable.getSelectedRows();
            for (int i = 0; i < rows.length; i++) {
                int id = Integer.parseInt(masterclassTable.getValueAt(rows[i], 0).toString());
                deleteMasterclass(id);
            }
        }
    }//GEN-LAST:event_deleteClassButtonMouseClicked

    /**
     * Opent dialog voor het bewerken van de geselecteerde masterclass.
     * @param evt 
     */
    private void editClassButtonMouseClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClassButtonMouseClicked
        int[] rows = masterclassTable.getSelectedRows();
        if(rows.length == 0){
            JOptionPane.showMessageDialog(this, "Geen masterclass geselecteerd", "Bewerk masterclass", JOptionPane.ERROR_MESSAGE);
        }
        if (rows.length > 5) {
            JOptionPane.showMessageDialog(this, "<html>Meer dan 5 classes geselecteerd.<br>Selecteer maximaal 5 classes</html>",
                    "Bewerk masterclass", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(int i = 0; i < rows.length; i++){
                int classID = Integer.parseInt(masterclassTable.getValueAt(rows[i], 0).toString());
                EditMasterclass editMasterclass = new EditMasterclass(this, classID);
                editMasterclass.setLocation(200 + i*30, 150 + i*30 - (i/5)*150);
                editMasterclass.setVisible(true);                
            }
            getMasterclasses();
        }
    }//GEN-LAST:event_editClassButtonMouseClicked

    /**
     * Opent dialog voor het bekijken van de inschrijving van de geselecteerde masterclass.
     * @param evt 
     */
    private void viewClassButtonMouseClicked (java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewClassButtonMouseClicked
        int[] rows = masterclassTable.getSelectedRows();
        if(rows.length == 0){
            JOptionPane.showMessageDialog(this, "Geen masterclass geselecteerd", "Bekijk inschrijvingen", JOptionPane.ERROR_MESSAGE);
        }
        if (rows.length > 5) {
            JOptionPane.showMessageDialog(this, "<html>Meer dan 5 classes geselecteerd.<br>Selecteer maximaal 5 classes</html>",
                    "Bekijk inschrijvingen", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(int i = 0; i < rows.length; i++){
                int classID = Integer.parseInt(masterclassTable.getValueAt(rows[i], 0).toString());
                InschrijvingViewMC viewInschrijvingen = new InschrijvingViewMC(classID);
                viewInschrijvingen.setLocation(200 + i*30, 150 + i*30 - (i/5)*150);
                viewInschrijvingen.setVisible(true);                
            }
            getMasterclasses();
        }
    }//GEN-LAST:event_viewClassButtonMouseClicked
    
    /**
     * Haalt masterclasses op uit de database.
     */
    public final void getMasterclasses(){
        String query = "SELECT MasterClass.evenementID, MasterClass.docent, MasterClass.minimumRating, "
                + "Evenement.naam, Evenement.datum, Evenement.prijs, Speler.naam, Speler.voorletters FROM MasterClass " 
                + "JOIN Evenement ON Evenement.evenementID = MasterClass.evenementID "
                + "JOIN Speler ON MasterClass.docent = Speler.spelerID;";
        try{
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            fillTable(result);
            result.close();
            stat.close();
        }
        catch(SQLException e){
            FullHouse.showDBError(e);
        }
    }
    
    /**
     * Vult de tabel met de masterclasses.
     * @param result
     * @throws SQLException 
     */
    private void fillTable(ResultSet result) throws SQLException{
        String[] columnNames = {"ClassID", "Class naam", "Docent", "Datum", "Minimum rating", "Prijs"};
        DefaultTableModel model = new TableModel();
        model.setDataVector(new Object[][]{}, columnNames);
        while(result.next()){
            String ID = result.getString("MasterClass.evenementID");
            ID = FullHouse.addZeroes(ID, 4);
            String naam = result.getString("Evenement.naam");
            String docent = result.getString("Speler.naam") + ", " + result.getString("Speler.voorletters");
            Date datum = result.getDate("Evenement.datum");
            int minimumRating = result.getInt("minimumrating");
            double prijs = result.getDouble("prijs");
            Object[] rowData = {ID, naam, docent, datum, minimumRating, prijs};
            model.addRow(rowData);
        }
        masterclassTable.setModel(model);
        result.close();
    }
    
    /**
     * Verwijdert masterclass uit de database.
     * @param id 
     */
    private void deleteMasterclass(int id){
        String query = "DELETE FROM MasterClass WHERE EvenementID = ?;";
        String query2 = "DELETE FROM Evenement WHERE EvenementID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            PreparedStatement stat2 = conn.prepareStatement(query2);
            
            stat.setInt(1, id);
            stat.executeUpdate();
            stat.close();
            
            stat2.setInt(1, id);
            stat2.executeUpdate();
            stat2.close();
            
        } catch (SQLException e) {
            FullHouse.showDBError(e);
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteClassButton;
    private javax.swing.JButton editClassButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable masterclassTable;
    private javax.swing.JButton newClassButton;
    private javax.swing.JButton viewClassButton;
    // End of variables declaration//GEN-END:variables
}
