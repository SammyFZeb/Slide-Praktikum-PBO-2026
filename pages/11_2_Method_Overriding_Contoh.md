---
layout: default
---

# Contoh Method Overriding (Studi Kasus Game)

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
  Mari kita terapkan pada class <code>Character</code>. Kita membuat method <code>serang()</code> di <i>parent class</i>, lalu melakukan <i>override</i> di <i>child class</i> (misalnya <code>Warrior</code>) agar serangannya spesifik.
  </p>

  <h3 class="text-base font-bold text-emerald-400 mt-6">Penjelasan & Output:</h3>
  <p>
  Saat kita memanggil method <code>serang()</code> dari objek <code>Warrior</code>, Java mengeksekusi implementasi milik <code>Warrior</code> (karena sudah ditimpa). Output yang dihasilkan:
  </p>

  <div class="p-3 bg-gray-800 rounded text-green-300 font-mono text-sm border border-gray-600">
  > Warrior menebas dengan pedang besar!
  </div>
</div>

<!-- Kolom Kode -->
<div class="text-[0.75rem] leading-tight">

```java
class Character {
    // Method dasar yang akan dioverride
    public void serang() {
        System.out.println("Karakter memukul biasa...");
    }
}

class Warrior extends Character {
    // Menimpa method serang() milik Character
    @Override
    public void serang() {
        System.out.println("Warrior menebas dengan pedang besar!");
    }
}
```

</div>

</div>
