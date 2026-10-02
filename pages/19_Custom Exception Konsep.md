# Custom Exception

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<p>
Java memiliki banyak exception bawaan. Namun pada <strong>pengembangan tingkat lanjut</strong>, kita mungkin ingin membuat exception untuk kasus tertentu.
</p>

<div class="border-l-2 border-blue-500 pl-4">
<p class="font-semibold text-blue-400 mb-1">Contoh Kasus: REST API</p>
<p>Kita ingin membuat exception khusus yang berisi <strong>HTTP Status Code</strong> dan <strong>pesan error</strong>:</p>
<ul class="mt-2 space-y-1">
  <li>📭 Data tidak ditemukan</li>
  <li>🚫 Masukan tidak valid</li>
  <li>🔐 Akses tidak sah</li>
</ul>
</div>

<div class="border-l-2 border-emerald-500 pl-4">
<p class="font-semibold text-emerald-400 mb-1">Cara Implementasi</p>
<p>Cukup dengan melakukan <strong>inheritance</strong> dari class <code>RuntimeException</code>.</p>
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
