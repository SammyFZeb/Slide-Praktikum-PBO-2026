---
layout: default
---

# Contoh penerapan inheritance 
*(studi kasus is-a relationship / general to specialization)*

<div class="grid grid-cols-[55%_40%] gap-8 items-center mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
    Misal diketahui sebuah sistem game yang terdapat class <code>Character</code> sebagai sistem dasar (<i>parent class</i>) untuk sistem turunannya. 
  </p>
  <p>
    Game tersebut memiliki tiga spesialisasi (<i>child class</i>): 
  </p>
  <ul class="list-disc list-inside space-y-2">
    <li><b>Warrior</b> (pengguna pedang)</li>
    <li><b>Mage</b> (pengguna sihir)</li>
    <li><b>Archer</b> (pengguna busur & serangan jarak jauh)</li>
  </ul>
  <p>
    Setiap spesialisasi mewarisi atribut dasar dari <code>Character</code> (seperti HP atau nama), tapi memiliki karakteristik serangan yang berbeda-beda.
  </p>
</div>

<!-- Kolom Gambar -->
<div class="flex justify-center items-center">

```mermaid {scale: 0.65, theme: 'dark'}
classDiagram
    direction TB
    class Character {
        +String nama
        +int hp
        +bergerak()
    }
    class Warrior {
        +tebasPedang()
    }
    class Mage {
        +lemparBolaApi()
    }
    class Archer {
        +tembakPanah()
    }
    
    Character <|-- Warrior
    Character <|-- Mage
    Character <|-- Archer
```

</div>

</div>
