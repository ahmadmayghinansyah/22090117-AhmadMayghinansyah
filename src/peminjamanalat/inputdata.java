/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peminjamanalat;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
/**
 *
 * @author User
 */
public class inputdata extends javax.swing.JFrame {

    /**
     * Creates new form inputdata
     */
    public inputdata() {
        initComponents();
        setLocationRelativeTo(this);
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
        jPinputdata = new javax.swing.JPanel();
        jTFkodealat = new javax.swing.JTextField();
        jLkodealat = new javax.swing.JLabel();
        jLnamaalat = new javax.swing.JLabel();
        jTFnamaalat = new javax.swing.JTextField();
        jLmerkalat = new javax.swing.JLabel();
        jTFmerkalat = new javax.swing.JTextField();
        jLtahun = new javax.swing.JLabel();
        jTFtahun = new javax.swing.JTextField();
        jLjumlah = new javax.swing.JLabel();
        jTFjumlah = new javax.swing.JTextField();
        jBbataldata = new javax.swing.JButton();
        jBhapusdata = new javax.swing.JButton();
        jBsimpandata = new javax.swing.JButton();
        jBeditdata = new javax.swing.JButton();
        jPdaftardata = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledataalat = new javax.swing.JTable();
        jTFcaridata = new javax.swing.JTextField();
        jBcaridata = new javax.swing.JButton();
        jBmunculdata = new javax.swing.JButton();
        jBkembalidata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 42, 33));

        jPinputdata.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "InputData", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24), new java.awt.Color(213, 206, 163))); // NOI18N
        jPinputdata.setOpaque(false);

        jTFkodealat.setBackground(new java.awt.Color(229, 229, 203));

        jLkodealat.setBackground(new java.awt.Color(0, 0, 0));
        jLkodealat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLkodealat.setForeground(new java.awt.Color(213, 206, 163));
        jLkodealat.setText("Kode Alat");

        jLnamaalat.setBackground(new java.awt.Color(0, 0, 0));
        jLnamaalat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLnamaalat.setForeground(new java.awt.Color(213, 206, 163));
        jLnamaalat.setText("Nama Alat");

        jTFnamaalat.setBackground(new java.awt.Color(229, 229, 203));

        jLmerkalat.setBackground(new java.awt.Color(0, 0, 0));
        jLmerkalat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLmerkalat.setForeground(new java.awt.Color(213, 206, 163));
        jLmerkalat.setText("Merk Alat");

        jTFmerkalat.setBackground(new java.awt.Color(229, 229, 203));

        jLtahun.setBackground(new java.awt.Color(0, 0, 0));
        jLtahun.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLtahun.setForeground(new java.awt.Color(213, 206, 163));
        jLtahun.setText("Tahun");

        jTFtahun.setBackground(new java.awt.Color(229, 229, 203));

        jLjumlah.setBackground(new java.awt.Color(0, 0, 0));
        jLjumlah.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLjumlah.setForeground(new java.awt.Color(213, 206, 163));
        jLjumlah.setText("Jumlah");

        jTFjumlah.setBackground(new java.awt.Color(229, 229, 203));

        jBbataldata.setBackground(new java.awt.Color(229, 229, 203));
        jBbataldata.setText("Clear");
        jBbataldata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbataldataActionPerformed(evt);
            }
        });

        jBhapusdata.setBackground(new java.awt.Color(229, 229, 203));
        jBhapusdata.setText("Hapus");
        jBhapusdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhapusdataActionPerformed(evt);
            }
        });

        jBsimpandata.setBackground(new java.awt.Color(229, 229, 203));
        jBsimpandata.setText("Simpan");
        jBsimpandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsimpandataActionPerformed(evt);
            }
        });

        jBeditdata.setBackground(new java.awt.Color(229, 229, 203));
        jBeditdata.setText("Edit");
        jBeditdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPinputdataLayout = new javax.swing.GroupLayout(jPinputdata);
        jPinputdata.setLayout(jPinputdataLayout);
        jPinputdataLayout.setHorizontalGroup(
            jPinputdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinputdataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPinputdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFkodealat)
                    .addComponent(jTFnamaalat)
                    .addComponent(jTFmerkalat)
                    .addComponent(jTFtahun)
                    .addComponent(jTFjumlah)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinputdataLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBbataldata))
                    .addGroup(jPinputdataLayout.createSequentialGroup()
                        .addGroup(jPinputdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLkodealat)
                            .addComponent(jLnamaalat)
                            .addComponent(jLmerkalat)
                            .addComponent(jLtahun)
                            .addComponent(jLjumlah))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPinputdataLayout.createSequentialGroup()
                        .addComponent(jBsimpandata)
                        .addGap(18, 18, 18)
                        .addComponent(jBeditdata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jBhapusdata)))
                .addContainerGap())
        );
        jPinputdataLayout.setVerticalGroup(
            jPinputdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinputdataLayout.createSequentialGroup()
                .addComponent(jLkodealat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFkodealat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnamaalat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnamaalat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLmerkalat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFmerkalat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLtahun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFtahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLjumlah)
                .addGroup(jPinputdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPinputdataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBbataldata)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinputdataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPinputdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBhapusdata)
                            .addComponent(jBsimpandata)
                            .addComponent(jBeditdata))
                        .addGap(53, 53, 53))))
        );

        jPdaftardata.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24), new java.awt.Color(213, 206, 163))); // NOI18N
        jPdaftardata.setOpaque(false);

        jTabledataalat.setBackground(new java.awt.Color(229, 229, 203));
        jTabledataalat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Alat", "Nama Alat", "Merk Alat", "Tahun", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabledataalat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabledataalatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabledataalat);
        if (jTabledataalat.getColumnModel().getColumnCount() > 0) {
            jTabledataalat.getColumnModel().getColumn(0).setResizable(false);
            jTabledataalat.getColumnModel().getColumn(1).setResizable(false);
            jTabledataalat.getColumnModel().getColumn(2).setResizable(false);
            jTabledataalat.getColumnModel().getColumn(3).setResizable(false);
            jTabledataalat.getColumnModel().getColumn(4).setResizable(false);
        }

        jTFcaridata.setBackground(new java.awt.Color(229, 229, 203));

        jBcaridata.setBackground(new java.awt.Color(229, 229, 203));
        jBcaridata.setText("Cari");
        jBcaridata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaridataActionPerformed(evt);
            }
        });

        jBmunculdata.setBackground(new java.awt.Color(229, 229, 203));
        jBmunculdata.setText("Data");
        jBmunculdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmunculdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPdaftardataLayout = new javax.swing.GroupLayout(jPdaftardata);
        jPdaftardata.setLayout(jPdaftardataLayout);
        jPdaftardataLayout.setHorizontalGroup(
            jPdaftardataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdaftardataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPdaftardataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPdaftardataLayout.createSequentialGroup()
                        .addComponent(jTFcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBcaridata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBmunculdata)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPdaftardataLayout.setVerticalGroup(
            jPdaftardataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdaftardataLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPdaftardataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcaridata)
                    .addComponent(jBmunculdata))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBkembalidata.setText("Kembali");
        jBkembalidata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBkembalidataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPinputdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPdaftardata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBkembalidata)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jBkembalidata)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPinputdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPdaftardata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbataldataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbataldataActionPerformed
        // TODO add your handling code here:
        jTFkodealat.setText("");
        jTFnamaalat.setText("");
        jTFmerkalat.setText("");
        jTFtahun.setText("");
        jTFjumlah.setText("");
    }//GEN-LAST:event_jBbataldataActionPerformed

    private void jBsimpandataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsimpandataActionPerformed
        // TODO add your handling code here:
