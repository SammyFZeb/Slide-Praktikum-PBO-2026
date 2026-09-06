---
layout: default
---

# Contoh this & super

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
    Berikut adalah implementasi penggunaan keyword <code>this</code> dan <code>super</code> dalam Java:
  </p>
  <ul class="list-disc list-inside space-y-2">
    <li><code>super(nama)</code> memanggil konstruktor milik <i>parent class</i> (<code>Hewan</code>).</li>
    <li><code>this.warnaBulu</code> merujuk pada atribut milik objek <code>Kucing</code> itu sendiri.</li>
    <li><code>super.nama</code> mengakses atribut dari class induk jika diperlukan secara eksplisit.</li>
  </ul>
</div>

<!-- Kolom Kode -->
<div class="text-xs leading-tight">

```java
class Hewan {
    protected String nama;

    public Hewan(String nama) {
        // 'this' merujuk ke atribut class ini
        this.nama = nama; 
    }
}

class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing(String nama, String warnaBulu) {
        // 'super' memanggil constructor parent (Hewan)
        super(nama); 
        this.warnaBulu = warnaBulu;
    }
    
    public void info() {
        System.out.println("Nama: " + super.nama);
        System.out.println("Warna: " + this.warnaBulu);
    }
}
```

</div>

</div>
