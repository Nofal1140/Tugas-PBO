/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import databases.koneksi; 
import java.sql.PreparedStatement; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class framePenduduk extends javax.swing.JFrame {
    
     public koneksi objekku;
    public DefaultTableModel modelku;

    /**
     * Creates new form framePenduduk
     */
    public framePenduduk() {
        initComponents();
         this.setLocationRelativeTo(null); 
        objekku = new koneksi(); 
        modelku = new DefaultTableModel();
        jtablependuduk.setModel(modelku);
        modelku.addColumn("No KK");
        modelku.addColumn("NIK");
        modelku.addColumn("Nama");
        modelku.addColumn("Tanggal Lahir");
        modelku.addColumn("Tempat Lahir");
        modelku.addColumn("Jenis Kelamin");
        modelku.addColumn("Golongan Darah");
        modelku.addColumn("Agama");
        modelku.addColumn("Pendidikan");
        modelku.addColumn("Kerja");
        modelku.addColumn("Status");
        
        loadtablependuduk();
    }
    
    public void loadtablependuduk(){
        try{
             modelku.getDataVector().removeAllElements();
        modelku.fireTableDataChanged();
        
        String sql ="select * from data_penduduk order by NoKK asc";
        PreparedStatement query = objekku.konek.prepareStatement(sql);
        ResultSet datanya = query.executeQuery();
        while (datanya.next()){
            Object[] baris = new Object[11];
            baris[0]= datanya.getString("NoKK");
            baris[1]= datanya.getString("NIK");
            baris[2]= datanya.getString("Nama");
            baris[3]= datanya.getString("TglLahir");
            baris[4]= datanya.getString("TptLahir");
            baris[5]= datanya.getString("JK");
            baris[6]= datanya.getString("GolDarah");
            baris[7]= datanya.getString("Agama");
            baris[8]= datanya.getString("Pendidikan");
            baris[9]= datanya.getString("Kerja");
            baris[10]= datanya.getString("Status");
            
            modelku.addRow(baris); 
        }
        datanya.close();
        query.close();
    }catch (Exception e) {
         JOptionPane.showMessageDialog(this, e.toString());
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

        jLabel6 = new javax.swing.JLabel();
        txtkk = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txttl = new javax.swing.JTextField();
        txttmpl = new javax.swing.JTextField();
        txtjk = new javax.swing.JTextField();
        txtgol = new javax.swing.JTextField();
        txtagm = new javax.swing.JTextField();
        txtpen = new javax.swing.JTextField();
        txtkerja = new javax.swing.JTextField();
        txtstts = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablependuduk = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        btnrpt = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No KK");

        jLabel2.setText("NIK");

        jLabel3.setText("Nama");

        jLabel4.setText("Tanggal Lahir");

        jLabel5.setText("Tempat Lahir");

        jLabel7.setText("Jenis Kelamin");

        jLabel8.setText("Golongan Darah");

        jLabel9.setText("Agama");

        jLabel10.setText("Pendidikan");

        jLabel11.setText("Kerja");

        jLabel12.setText("Status");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jtablependuduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtablependuduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablependudukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablependuduk);

        jLabel13.setText("Cari");

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        btnrpt.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(txtagm, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel12))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtkk)
                                                        .addComponent(txtnik)
                                                        .addComponent(txtpen)
                                                        .addComponent(txtkerja)
                                                        .addComponent(txtstts, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                                                    .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txttl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txttmpl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtjk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtgol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(33, 33, 33)
                                .addComponent(btnEdit)
                                .addGap(41, 41, 41)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btnrpt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttmpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtagm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnrpt))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
                try {
            String sql = "update data_penduduk set Nama = ?, GolDaah = ?, Pendidikan =? where NoKK = ?";
            PreparedStatement ubah = objekku.konek.prepareStatement(sql);
            ubah.setString(1, txtnama.getText());
            ubah.setString(2, txtgol.getText());
            ubah.setString(3, txtpen.getText());
            ubah.executeUpdate();
            loadtablependuduk();
            JOptionPane.showMessageDialog(this, "Data Berhasil di Ubah");
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "delete from data_penduduk where NoKK=?";
            PreparedStatement hapus = objekku.konek.prepareStatement(sql);
            hapus.setString(1, txtkk.getText());
            hapus.executeUpdate();
            
          loadtablependuduk();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            
            txtkk.setText(null);
            txtnama.setText(null);
            txttl.setText(null);
            txttmpl.setText(null);
            txtgol.setText(null);
            txtpen.setText(null);
            txtagm.setText(null);
            txtjk.setText(null);
            txtstts.setText(null);
            txtkerja.setText(null);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    
    
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
                try {
            if(txtkk.getText().isEmpty()){             
                JOptionPane.showMessageDialog(this, "No KK Belum di Isi");
                txtkk.requestFocus();
                
            }else if(txtnik.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "NIK Belum di Isi");
                txtnik.requestFocus();
                
            }else if(txtnama.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nama Belum di Isi");
                txtnama.requestFocus();
                   
            }else if(txttl.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Tanggal Lahir Belum di Isi");
                txttl.requestFocus();
            }else if(txttmpl.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Tempat Lahir Belum di Isi");
                txttmpl.requestFocus();
                }else if(txtjk.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Jenis Kelamin Belum di Isi");
                txtjk.requestFocus();
                }else if(txtgol.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Golongan Darah Belum di Isi");
                txtgol.requestFocus();
                }else if(txtagm.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Agama Belum di Isi");
                txtagm.requestFocus();
                }else if(txtpen.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Pendidikan Belum di Isi");
                txtpen.requestFocus();
                }else if(txtstts.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Status Belum di Isi");
                txtstts.requestFocus();
                }else{
            
                String sqlsimpan = "insert into data_penduduk(NoKK,NIK,Nama,TglLahit,TptLahir,JK,GolDarah,Agama,Pendidikan,Status) value(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement simpan = objekku.konek.prepareStatement(sqlsimpan);
                simpan.setString(1, txtkk.getText());
                simpan.setString(2, txtnik.getText());
                simpan.setString(3, txttl.getText());
                simpan.setString(4, txttmpl.getText());
                 simpan.setString(5, txttmpl.getText());
                  simpan.setString(6, txtjk.getText());
                   simpan.setString(7, txtgol.getText());
                    simpan.setString(8, txtagm.getText());
                     simpan.setString(9, txtpen.getText());
                      simpan.setString(10, txtkerja.getText());
                       simpan.setString(11, txtstts.getText());
                simpan.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil di Simpan");
            }
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }          
        
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jtablependudukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablependudukMouseClicked
        // TODO add your handling code here:
        int i= jtablependuduk.getSelectedRow();
        String NoKK = jtablependuduk.getValueAt(i, 0).toString();
        String NIK = jtablependuduk.getValueAt(i, 1).toString();
        String Nama = jtablependuduk.getValueAt(i, 2).toString();
        String TglLahir = jtablependuduk.getValueAt(i, 3).toString();
        String TptLahir = jtablependuduk.getValueAt(i, 4).toString();
         String JK = jtablependuduk.getValueAt(i, 5).toString();
         String GolDarah = jtablependuduk.getValueAt(i, 6).toString();
         String Agama = jtablependuduk.getValueAt(i, 7).toString();
         String Pendidikan = jtablependuduk.getValueAt(i, 8).toString();
        String Kerja = jtablependuduk.getValueAt(i, 9).toString();
         String Status = jtablependuduk.getValueAt(i, 10).toString();
        
        txtkk.setText(NoKK);
        txtnik.setText(NIK);
        txtnama.setText(Nama);
        txttl.setText(TglLahir);
        txttmpl.setText(TptLahir);
        txtjk.setText(JK);
        txtgol.setText(GolDarah);
        txtagm.setText(Agama);
        txtpen.setText(Pendidikan);
        txtkerja.setText(Kerja);
        txtstts.setText(Status);
        
    
    }//GEN-LAST:event_jtablependudukMouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
        try {
            modelku.getDataVector().removeAllElements();
            modelku.fireTableDataChanged();

            String sqlcari = "select * from data_keluarga where npm like '%"+txtcari.getText()+"%' or"
            + "Alamat like '%"+txtcari.getText()+"%' or RT like '%"+txtcari.getText()+"%'";
            ResultSet cari = objekku.konek.createStatement().executeQuery(sqlcari);

            while(cari.next()) {
                Object[] baris = new Object[3];
                baris[0] = cari.getString("NoKK");
                baris[1] = cari.getString("Alamat");
                baris[2] = cari.getString("RT");
                modelku.addRow(baris);
            }
        } catch (Exception e){

        }

    }//GEN-LAST:event_txtcariKeyPressed
    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) { 
       try {
            if(txtkk.getText().isEmpty()){             
                JOptionPane.showMessageDialog(this, "No KK Belum di Isi");
                txtkk.requestFocus();
                
            }else if(txtnik.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "NIK Belum di Isi");
                txtnik.requestFocus();
                
            }else if(txtnama.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nama Belum di Isi");
                txtnama.requestFocus();
                   
            }else if(txttl.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Tanggal Lahir Belum di Isi");
                txttl.requestFocus();
            }else if(txttmpl.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Tempat Lahir Belum di Isi");
                txttmpl.requestFocus();
                }else if(txtjk.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Jenis Kelamin Belum di Isi");
                txtjk.requestFocus();
                }else if(txtgol.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Golongan Darah Belum di Isi");
                txtgol.requestFocus();
                }else if(txtagm.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Agama Belum di Isi");
                txtagm.requestFocus();
                }else if(txtpen.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Pendidikan Belum di Isi");
                txtpen.requestFocus();
                }else if(txtstts.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Status Belum di Isi");
                txtstts.requestFocus();
                }else{
            
                String sqlsimpan = "insert into data_penduduk(NoKK,NIK,Nama,TglLahit,TptLahir,JK,GolDarah,Agama,Pendidikan,Status) value(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement simpan = objekku.konek.prepareStatement(sqlsimpan);
                simpan.setString(1, txtkk.getText());
                simpan.setString(2, txtnik.getText());
                simpan.setString(3, txttl.getText());
                simpan.setString(4, txttmpl.getText());
                 simpan.setString(5, txttmpl.getText());
                  simpan.setString(6, txtjk.getText());
                   simpan.setString(7, txtgol.getText());
                    simpan.setString(8, txtagm.getText());
                     simpan.setString(9, txtpen.getText());
                      simpan.setString(10, txtkerja.getText());
                       simpan.setString(11, txtstts.getText());
                simpan.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil di Simpan");
            }
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }          
    }
    private void UBAHActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
       try {
            String sql = "update data_penduduk set Nama = ?, GolDarah = ? where NoKK = ?";
            PreparedStatement ubah = objekku.konek.prepareStatement(sql);
            ubah.setString(1, txtnama.getText());
            ubah.setString(2, txtgol.getText());
            ubah.setString(3, txtkk.getText());
            ubah.executeUpdate();
             loadtablependuduk();
            JOptionPane.showMessageDialog(this, "Data Berhasil di Ubah");
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
     private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) { 
            // TODO add your handling code here:
     }
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
            java.util.logging.Logger.getLogger(framePenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePenduduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnrpt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablependuduk;
    private javax.swing.JTextField txtagm;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtgol;
    private javax.swing.JTextField txtjk;
    private javax.swing.JTextField txtkerja;
    private javax.swing.JTextField txtkk;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtpen;
    private javax.swing.JTextField txtstts;
    private javax.swing.JTextField txttl;
    private javax.swing.JTextField txttmpl;
    // End of variables declaration//GEN-END:variables
}
