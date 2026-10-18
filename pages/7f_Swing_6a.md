---
layout: default
---

# Implementasi Swing

<div class="grid grid-cols-2 gap-8 mt-6">

<!-- Kolom 1 (Kiri) -->
<div class="flex flex-col space-y-4">
    <!-- Teks Instruksi -->
    <div class="text-[0.9rem] leading-normal">
        <h3 class="text-base font-bold text-orange-400 mb-2">11. Masukkan kode Reset</h3>
        Double-click tombol <b>Reset</b> pada mode <i>Design</i> dan masukkan kode berikut ke blok method <b>btnResetActionPerformed</b>:
    </div>
    <!-- Placeholder Kode -->
<div class="flex justify-center flex-grow">
        
```java
fieldNama.setText("");
fieldTugas.setText("");
fieldUts.setText("");
fieldUas.setText("");
txtAreaHasil.setText(""); 
fieldNama.requestFocus();
```
  
</div>
</div>

<!-- Kolom 2 (Kanan) -->
<div class="flex flex-col space-y-4">
    <!-- Teks Instruksi -->
    <div class="text-[0.9rem] leading-normal">
        <h3 class="text-base font-bold text-orange-400 mb-2">12. Modifikasi File Main</h3>
        Modifikasi isi dari fungsi main pada file yang sama dengan nama project<b>(Misal SistemNilaiMahasiswa.java)</b> dengan kode berikut
    </div>
<div class="code-scroll max-h-[40vh] max-w-full min-w-0 overflow-x-auto">

```java
public class SistemNilaiMahasiswa {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new MahasiswaFrame().setVisible(true));
    }
}
```
  
</div>
</div>

</div>