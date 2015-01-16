/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

/**
 *
 * @author Quinten
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.swing.JTable;
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

        setPreferredSize(new java.awt.Dimension(712, 472));

        masterclassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ClassID", "Docent", "Minimum rating", "Prijs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        masterclassTable.setPreferredSize(new java.awt.Dimension(900, 64));
        jScrollPane1.setViewportView(masterclassTable);

        newClassButton.setText("Nieuwe class");
        newClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClassButtonMouseClicked(evt);
            }
        });

        editClassButton.setText("Bewerk class");

        deleteClassButton.setText("Verwijder class");

        viewClassButton.setText("Bekijk class");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewClassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteClassButton, editClassButton, newClassButton, viewClassButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteClassButton, editClassButton, newClassButton, viewClassButton});

    }// </editor-fold>//GEN-END:initComponents

    private void newClassButtonMouseClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClassButtonMouseClicked
        AddMasterclass addMasterclass = new AddMasterclass();
        addMasterclass.setLocationRelativeTo(this);
        addMasterclass.setVisible(true);
    }//GEN-LAST:event_newClassButtonMouseClicked
    
    public final void getMasterclasses(){
        String query = "SELECT * FROM MasterClass" 
                     + " JOIN Evenement ON Evenement.evenementID = MasterClass.evenementID;";
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
    
    private void fillTable(ResultSet result) throws SQLException{
        String[] columnNames = {"ClassID", "Docent", "Minimum rating", "Prijs"};
        DefaultTableModel model = new TableModel();
        model.setDataVector(new Object[][]{}, columnNames);
        while(result.next()){
            String ID = result.getString("evenementID");
            ID = FullHouse.addZeroes(ID, 4);
            String docent = result.getString("docent");
            int minimumRating = result.getInt("minimumrating");
            int prijs = result.getInt("prijs");
            Object[] rowData = {ID, docent, minimumRating, prijs};
            model.addRow(rowData);
        }
        masterclassTable.setModel(model);
        result.close();
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
