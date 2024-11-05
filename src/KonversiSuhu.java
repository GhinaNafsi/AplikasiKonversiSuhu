import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;




public class KonversiSuhu extends javax.swing.JFrame {
    
     public KonversiSuhu() {
        initComponents();
        setupDocumentListener();
    }
    
      private void setupDocumentListener() {
    suhuKonversiInput.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            btnKonversiActionPerformed();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            btnKonversiActionPerformed();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            btnKonversiActionPerformed();
        }        

        private void btnKonversiActionPerformed() {
            // Tambahkan logika konversi suhu di sini
        }
    });
}
 
     
    
  // Dari Celsius ke skala lain
// Dari Celsius ke skala lain
private double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}

private double celsiusToReamur(double celsius) {
    return celsius * 4/5;
}

private double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
}
// Dari Fahrenheit ke skala lain
private double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}

private double fahrenheitToReamur(double fahrenheit) {
    return (fahrenheit - 32) * 4/9;
}

private double fahrenheitToKelvin(double fahrenheit) {
    return (fahrenheit - 32) * 5/9 + 273.15;
} 

// Dari Kelvin
private double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
}

private double kelvinToFahrenheit(double kelvin) {
    return (kelvin - 273.15) * 9/5 + 32;
}

private double kelvinToReamur(double kelvin) {
    return (kelvin - 273.15) * 4/5;
}
    
// Dari Reamur
private double reamurToCelsius(double reamur) {
    return reamur * 5/4;
}

private double reamurToFahrenheit(double reamur) {
    return reamur * 9/4 + 32;
}

