# Implementasi Custom Exception

<div class="space-y-6 mt-8 text-sm leading-relaxed">

<p class="text-base">
Meskipun Java menyediakan beragam class exception bawaan, pada <strong>arsitektur perangkat lunak tingkat lanjut</strong>, pengembang sering kali perlu merancang hierarki exception yang berorientasi pada konteks domain spesifik (domain-specific exceptions).
</p>

<div class="border-l-4 border-blue-500 pl-5 space-y-3">
<p class="font-bold text-blue-400 text-base">Studi Kasus: Pengembangan REST API</p>
<p>Dalam pengembangan antarmuka pemrograman aplikasi (API), entitas exception khusus sangat berguna untuk menyertakan <strong>Kode Status HTTP</strong> dan <strong>pesan respons</strong> terstruktur:</p>
<ul class="space-y-2 mt-2 list-disc list-inside text-gray-300">
  <li>Entitas sumber daya tidak ditemukan</li>
  <li>Kegagalan validasi atas masukan klien</li>
  <li>Penolakan akses akibat kurangnya otorisasi</li>
</ul>
</div>

<div class="border-l-4 border-emerald-500 pl-5 space-y-3">
<p class="font-bold text-emerald-400 text-base">Metode Implementasi</p>
<p>Pembuatan class exception kustom dilakukan dengan mengimplementasikan konsep pewarisan (<strong>inheritance</strong>) dari hirarki <code>RuntimeException</code> (untuk unchecked) atau <code>Exception</code> (untuk checked).</p>
</div>

</div>

---

# Struktur Kode Custom Exception

<p class="text-sm text-gray-300 mb-6 mt-4">Contoh pembuatan exception spesifik untuk menangani kasus entitas data tidak ditemukan pada aplikasi.</p>

<div class="mt-4 w-full">

```java
// Melakukan pewarisan dari basis RuntimeException
public class DataNotFoundException extends RuntimeException {

    private final int statusCode;

    // Konstruktor menerima pesan error dan menetapkan kode status
    public DataNotFoundException(String message) {
        super(message);
        this.statusCode = 404; // Mengatur HTTP Status Code untuk kondisi Not Found
    }

    public int getStatusCode() {
        return statusCode;
    }
}
```

</div>
