---
layout: default
---

# Overloading (constructor)

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <ul class="list-disc list-inside space-y-2">
    <li>Overloading sebuah constructor berarti membuat banyak konstruktor yang memiliki parameter yang berbeda-beda.</li>
  </ul>

</div>

<!-- Kolom Kode -->
<div class="text-[0.7rem] leading-tight">

```java
public class Hewan {
    private String nama;
    private int umur;

    // Default (tanpa parameter)
    public Hewan() {
        this.nama = "Anonim";
        this.umur = 0;
    }

    // Parameter nama
    public Hewan(String nama) {
        this.nama = nama;
        this.umur = 0;
    }

    // Parameter nama dan umur
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}
```

</div>

</div>
