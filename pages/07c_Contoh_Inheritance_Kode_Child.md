---
layout: default
---

# Implementasi: Child Class (Warrior, Mage, Archer)

<div class="grid grid-cols-2 gap-8 items-start mt-2">

<!-- Kolom Kiri -->
<div class="text-[0.75rem] leading-tight space-y-4">
  <p class="text-sm">Dengan keyword <code>extends</code>, class turunan secara otomatis memiliki atribut (seperti <code>name</code>, <code>healthPoint</code>) dan method <code>attack()</code> dari class Character.</p>

```java
public class Warrior extends Character {
    // Atribut tambahan khusus Warrior (jika ada)
    private double rage;
}
```

```java
public class Mage extends Character {
    // Atribut tambahan khusus Mage
    private double manaPoint;
}
```

</div>

<!-- Kolom Kanan -->
<div class="text-[0.75rem] leading-tight space-y-4 mt-16">

```java
public class Archer extends Character {
    // Atribut tambahan khusus Archer
    private double arrowCount;
}

// Saat dieksekusi di Main:
// Warrior w = new Warrior();
// w.attack(mageTarget, 1.0);
// -> otomatis memanggil method attack() dari parent!
```

</div>

</div>
