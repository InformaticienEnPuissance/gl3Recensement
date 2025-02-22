/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Classes.Population;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import dao.ConnectDB;
import dao.PopulationDao;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class PanelRecensement extends javax.swing.JPanel {

    /**
     * Creates new form PanelRecensement
     */
    public PanelRecensement() {
        initComponents();

        Calendar calendrier = Calendar.getInstance();
        calendrier.getTime();
        SimpleDateFormat dateactuelle = new SimpleDateFormat("dd / MM / yyyy");
        String affichedate = (dateactuelle.format(calendrier.getTime()));
        txt_dateEnreg.setText(affichedate);

        listeRecensement();

        PopulationDao idr = new PopulationDao();
        txt_id.setText(idr.getIdr() + "");
    }
    //fonction pour mettre la prmiere lettre en majuscule.
   private String firstLetterUppercase(String value){
       return value.trim().substring(0,1)+value.trim().substring(1);
   }
    StringBuffer buffer;
private static void convert(StringBuffer buffer)
 {
 char previous = ' ';

 for (int i = 0; i < buffer.length(); i++)
 {
 if (Character.isWhitespace(previous))
 buffer.setCharAt(i,
 Character.toUpperCase(buffer.charAt(i)));
 previous = buffer.charAt(i);
 }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_prenom = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_lieuNais = new javax.swing.JTextField();
        txt_domicile = new javax.swing.JTextField();
        txt_nomPere = new javax.swing.JTextField();
        txt_profession = new javax.swing.JTextField();
        txt_dateNais = new com.toedter.calendar.JDateChooser();
        btn_modifier = new javax.swing.JButton();
        btn_ajouter = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_recensement = new javax.swing.JTable();
        txt_dateEnreg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        txt_sexe = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txt_region = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulaire de recensement", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Fax", 1, 16))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Identifiant :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Prénom :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 154, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Nom");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 216, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Date de naissance :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 262, -1, 32));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Lieu de naissance :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 323, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Région :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 374, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Sexe :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 432, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Date d'enregistrement");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 620, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Nom du Père");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 586, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Profession :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 528, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Domicile :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 477, -1, -1));
        add(txt_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 148, 131, 33));
        add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 208, 131, 36));
        add(txt_lieuNais, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 316, 131, 34));

        txt_domicile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_domicileActionPerformed(evt);
            }
        });
        add(txt_domicile, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 468, 131, 38));
        add(txt_nomPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 578, 131, 36));
        add(txt_profession, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 524, 131, 33));
        add(txt_dateNais, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 262, 131, 32));

        btn_modifier.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });
        add(btn_modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 586, 98, 36));

        btn_ajouter.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });
        add(btn_ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 586, 98, 36));

        btn_supprimer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });
        add(btn_supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 586, 111, 36));

        tb_recensement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Prénom", "Nom", "Date Naissance", "Lieu Naissance", "Region", "Sexe", "Domicile", "Profession", "Nom du Père", "Date d'enregistreement"
            }
        ));
        tb_recensement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_recensementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_recensement);
        if (tb_recensement.getColumnModel().getColumnCount() > 0) {
            tb_recensement.getColumnModel().getColumn(10).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 930, 380));

        txt_dateEnreg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dateEnreg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_dateEnreg.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 1, true));
        add(txt_dateEnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 620, 131, 18));

        jPanel1.setBackground(new java.awt.Color(80, 240, 110));

        jPanel3.setBackground(new java.awt.Color(242, 242, 0));

        jPanel2.setBackground(new java.awt.Color(225, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 95, -1, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel13.setText("Un Peuple - Un But - Une Foi");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 59, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel14.setText("Republique du Mali");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 28, 154, -1));

        txt_id.setBackground(new java.awt.Color(255, 255, 255));
        txt_id.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 1, true));
        add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 130, 37));

        txt_sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin" }));
        txt_sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexeActionPerformed(evt);
            }
        });
        add(txt_sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 413, 131, 37));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setMaximumSize(new java.awt.Dimension(3264, 1088));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 81, 133, 30));

        txt_region.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bamako", "Kayes", "Koulikoro", "Sikasso", "Ségou", "Mopti", "Tombouctou", "Gao", "Kidal", "Taoudeni", "Ménaka", "Nioro", "Kita", "Dioïla", "Bougouni", "Koutiala", "San", "Douentza", "Bandiagara" }));
        txt_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regionActionPerformed(evt);
            }
        });
        add(txt_region, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        int index = tb_recensement.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selectionner un recencé");
        } else {
    
            int id = (int) tb_recensement.getValueAt(index, 0);
            
            String prenom = txt_prenom.getText().trim();
            String nom = txt_nom.getText().toUpperCase().trim();
            Date dateNais = txt_dateNais.getDate();
            String lieuNais = txt_lieuNais.getText().trim();
            String region = txt_region.getSelectedItem().toString();
            String sexe = txt_sexe.getSelectedItem().toString();
            String domicile = txt_domicile.getText().trim();
            String profession = txt_profession.getText().trim();
            String nomPere = txt_nomPere.getText().trim();
            String dateEnreg = txt_dateEnreg.getText();
            Population et = new Population(prenom, nom, dateNais, lieuNais, region, sexe, domicile, profession, nomPere, dateEnreg);
            PopulationDao pdao = new PopulationDao();
            pdao.modifier(et, id);
            vider();
            listeRecensement();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
       
        String prenom = firstLetterUppercase(txt_prenom.getText());
        String nom = txt_nom.getText().toUpperCase().trim();
        Date dateNais = txt_dateNais.getDate();
        String lieuNais = txt_lieuNais.getText().trim();
        String region = txt_region.getSelectedItem().toString();
        String sexe = txt_sexe.getSelectedItem().toString();
        String domicile = txt_domicile.getText().trim();
        String profession = txt_profession.getText().trim();
        String nomPere = txt_nomPere.getText().trim();
        String dateEnreg = txt_dateEnreg.getText();

        if (prenom.equals("") || nom.equals("") || lieuNais.equals("") || region.equals("")
                || sexe.equals("")|| domicile.equals("") || profession.equals("") || nomPere.equals("") || dateEnreg.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez renseigner les champs");
        } else {
            Population et = new Population(prenom, nom, dateNais, lieuNais, region, sexe, domicile, profession, nomPere, dateEnreg);
            PopulationDao pdao = new PopulationDao();
            pdao.ajouter(et);
            vider();
            listeRecensement();

            PopulationDao idr = new PopulationDao();
            txt_id.setText(idr.getIdr() + "");
        };

    }//GEN-LAST:event_btn_ajouterActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_recensement.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selectionner un recencé");

        } else {
            int id = (int) tb_recensement.getValueAt(index, 0);
            PopulationDao pdao = new PopulationDao();
            pdao.supprime(id);
            vider();
            listeRecensement();
        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void txt_domicileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_domicileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_domicileActionPerformed

    private void tb_recensementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_recensementMouseClicked
        int index = tb_recensement.getSelectedRow();
        if (index != -1) {
            int id = (int) tb_recensement.getValueAt(index, 0);
            PopulationDao pdao = new PopulationDao();
            Population rec = pdao.recherche(id);
            txt_id.setText(rec.getIdr() + "");
            txt_prenom.setText(rec.getPrenom());
            txt_nom.setText(rec.getNom());
            txt_dateNais.setDate(rec.getDateNais());
            txt_lieuNais.setText(rec.getLieuNais());
            txt_region.setSelectedItem(rec.getRegion());
            txt_sexe.setSelectedItem(rec.getSexe());
            txt_domicile.setText(rec.getDomicile());
            txt_profession.setText(rec.getprofession());
            txt_nomPere.setText(rec.getNomPere());
            txt_dateEnreg.setText(rec.getDateEnreg());
        }
    }//GEN-LAST:event_tb_recensementMouseClicked

    private void txt_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regionActionPerformed

    private void txt_sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_recensement;
    private javax.swing.JLabel txt_dateEnreg;
    private com.toedter.calendar.JDateChooser txt_dateNais;
    private javax.swing.JTextField txt_domicile;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_lieuNais;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_nomPere;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_profession;
    private javax.swing.JComboBox<String> txt_region;
    private javax.swing.JComboBox<String> txt_sexe;
    // End of variables declaration//GEN-END:variables

    private void vider() {
        txt_prenom.setText("");
        txt_nom.setText("");
        txt_dateNais.setDate(null);
        txt_lieuNais.setText("");
        txt_region.setSelectedItem("");
        txt_sexe.setSelectedItem("");
        txt_domicile.setText(null);
        txt_profession.setText("");
        txt_nomPere.setText("");
        DefaultTableModel model = (DefaultTableModel) tb_recensement.getModel();
        model.setRowCount(0);
    }
//Affichage des recensé dans la liste dans le tableau

    private void listeRecensement() {
        PopulationDao pdao = new PopulationDao();
        List<Population> le = pdao.list();
        DefaultTableModel model = (DefaultTableModel) tb_recensement.getModel();
        model.setRowCount(0);
        for (Population rec : le) {
            model.addRow(new Object[]{
                rec.getIdr(),
                rec.getPrenom(),
                rec.getNom(),
                rec.getDateNais(),
                rec.getLieuNais(),
                rec.getRegion(),
                rec.getSexe(),
                rec.getDomicile(),
                rec.getprofession(),
                rec.getNomPere(),
                rec.getDateEnreg()
            });
        }
        tb_recensement.setModel(model);
    }
}
