# Custom Exception

<div class="grid grid-cols-2 gap-8 mt-3 text-sm">

<div class="leading-relaxed space-y-4">

<p>Java memiliki banyak sekali exception bawaan. Namun pada <strong>pengembangan tingkat lanjut</strong>, kita mungkin ingin membuat exception untuk kasus tertentu.</p>

<div class="border-l-2 border-blue-500 pl-4">
<p class="font-semibold text-blue-400 mb-1">Contoh Kasus: REST API</p>
<p>Ketika mengembangkan REST API, kita ingin membuat exception khusus yang berisi <strong>HTTP Status Code</strong> dan <strong>pesan error</strong>:</p>
<ul class="mt-2 space-y-1">
  <li>📭 Data tidak ditemukan</li>
  <li>🚫 Masukan tidak valid</li>
  <li>🔐 Akses tidak sah</li>
</ul>
</div>

<div v-click class="border-l-2 border-emerald-500 pl-4">
<p class="font-semibold text-emerald-400 mb-1">Cara Implementasi</p>
<p>Cukup dengan melakukan <strong>inheritance</strong> dari class <code>RuntimeException</code>.</p>
</div>

</div>

<div v-click>

```java {all|1|2-3|5-10|12-15|all}
public class DataNotFoundException
        extends RuntimeException {

    private final int statusCode;

    public DataNotFoundException(String message) {
        super(message);       // kirim ke RuntimeException
        this.statusCode = 404;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

// Penggunaan:
// throw new DataNotFoundException("Data tidak ditemukan");
```

</div>

</div>
