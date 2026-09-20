---
layout: default
---

# UML Interface & Abstract Class
<div class="grid grid-cols-2 gap-4 mt-8">

<div>

- **Abstract class** dituliskan dengan nama class yang dibuat *Italic* (miring).
- **Interface** dituliskan dengan penanda `<<interface>>` di atas nama kelasnya.
- Garis penyambung implementasi *interface* menggunakan garis putus-putus.

</div>
<div class="flex justify-center -mt-8 transform scale-90">

```mermaid
classDiagram
  direction BT
  
  class BangunDatar {
    <<abstract>>
    +luas() double*
    +keliling() double*
  }
  
  class DapatDiterbangkan {
    <<interface>>
    +terbang() void
  }
  
  class Burung {
    +terbang() void
  }
  
  class Persegi {
    -sisi: double
    +luas() double
    +keliling() double
  }
  
  Persegi --|> BangunDatar
  Burung ..|> DapatDiterbangkan
```

</div>
</div>
