---
layout: default
---

# Implementasi: Parent Class (Character)

<div class="text-left text-[0.8rem] leading-normal space-y-4 mt-4">

<p>
Pertama, kita definisikan class <code>Character</code> sebagai fondasi. Class ini berisi atribut dan method dasar yang merepresentasikan logika umum sebuah karakter.
</p>

```java
public class Character {
    protected String name;
    protected double healthPoint;
    protected double physicalAttack;
    protected double defense;

    // Method umum yang akan diwariskan ke seluruh child class
    public void attack(Character target, double distance) {
        if (distance > 1.5) {
            System.out.printf("%s terlalu jauh untuk diserang!\n", target.name);
            return;
        }

        double damage = Math.max(physicalAttack - target.defense, 0);
        target.healthPoint -= damage;
        System.out.printf("%s menerima kerusakan dasar sebesar %.0f\n", target.name, damage);
    }
}
```

</div>
