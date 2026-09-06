---
layout: default
---

# Implementasi method overloading pada class Hewan

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
    Misal, seekor hewan memiliki cara makan yang berbeda tergantung informasi yang diberikan. Alih-alih membuat method dengan nama yang berbeda-beda, kita dapat mengimplementasikan method overloading dengan menggunakan nama method yang sama yaitu <code>makan()</code>.
  </p>

  <ul class="list-disc list-inside mb-2">
    <li><code>makan()</code></li>
    <li><code>makan(String makanan)</code></li>
    <li><code>makan(String makanan, int porsi)</code></li>
  </ul>
</div>

<!-- Kolom Kode -->
<div class="text-[0.7rem] leading-tight">

```java
class Hewan {
    public void makan() {
        System.out.println("Hewan sedang makan...");
    }

    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    public void makan(String makanan, int porsi) {
        System.out.println("Hewan makan " + porsi + " porsi " + makanan);
    }
}
```

</div>

</div>
