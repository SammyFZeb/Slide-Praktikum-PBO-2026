---
layout: default
---

# Contoh penerapan inheritance 
*(studi kasus is-a relationship / general to specialization)*

<div class="grid grid-cols-[45%_50%] gap-8 items-center mt-2">

<!-- Kolom Teks -->
<div class="text-left text-[0.8rem] leading-normal space-y-3">
  <p>
    Pada sistem game ini, terdapat class <code>Character</code> sebagai sistem dasar (<i>parent class</i>) untuk turunan karakter lainnya. 
  </p>
  <p>
    Sistem game tersebut memiliki tiga spesialisasi (<i>child class</i>): 
  </p>
  <ul class="list-disc list-inside space-y-1">
    <li><b>Warrior</b> (Serangan jarak dekat)</li>
    <li><b>Mage</b> (Serangan area sihir)</li>
    <li><b>Archer</b> (Serangan jarak jauh)</li>
  </ul>
  <p>
    Setiap spesialisasi mewarisi seluruh atribut dan method dasar dari <code>Character</code> (seperti <code>name</code>, <code>healthPoint</code>, dll), namun bisa memiliki atribut tambahan yang spesifik sesuai spesialisasinya (contoh: <code>rage</code> untuk Warrior).
  </p>
</div>

<!-- Kolom Gambar -->
<div class="flex justify-center items-center mt-4">

```mermaid {scale: 0.55, theme: 'dark'}
classDiagram
    direction TB
    class Character {
        +String name
        +double healthPoint
        +double physicalAttack
        +double defense
        +attack(target, distance)
    }
    class Warrior {
        +double rage
    }
    class Mage {
        +double manaPoint
    }
    class Archer {
        +double arrowCount
    }
    
    Character <|-- Warrior
    Character <|-- Mage
    Character <|-- Archer
```

</div>

</div>
