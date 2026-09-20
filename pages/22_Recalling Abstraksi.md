---
layout: default
---

# Recalling: Abstraksi (Abstract & Interface)

<div class="grid grid-cols-[40%_55%] gap-6">
<div>

**Abstract Class**:
Kelas yang tak dapat diinstansiasi langsung via `new`. *Abstract Method* dideklarasikan tanpa *body/implementasi*. *Subclass* wajib meng-*override*-nya.

**Interface** (`implements`):
Berbentuk abstrak implisit. Ibarat sebuah **Contract** yang wajib dipatuhi. Semua method otomatis memiliki akses modifier `public`.

</div>
<div>

```java
// Interface
interface BisaTerbang { 
    void terbang(); // otomatis public abstract
}

// Abstract Class
abstract class Burung {
    public abstract void bersuara(); // abstrak, no body
    public void makan() { System.out.println("Makan"); }
}

// Implementasi
class Elang extends Burung implements BisaTerbang {
    @Override public void bersuara() { System.out.println("Kwakk"); }
    @Override public void terbang() { System.out.println("Terbang"); }
}
```

</div>
</div>