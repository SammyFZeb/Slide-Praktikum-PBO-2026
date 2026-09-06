---
layout: default
---

# Contoh Method Overriding

<div class="text-left text-base leading-normal space-y-4">

<p>
Berikut adalah contoh penerapan overriding di mana class <code>Kucing</code> menimpa method <code>bersuara()</code> yang diwarisinya dari class <code>Hewan</code>.
</p>

```java
class Hewan {
    // Method yang akan dioverride
    public void bersuara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class Kucing extends Hewan {
    // Override method bersuara dari class Hewan
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
}
```

<h3 class="text-base font-bold text-emerald-400 mt-4">Penjelasan & Output:</h3>
<p>
Saat kita membuat objek dari class <code>Kucing</code> dan memanggil <code>bersuara()</code>, maka yang dieksekusi adalah implementasi yang ada di dalam class <code>Kucing</code>.Sehingga output yang akan dihasilkan di layar adalah: <code>Meong!</code>
</p>

</div>
