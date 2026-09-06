---
layout: default
---

# Contoh Method Overriding (Studi Kasus Game)

<div class="grid grid-cols-[40%_55%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-sm leading-normal space-y-4">
  <p>
  Class <code>Warrior</code> perlu menimpa (<i>override</i>) method <code>attack()</code> milik <code>Character</code> agar perhitungan jarak dan serangannya lebih spesifik untuk tipe jarak dekat.
  </p>

  <h3 class="text-sm font-bold text-emerald-400 mt-6">Penjelasan & Output:</h3>
  <p>
  Saat kita memanggil <code>attack()</code> dari objek <code>Warrior</code>, Java mengeksekusi implementasi milik <code>Warrior</code>. Output-nya akan mencetak "kerusakan fisik" alih-alih "kerusakan dasar":
  </p>

  <div class="p-2 bg-gray-800 rounded text-green-300 font-mono text-xs border border-gray-600 mt-2">
  > Mondan menerima kerusakan fisik sebesar 15
  </div>
</div>

<!-- Kolom Kode -->
<div class="text-[0.65rem] leading-tight">

```java
// --- Di class Character ---
public void attack(Character target, double distance) {
    // Logika serangan dasar karakter
}

// --- Di class Warrior ---
@Override
public void attack(Character target, double distance) {
    // Logika khusus Warrior: jarak serang harus pendek
    if (distance < minRange || distance > maxRange) {
        System.out.printf("%s terlalu jauh untuk diserang!\n", target.name);
        return;
    }

    double damage = Math.max(physicalAttack - target.defense, 0);
    target.takeDamage(damage);
    System.out.printf("%s menerima kerusakan fisik sebesar %.0f\n", 
                       target.name, damage);
}
```

</div>

</div>
