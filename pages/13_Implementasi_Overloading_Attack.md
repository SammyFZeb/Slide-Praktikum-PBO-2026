---
layout: default
---

# Implementasi method overloading pada attack()

<!-- Kolom Kode -->
<div class="text-xs">
<h4>Implementasi awal</h4>

```java
@Override
  public void attack(Character target, double distance) {
    // Logika damage normal...
  }
```

<h4>Implementasi overloading</h4>

```java
public void attack(Character target, double distance, boolean isPowerStrike) {
  if (!isPowerStrike) {
    this.attack(target, distance);
    return;
  }

  if (distance < minRange || distance > maxRange) {
    System.out.printf("%s terlalu jauh untuk diserang!\n", target.name);
    return;
  }

  double damage = Math.max((physicalAttack * 1.5) - target.defense, 0);
  target.takeDamage(damage);
  System.out.printf("%s menerima kerusakan skill fisik sebesar %.0f\n", target.name, damage);
}
```

</div>
