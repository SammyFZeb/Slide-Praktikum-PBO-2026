---
layout: default
---

# Implementasi method overloading pada attack()

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-[0.8rem] leading-normal space-y-4">
  <p>
    Karakter pada sebuah game mungkin memiliki kemampuan serangan yang berbeda-beda. Jika kita ingin memperluas kemampuannya, kita punya dua opsi: menambah method baru yang berbeda, atau mengimplementasikan <i>method overloading</i>.
  </p>
  <p>
    Sebagai contoh pada class <code>Warrior</code>, alih-alih menulis method baru yang membingungkan, kita dapat menggunakan <i>method overloading</i>. Jika ada kondisi serangan spesial (misal <i>Power Strike</i>), logikanya akan diproses khusus, namun jika tidak, serangan dilempar kembali ke method <code>attack</code> biasa yang tujuannya sama.
  </p>
</div>

<!-- Kolom Kode -->
<div class="text-[0.6rem] leading-tight max-h-[320px] overflow-y-auto pr-2" style="scrollbar-width: thin; scrollbar-color: #4b5563 transparent;">

```java
public class Warrior extends Character {
    
    // 1. Method attack yang dioverride dari parent
    @Override
    public void attack(Character target, double distance) {
        // Logika damage normal...
    }

    // 2. Overloading method attack dengan tambahan argumen isPowerStrike
    public void attack(Character target, double distance, boolean isPowerStrike) {
        // Jika bukan power strike, alihkan ke attack() biasa
        if (!isPowerStrike) {
            this.attack(target, distance); 
            return;
        }

        // Jika power strike, jalankan logika perhitungan damage ekstra
        if (distance < minRange || distance > maxRange) {
            System.out.printf("%s terlalu jauh untuk diserang!\n", target.name);
            return;
        }

        // Damage dikali 1.5
        double damage = Math.max((physicalAttack * 1.5) - target.defense, 0);
        target.takeDamage(damage);
        System.out.printf("%s menerima kerusakan skill fisik sebesar %.0f\n", target.name, damage);
    }
}
```

</div>

</div>
