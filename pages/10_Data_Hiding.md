---
layout: default
---
# Data Hiding

<div class="text-left">

<p>
  <i>Data hiding</i> merujuk pada praktik menjaga detail internal objek secara tersembunyi dari dunia luar dan hanya memberi akses terhadap fitur dan perilaku penting saja. 
  Hal tersebut mencegah kode eksternal untuk memodifikasi state objek secara langsung yang dapat menyebabkan hal yang tak terduga atau korupsi data.
</p>

<p>
  Data hiding diimplementasikan lewat <b>encapsulation</b>. 
</p>


**Implementasi di Java**:
   - **Private Fields:** Variabel yang menyimpan *state* objek dideklarasikan sebagai `private` agar tidak dapat diakses langsung dari luar class.
   - **Public Getter and Setter Methods:** Metode ini memberikan akses terkontrol ke *private fields*. Getter mengambil nilai, sedangkan Setter memungkinkan modifikasinya.

</div>