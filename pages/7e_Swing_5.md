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
    class="w-72 max-h-14 object-contain rounded border border-gray-300 dark:border-gray-700"
  />
</div>

<h2 class="text-base font-bold text-orange-400 mb-1">10. Masukkan Kode Hitung Nilai</h2>
<p class="text-sm leading-snug mb-2">
  Masukkan kode berikut ke dalam method <code>btnHitungActionPerformed</code>:
</p>

<div class="text-xs leading-tight">

```java
try {
    String nama = txtNama.getText();
    if (nama.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
        return;
    }

    double nilaiTugas = Double.parseDouble(txtTugas.getText());
    double nilaiUts = Double.parseDouble(txtUts.getText());
    double nilaiUas = Double.parseDouble(txtUas.getText());
    double nilaiAkhir = nilaiTugas * 0.3 + nilaiUts * 0.3 + nilaiUas * 0.4;

    String grade;
    if (nilaiAkhir >= 80) grade = "A";
    else if (nilaiAkhir >= 70) grade = "B";
    else if (nilaiAkhir >= 60) grade = "C";
    else if (nilaiAkhir >= 50) grade = "D";
    else grade = "E";

    lblHasil.setText("<html>Mahasiswa: <b>" + nama + "</b> | Nilai Akhir: <b>"
            + nilaiAkhir + "</b> | Grade: <b>" + grade + "</b></html>");
} catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk nilai!");
}
```

</div>

</div>

<style>
pre {
  font-size: 10px !important;
  line-height: 1.2 !important;
}
</style>