private double reamurToKelvin(double reamur) {
    return reamur * 5/4 + 273.15;
}
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        bgKonversi = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblMasukkanSuhu = new javax.swing.JLabel();
        lblPilihKonversi = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        suhuKonversiInput = new javax.swing.JTextField();
        comboSKALA = new javax.swing.JComboBox<>();
        rbCToSkalaLain = new javax.swing.JRadioButton();
        rbFToSkalaLain = new javax.swing.JRadioButton();
        hitungKonversi = new javax.swing.JButton();
        rbRToSkalaLain = new javax.swing.JRadioButton();
        rbKToSkalaLain = new javax.swing.JRadioButton();
        hapusKonversi = new javax.swing.JButton();
        exitKonversi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 136, 188));

        lblMasukkanSuhu.setText("Masukkan Suhu");

        lblPilihKonversi.setText("Suhu Skala");

        lblHasil.setText("Hasil");

        suhuKonversiInput.setBackground(new java.awt.Color(255, 255, 204));
        suhuKonversiInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                suhuKonversiInputFocusGained(evt);
            }
        });
        suhuKonversiInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                suhuKonversiInputKeyTyped(evt);
            }
        });

        rbCToSkalaLain.setBackground(new java.awt.Color(255, 255, 204));
        bgKonversi.add(rbCToSkalaLain);
        rbCToSkalaLain.setText("Celcius To Skala Lain");
        rbCToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbCToSkalaLainItemStateChanged(evt);
            }
        });

        rbFToSkalaLain.setBackground(new java.awt.Color(255, 255, 204));
        bgKonversi.add(rbFToSkalaLain);
        rbFToSkalaLain.setText("Fahrenheit To Skala Lain");
        rbFToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbFToSkalaLainItemStateChanged(evt);
            }
        });

        hitungKonversi.setBackground(new java.awt.Color(255, 255, 133));
        hitungKonversi.setText("Hitung");
        hitungKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungKonversiActionPerformed(evt);
            }
        });

        rbRToSkalaLain.setBackground(new java.awt.Color(255, 255, 204));
        bgKonversi.add(rbRToSkalaLain);
        rbRToSkalaLain.setText("Reamur To Skala Lain");
        rbRToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbRToSkalaLainItemStateChanged(evt);
            }
        });

        rbKToSkalaLain.setBackground(new java.awt.Color(255, 255, 204));
        bgKonversi.add(rbKToSkalaLain);
        rbKToSkalaLain.setText("Kelvin To Skala Lain");
        rbKToSkalaLain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbKToSkalaLainItemStateChanged(evt);
            }
        });

        hapusKonversi.setBackground(new java.awt.Color(255, 255, 133));
        hapusKonversi.setText("Hapus");
        hapusKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusKonversiActionPerformed(evt);
            }
        });

        exitKonversi.setBackground(new java.awt.Color(255, 255, 133));
        exitKonversi.setText("Exit");
        exitKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitKonversiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMasukkanSuhu)
                            .addComponent(lblPilihKonversi))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboSKALA, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hitungKonversi))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(suhuKonversiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbRToSkalaLain)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(rbCToSkalaLain)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbKToSkalaLain)
                            .addComponent(rbFToSkalaLain))))
                .addGap(199, 199, 199))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblHasil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(hapusKonversi)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(exitKonversi)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(exitKonversi)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMasukkanSuhu)
                    .addComponent(suhuKonversiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(hapusKonversi)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPilihKonversi)
                    .addComponent(comboSKALA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitungKonversi))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCToSkalaLain)
                    .addComponent(rbFToSkalaLain))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRToSkalaLain)
                    .addComponent(rbKToSkalaLain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(lblHasil)
                .addGap(168, 168, 168))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(245, 104, 155));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 123, 185));
        jLabel1.setText("KONVERSI SUHU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungKonversiActionPerformed
                                              
     try {
        
            double inputSuhu = Double.parseDouble(suhuKonversiInput.getText());
            String hasilKonversi = (String) comboSKALA.getSelectedItem();
            double hasil = 0.0;

        // Periksa arah konversi berdasarkan pilihan JRadioButton
        if (rbCToSkalaLain.isSelected()) {
            // Konversi dari Celsius ke skala yang dipilih
            switch (hasilKonversi) {
                case "Celsius ke Fahrenheit":
                    hasil = celsiusToFahrenheit(inputSuhu);
                    break;
                case "Celsius ke Kelvin":
                    hasil = celsiusToKelvin(inputSuhu);
                    break;
                case "Celsius ke Reamur":
                    hasil = celsiusToReamur(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;
                    
            }
        } else if (rbFToSkalaLain.isSelected()) {
            // Konversi dari Fahrenheit ke skala yang dipilih
            switch (hasilKonversi) {
                case "Fahrenheit ke Celsius":
                    hasil = fahrenheitToCelsius(inputSuhu);
                    break;
                case "Fahrenheit ke Kelvin":
                    hasil = fahrenheitToKelvin(inputSuhu);
                    break;
                case "Fahrenheit ke Reamur":
                    hasil = fahrenheitToReamur(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;    
            }
        } else if (rbRToSkalaLain.isSelected()) {
            switch (hasilKonversi) {
                case "Kelvin ke Celsius":
                    hasil = kelvinToCelsius(inputSuhu);
                    break;
                case "Kelvin ke Fahrenheit":
                    hasil = kelvinToFahrenheit(inputSuhu);
                    break;
                case "Kelvin ke Reamur":
                    hasil = kelvinToReamur(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;
            }
        } else if (rbKToSkalaLain.isSelected()) {
            switch (hasilKonversi) {
                case "Reamur ke Celsius":
                    hasil = reamurToCelsius(inputSuhu);
                    break;
                case "Reamur ke Fahrenheit":
                    hasil = reamurToFahrenheit(inputSuhu);
                    break;
                case "Reamur ke Kelvin":
                    hasil = reamurToKelvin(inputSuhu);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                    break;
                }
            }

         lblHasil.setText("" + hasil);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    }                                           
    
    
    

private void konversiSuhu() {
    String inputText = suhuKonversiInput.getText(); // Mengambil nilai input dari JTextField
    
    try {
        double suhuInput = Double.parseDouble(inputText); // Mengonversi input ke double
        double hasil = 0.0;
        String satuan = "";

        // Logika konversi berdasarkan pilihan JRadioButton
        if (rbCToSkalaLain.isSelected()) {
            hasil = (suhuInput * 9/5) + 32;
            satuan = "°F";
        } else if (rbFToSkalaLain.isSelected()) {
            hasil = (suhuInput - 32) * 5/9;
            satuan = "°C";
        } else {
            JOptionPane.showMessageDialog(this, "Pilih konversi yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        lblHasil.setText("Hasil: " + hasil + " " + satuan);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input tidak valid! Masukkan nilai angka.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_hitungKonversiActionPerformed

    private void exitKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitKonversiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitKonversiActionPerformed

    private void hapusKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusKonversiActionPerformed
        hapusKonversi.addActionListener((ActionEvent e) -> {
        // Mengosongkan JTextField untuk input suhu
        suhuKonversiInput.setText("");
        
        // Reset JComboBox ke item pertama (misalnya, Celsius)
        comboSKALA.setSelectedIndex(0);
        
        // Kosongkan JLabel hasil
        lblHasil.setText(" ");
        
        // Reset pilihan JRadioButton ke kondisi default (misalnya, Celsius ke Fahrenheit)
        rbCToSkalaLain.setSelected(true); // Set ulang ke Celsius ke Fahrenheit
    });

    }//GEN-LAST:event_hapusKonversiActionPerformed

                                             
 
    
    private void suhuKonversiInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_suhuKonversiInputFocusGained
          suhuKonversiInput.setText("");
    }//GEN-LAST:event_suhuKonversiInputFocusGained

    private void suhuKonversiInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suhuKonversiInputKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
    }//GEN-LAST:event_suhuKonversiInputKeyTyped
    }
    private void rbFToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbFToSkalaLainItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Fahrenheit ke Celsius");
            comboSKALA.addItem("Fahrenheit ke Kelvin");
            comboSKALA.addItem("Fahrenheit ke Reamur");
        }
    }//GEN-LAST:event_rbFToSkalaLainItemStateChanged

    private void rbCToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbCToSkalaLainItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Celsius ke Fahrenheit");
            comboSKALA.addItem("Celsius ke Kelvin");
            comboSKALA.addItem("Celsius ke Reamur");
        }  
    }//GEN-LAST:event_rbCToSkalaLainItemStateChanged

    private void rbRToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbRToSkalaLainItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Kelvin ke Celsius");
            comboSKALA.addItem("Kelvin ke Fahrenheit");
            comboSKALA.addItem("Kelvin ke Reamur");
        }
    }//GEN-LAST:event_rbRToSkalaLainItemStateChanged

    private void rbKToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbKToSkalaLainItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Reamur ke Celsius");
            comboSKALA.addItem("Reamur ke Fahrenheit");
            comboSKALA.addItem("Reamur ke Kelvin");
        }
    }//GEN-LAST:event_rbKToSkalaLainItemStateChanged
    
    
    
    
    
    

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgKonversi;
    private javax.swing.JComboBox<String> comboSKALA;
    private javax.swing.JButton exitKonversi;
    private javax.swing.JButton hapusKonversi;
    private javax.swing.JButton hitungKonversi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblMasukkanSuhu;
    private javax.swing.JLabel lblPilihKonversi;
    private javax.swing.JRadioButton rbCToSkalaLain;
    private javax.swing.JRadioButton rbFToSkalaLain;
    private javax.swing.JRadioButton rbKToSkalaLain;
    private javax.swing.JRadioButton rbRToSkalaLain;
    private javax.swing.JTextField suhuKonversiInput;
    // End of variables declaration//GEN-END:variables
}
