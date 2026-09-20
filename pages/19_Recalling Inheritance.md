---
layout: default
---

# Recalling: Inheritance & Overriding

<div class="grid grid-cols-[40%_55%] gap-6">
<div>

**Inheritance** (`extends`):
*Subclass* (anak) mewarisi *Superclass* (induk). 

`super`: Keyword pemanggil konstruktor atau method milik induk.

**Overriding** (`@Override`):
*Subclass* menimpa paksa logika method bawaan dari parent-nya.

</div>
<div>

```java
class Hewan {
    public Hewan() { System.out.println("Hewan dibuat"); }
    public void bersuara() { System.out.println("..."); }
}

class Kucing extends Hewan { // Inheritance
    public Kucing() {
        super(); // Memanggil constructor parent
    }
    
    @Override // Menimpa method parent
    public void bersuara() {
        System.out.println("Meow!"); 
    }
}
```

</div>
</div>