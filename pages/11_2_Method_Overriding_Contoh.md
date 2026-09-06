---
layout: default
---

# Contoh Method Overriding (Studi Kasus Game)

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
