---
layout: default
---

# Regular Constructor

Regular constructor memiliki parameter untuk menginisialisasikan nilai-nilai dari atribut objek berdasarkan input yang telah kita tentukan.

<div class="mt-4">

```java {all|1-9|10-15|all}
class Mobil {
    private String merek; 
    private int kapasitas; 

    // Regular Constructor
    public Mobil(String merek, int kapasitas) { 
        this.merek = merek; 
        this.kapasitas = kapasitas; 
    }
    
    public void infoMobil() {
        System.out.println("Merek: " + this.merek); 
        System.out.println("Kapasitas: " + this.kapasitas + "cc"); 
    }
}
```

</div>