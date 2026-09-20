---
layout: default
---

# Hubungan Antar Kelas

<div class="grid grid-cols-[40%_55%] gap-4 items-center">

<div class="text-[0.8rem] leading-normal">

- **Composition**: bentuk dari Aggregation yang lebih ketat.
- Composition merepresentasikan hubungan **part-a** antara dua class dengan lifespan yang sama. Jika 1 class telah mati, maka dependency juga akan ikut mati.
- Bertipe *unidirectional association* (hubungan satu arah).
- Pada class diagram, ditandai dengan garis yang memiliki bentuk diamond yang diwarnai (solid).

</div>
<div class="transform scale-90">

```mermaid
classDiagram
  direction LR
  User *-- Address
  
  class User {
    -id: int
    -name: String
    -address: Address
    +User(id: int, name: String, address: Address)
  }
  
  class Address {
    -id: int
    -streetNumber: int
    -city: String
    +Address(id: int, streetNumber: int, city: String)
  }
```

</div>
</div>
