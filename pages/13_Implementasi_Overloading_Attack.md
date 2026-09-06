---
layout: default
---

# Implementasi method overloading pada attack()

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-[0.9rem] leading-normal space-y-4">
  <p>
    Karakter pada sebuah game mungkin memiliki kemampuan serangan yang berbeda-beda. Jika kita ingin memperluas kemampuannya, kita punya dua opsi: menambah method baru yang berbeda, atau mengimplementasikan <i>method overloading</i>.
  </p>
  <p>
    Misal, sebuah karakter memiliki mekanisme serangan yang berbeda tergantung aksi yang dikirim pengguna. Alih-alih menulis method baru yang membingungkan, kita dapat memakai nama method yang sama (<code>attack</code>). Jika ada kondisi tertentu, alurnya juga bisa dialihkan ke method lain yang tujuannya sama-sama untuk menyerang.
  </p>
</div>

<!-- Kolom Kode -->
<div class="text-[0.7rem] leading-tight">

```java
class Character {
    
    // 1. Serangan dasar (tanpa parameter)
    public void attack() {
        System.out.println("Karakter memukul dengan tangan kosong!");
    }

    // 2. Overload: Serangan dengan senjata
    public void attack(String senjata) {
        System.out.println("Karakter menyerang dengan " + senjata + "!");
    }

    // 3. Overload: Serangan dengan senjata dan sihir
    public void attack(String senjata, String elemen) {
        // Pemanggilan method attack(String) di dalam overload lain
        this.attack(senjata); 
        System.out.println("-> Memberikan damage tambahan berelemen " + elemen);
    }
}
```

</div>

</div>
