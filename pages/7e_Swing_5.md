---
layout: default
---

# Implementasi Swing

<div class="mt-2">

<div class="grid grid-cols-[1fr_auto] items-center gap-5 mb-3">
  <div class="text-sm leading-snug">
    <h2 class="text-base font-bold text-orange-400 mb-1">9. Event Handler Tombol Hitung</h2>
    Double-click tombol <b>Hitung Nilai</b> pada mode <i>Design</i>. NetBeans akan membuka method <code>btnHitungActionPerformed</code> pada mode <i>Source</i>.
  </div>

  <img
    src="../asset/9_double_click.png"
    alt="Method event handler tombol Hitung Nilai di NetBeans"
    class="w-[28rem] max-h-[24vh] object-contain rounded border border-gray-300 dark:border-gray-700"
  />
</div>

<h2 class="text-base font-bold text-orange-400 mb-1">10. Masukkan Kode Hitung Nilai</h2>
<p class="text-sm leading-snug mb-2">
  Masukkan kode berikut ke dalam method <code>btnHitungActionPerformed</code>:
</p>

<div class="code-scroll text-[10] leading-tight">

```java
try {
    String nama = fieldNama.getText();
    if (nama.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
        fieldNama.requestFocus();
        return;
    }

    double nilaiTugas = Double.parseDouble(fieldTugas.getText());
    double nilaiUts = Double.parseDouble(fieldUts.getText());
    double nilaiUas = Double.parseDouble(fieldUas.getText());

    double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.4);

    String grade;
    if (nilaiAkhir >= 80) {
        grade = "A";
    } else if (nilaiAkhir >= 70) {
        grade = "B";
    } else if (nilaiAkhir >= 60) {
        grade = "C";
    } else if (nilaiAkhir >= 50) {
        grade = "D";
    } else {
        grade = "E";
    }
    
    String hasilOutput = "=========================\n"
            + "    HASIL PERHITUNGAN    \n"
            + "=========================\n"
            + "Nama Mahasiswa : " + nama + "\n"
            + "Nilai Akhir    : " + String.format("%.2f", nilaiAkhir) + "\n"
            + "Grade          : " + grade + "\n"
            + "=========================";

    txtAreaHasil.setText(hasilOutput);

} catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Input nilai harus berupa angka!",
            "Validasi Error",
            javax.swing.JOptionPane.ERROR_MESSAGE);
}
```

</div>

</div>

<style>
.code-scroll {
  width: 100%;
  max-width: 100%;
  min-width: 0;
  overflow-x: auto;
}

.code-scroll pre {
  box-sizing: border-box;
  max-width: 100%;
  font-size: 10px !important;
  line-height: 1.2 !important;
  max-height: 28vh;
  overflow: auto;
  white-space: pre;
}
</style>