String kode = jTFkodealat.getText();
String nama = jTFnamaalat.getText();
String merk = jTFmerkalat.getText();
String tahun = jTFtahun.getText();
String jumlah = jTFjumlah.getText();

if (kode.isEmpty() || nama.isEmpty() || merk.isEmpty() || tahun.isEmpty() || jumlah.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Harap isi semua kolom", "Coba lagi", JOptionPane.ERROR_MESSAGE);
} else {
    try {
        DefaultTableModel model = (DefaultTableModel) jTabledataalat.getModel();
        model.addRow(new Object[]{kode, nama, merk, tahun, jumlah});

        jTFkodealat.setText("");
        jTFnamaalat.setText("");
        jTFmerkalat.setText("");
        jTFtahun.setText("");
        jTFjumlah.setText("");

        Connection k = dbkoneksi.getConnection();
        Statement s = k.createStatement();
        String q = "INSERT INTO alat "
                 + "(kode, nama, merk, tahun, jumlah) "
                 + "VALUES ('" + kode + "','" + nama + "','" + merk + "','" + tahun + "','"  + jumlah + "')";
        s.executeUpdate(q);
        System.out.println("Data berhasil disimpan ke database!");
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
}
    }//GEN-LAST:event_jBsimpandataActionPerformed

    private void jBhapusdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhapusdataActionPerformed
        // TODO add your handling code here:
        int row = jTabledataalat.getSelectedRow();
    
    if (row < 0) {
        JOptionPane.showMessageDialog(this,"Pilih salah satu data!", "Coba lagi!", JOptionPane.ERROR_MESSAGE);
    } else {
        DefaultTableModel model = (DefaultTableModel) jTabledataalat.getModel();
        int kodeToDelete = Integer.parseInt(model.getValueAt(row, 0).toString()); 
        model.removeRow(row);
        
        try {
            Connection k = dbkoneksi.getConnection();
            Statement s = k.createStatement();
            String q = "DELETE FROM alat WHERE kode=" + kodeToDelete; 
            s.executeUpdate(q);
            System.out.println("Data berhasil dihapus dari database!");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_jBhapusdataActionPerformed

    private void jBeditdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditdataActionPerformed
        // TODO add your handling code here:
        int row = jTabledataalat.getSelectedRow();

    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Pilih salah satu data!", "Coba lagi!", JOptionPane.ERROR_MESSAGE);
    } else {
        DefaultTableModel model = (DefaultTableModel) jTabledataalat.getModel();
        int kodeToUpdate = Integer.parseInt(model.getValueAt(row, 0).toString()); // Ambil nilai kode alat dari baris yang dipilih

        String kode = jTFkodealat.getText();
        String nama = jTFnamaalat.getText();
        String merk = jTFmerkalat.getText();
        String tahun = jTFtahun.getText();
        String jumlah = jTFjumlah.getText();

        // Jika tidak ada data yang dipilih untuk diubah
        if (kode.isEmpty() || nama.isEmpty() || merk.isEmpty() || tahun.isEmpty() || jumlah.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua kolom", "Coba lagi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Hapus baris yang ada
                model.removeRow(row);

                // Tambahkan baris yang diperbarui
                model.insertRow(row, new Object[]{kode, nama, merk, tahun, jumlah});

                Connection k = dbkoneksi.getConnection();
                Statement s = k.createStatement();
                String q = "UPDATE alat SET kode='" + kode + "', nama='" + nama + "', merk='" + merk + "', tahun='" + tahun + "', jumlah='" + jumlah + "' WHERE kode=" + kodeToUpdate;
                s.executeUpdate(q);
                System.out.println("Data berhasil diperbarui di database!");
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_jBeditdataActionPerformed

    private void jTabledataalatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledataalatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabledataalatMouseClicked

    private void jBmunculdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmunculdataActionPerformed
        // TODO add your handling code here:
        try {
    jTabledataalat.setModel(new DefaultTableModel());
    DefaultTableModel model = (DefaultTableModel) jTabledataalat.getModel();
    Connection conn = (Connection) dbkoneksi.getConnection();
    Statement st = conn.createStatement();
    String query = "SELECT kode AS 'Kode Alat', Nama AS 'Nama Alat', merk AS 'Merk Alat', tahun AS 'Tahun', jumlah AS 'Jumlah' FROM alat ORDER BY kode";
    ResultSet rs = st.executeQuery(query);
    ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();

    int cols = rsmd.getColumnCount();
    String[] colName = new String[cols];
    for (int i = 0; i < cols; i++)
        colName[i] = rsmd.getColumnName(i + 1);
    model.setColumnIdentifiers(colName);
    String kodeAlat, namaAlat, merkAlat, tahun, jumlah; // Menggunakan camelCase untuk variabel
    while (rs.next()) {
        kodeAlat = rs.getString("Kode Alat");
        namaAlat = rs.getString("Nama Alat");
        merkAlat = rs.getString("Merk Alat");
        tahun = rs.getString("Tahun");
        jumlah = rs.getString("Jumlah");
        String[] row = {kodeAlat, namaAlat, merkAlat, tahun, jumlah};
        model.addRow(row);
    }
    st.close();
    conn.close();
} catch (SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jBmunculdataActionPerformed

    private void jBcaridataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaridataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();

    // Kolom-kolom yang ingin ditampilkan di tabel
    model.addColumn("Kode Alat");
    model.addColumn("Nama Alat");
    model.addColumn("Merk Alat");
    model.addColumn("Tahun");
    model.addColumn("Jumlah");

    try {
        String searchTerm = jTFcaridata.getText(); // Ambil teks pencarian
        Connection conn = dbkoneksi.getConnection();
        Statement stmt = conn.createStatement();
        String query = "SELECT kode, nama, merk, tahun, jumlah FROM alat WHERE nama LIKE '%" + searchTerm + "%'";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            Object[] row = {
                    rs.getInt("kode"),
                    rs.getString("nama"),
                    rs.getString("merk"),
                    rs.getInt("tahun"),
                    rs.getInt("jumlah")
            };
            model.addRow(row);
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    jTabledataalat.setModel(model);
    }//GEN-LAST:event_jBcaridataActionPerformed

    private void jBkembalidataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBkembalidataActionPerformed
        // TODO add your handling code here:
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBkembalidataActionPerformed

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
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbataldata;
    private javax.swing.JButton jBcaridata;
    private javax.swing.JButton jBeditdata;
    private javax.swing.JButton jBhapusdata;
    private javax.swing.JButton jBkembalidata;
    private javax.swing.JButton jBmunculdata;
    private javax.swing.JButton jBsimpandata;
    private javax.swing.JLabel jLjumlah;
    private javax.swing.JLabel jLkodealat;
    private javax.swing.JLabel jLmerkalat;
    private javax.swing.JLabel jLnamaalat;
    private javax.swing.JLabel jLtahun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPdaftardata;
    private javax.swing.JPanel jPinputdata;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFcaridata;
    private javax.swing.JTextField jTFjumlah;
    private javax.swing.JTextField jTFkodealat;
    private javax.swing.JTextField jTFmerkalat;
    private javax.swing.JTextField jTFnamaalat;
    private javax.swing.JTextField jTFtahun;
    private javax.swing.JTable jTabledataalat;
    // End of variables declaration//GEN-END:variables
}
