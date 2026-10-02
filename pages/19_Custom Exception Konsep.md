# Implementasi Custom Exception

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<p>
Meskipun Java menyediakan beragam class exception bawaan, pada <strong>arsitektur perangkat lunak tingkat lanjut</strong>, pengembang sering kali perlu merancang hierarki exception yang berorientasi pada konteks domain spesifik (domain-specific exceptions).
</p>

<div class="border-l-2 border-blue-500 pl-4">
<p class="font-semibold text-blue-400 mb-1">Studi Kasus: Layanan REST API</p>
<p>Dalam pengembangan antarmuka pemrograman aplikasi (API), entitas exception khusus sangat berguna untuk menyertakan <strong>Kode Status HTTP</strong> dan <strong>pesan respons</strong> terstruktur:</p>
<ul class="mt-2 space-y-1 list-disc list-inside text-gray-300">
  <li>Entitas sumber daya tidak ditemukan</li>
  <li>Kegagalan validasi atas masukan klien</li>
  <li>Penolakan akses akibat kurangnya otorisasi</li>
</ul>
</div>

<div class="border-l-2 border-emerald-500 pl-4">
<p class="font-semibold text-emerald-400 mb-1">Metode Implementasi</p>
<p>Pembuatan class exception kustom dilakukan dengan mengimplementasikan konsep pewarisan (<strong>inheritance</strong>) dari hirarki <code>RuntimeException</code> (untuk unchecked) atau <code>Exception</code> (untuk checked).</p>
</div>

</div>

<div>

```java
public class DataNotFoundException
        extends RuntimeException {

    private final int statusCode;

    public DataNotFoundException(String message) {
        super(message);
        this.statusCode = 404;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
```

</div>

</div>
