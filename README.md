# AplikasiKonversiSuhu
 Tugas 2-GHINA NAFSI-2210010324
# 1. Deskripsi Program
Aplikasi Konversi Suhu ini adalah sebuah program sederhana berbasis Java yang memungkinkan pengguna untuk memasukkan suhu dalam skala Celcius, kemudian mengonversinya ke skala suhu lain seperti Fahrenheit, Reamur, atau Kelvin. Aplikasi ini menggunakan JFrame sebagai antarmuka pengguna, memudahkan interaksi pengguna untuk input dan output hasil konversi. Program ini dikembangkan dan dijalankan melalui NetBeans IDE 8.2.

• Pengguna memasukkan nilai suhu dan memilih jenis konversi

• Hasil konversi ditampilkan setelah tombol ditekan.

# 2. Komponen GUI ke JFrame
- JPanel: Sebagai panel untuk menampung komponen-komponen lainnya.
- JLabel: Untuk judul, label input suhu konversi, dan label dari hasil konversi.
- JTextField: Untuk memasukkan nilai suhu.
- JComboBox: memilih skala suhu awal.
- JRadioButton: Untuk memilih skala suhu misalnya (Celcius ke skala lain, fahrenheit ke skala lain, reamur ke skala lain, kelvin ke skala lain
- JButton: Untuk memproses konversi suhu, tombol keluar dan hapus.
  
• combo box untuk memilih skala suhu tujuan.
Program ini memiliki metode konversi dari masing-masing skala suhu ke skala lainnya:
* celsius ke Fahrenheit, celsius ke Kelvin, celsius keReamur
* fahrenheit ke Celsius, fahrenheit ke Kelvin, fahrenheit ke Reamur
* kelvin ke Celsius, kelvin ke Fahrenheit, kelvin ke Reamur
* reamur ke Celsius, reamur ke Fahrenheit, reamur ke Kelvin

• Hasil konversi suhu yang nilai dimasukkan pada jTextField ditampilkan setelah tombol ditekan. Input suhu yang validasi otomatis untuk hanya menerima angka dan desimal.

# 3. Logika Program:
Rumus konversi, validasi input
   
# 4. Events

• ActionListener untuk tombol Konversi
~~~
   private void hitungKonversiActionPerformed(java.awt.event.ActionEvent evt) {                                               
                                              
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
   ~~~   
• Tombol hitung Konversi diklik akan menampilkan hasil konversi dari
~~~
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
~~~

5. Variasi:
• Tambahkan skala suhu lain seperti Reamur dan Kelvin
~~~
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
~~~
• Tambahkan ItemListener pada JRadioButton untuk memilih arah konversi
~~~
    private void rbFToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Fahrenheit ke Celsius");
            comboSKALA.addItem("Fahrenheit ke Kelvin");
            comboSKALA.addItem("Fahrenheit ke Reamur");
        }
    }                                               

    private void rbCToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                
       if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Celsius ke Fahrenheit");
            comboSKALA.addItem("Celsius ke Kelvin");
            comboSKALA.addItem("Celsius ke Reamur");
        }  
    }                                               

    private void rbRToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Kelvin ke Celsius");
            comboSKALA.addItem("Kelvin ke Fahrenheit");
            comboSKALA.addItem("Kelvin ke Reamur");
        }
    }                                               

    private void rbKToSkalaLainItemStateChanged(java.awt.event.ItemEvent evt) {                                                
       if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboSKALA.removeAllItems();
            comboSKALA.addItem("Reamur ke Celsius");
            comboSKALA.addItem("Reamur ke Fahrenheit");
            comboSKALA.addItem("Reamur ke Kelvin");
        }
    }     

 ~~~
• Implementasikan konversi otomatis saat nilai input berubah
~~~
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
 
~~~

<img width="407" alt="ss suhu" src="https://github.com/user-attachments/assets/a9b1ba7b-21fc-4447-b2b2-5f6419e64bb9">

## Indikator Penilaian:

| No  | Komponen         |  Persentase  |
| :-: | --------------   |   :-----:    |
|  1  | Komponen GUI     |    10    |
|  2  | Logika Program   |    20    |
|  3  | Kesesuaian UI    |    15    |
|  4  | Constructor      |    15    |
|  5  | Memenuhi Variasi |    40    |
|     | TOTAL        | 100 |

## Pembuat

NAMA : GHINA NAFSI
NPM : 2210010324
