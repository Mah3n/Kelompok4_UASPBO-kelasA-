/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpustakaan;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kelompok4
 */
public class FrameBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku2
     */
    public FrameBuku() {
        initComponents();
        setTitle("Data Buku");
        tambahBuku();
    }
    
    public ArrayList ListBuku(){
        ArrayList<DataBuku> buku = new ArrayList<>();
        DataBuku buku1 = new DataBuku("AA01", "Dilan 1990", "Fidi Baiq", "Falcon", "2014");
        DataBuku buku2 = new DataBuku("AA02", "Kuasa Wanita Jawa", "Christina S Handayani", "LKiS", "2011");
        DataBuku buku3 = new DataBuku("AA03", "Dasar Dasar Uroginekologi", "Pribakti B", "Sagung Seto", "2011");
        DataBuku buku4 = new DataBuku("AA04", "Kesehjateraan Sosial", "Isbandi Rukminto Adi", "Rajagrafindo Persada", "2015");
        DataBuku buku5 = new DataBuku("AA05", "Metode Riset Bisnis Edisi II", "Suliyanto", "Andi Offset", "2009");
        DataBuku buku6 = new DataBuku("AA06", "Patologi Sosial I", "Kartini Kartono", "Sagung Seto", "2002");
        DataBuku buku7 = new DataBuku("AA07", "Strategic Management", "Sofjan Assauri", "Rajagrafindo Persada", "2016");
        DataBuku buku8 = new DataBuku("AA08", "Teks Otoritas Kebenaran", "Nasr Hamid Abu Zaid", "LKiS", "2012");
        DataBuku buku9 = new DataBuku("AA09", "Teologi Seksual", "Geoffrey Parrinder", "LKiS", "2004");
        DataBuku buku10 = new DataBuku("AA10", "Ilmu Dakwah", "Dr. Moh. Ali Aziz, M.AG", "Kencana", "2016");
        buku.add(buku1);
        buku.add(buku2);
        buku.add(buku3);
        buku.add(buku4);
        buku.add(buku5);
        buku.add(buku6);
        buku.add(buku7);
        buku.add(buku8);
        buku.add(buku9);
        buku.add(buku10);
        return buku;
    }
    
//    Method menambah data buku ke JTable
    public void tambahBuku(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        ArrayList<DataBuku> buku = ListBuku();
        Object rowdata[] = new Object[5];
        for(int i=0; i<buku.size(); i++){
            rowdata[0] = buku.get(i).kode;
            rowdata[1] = buku.get(i).judul;
            rowdata[2] = buku.get(i).pengarang;
            rowdata[3] = buku.get(i).penerbit;
            rowdata[4] = buku.get(i).thn_terbit;
            model.addRow(rowdata);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Data Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
