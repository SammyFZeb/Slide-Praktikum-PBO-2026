---
layout: default
---

# Contoh this & super (Studi Kasus Game)

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
    Mari kita terapkan *constructor* pada studi kasus karakter game sebelumnya:
  </p>
  <ul class="list-disc list-inside space-y-2">
    <li><code>this.nama</code> dipakai di class <code>Character</code> untuk menegaskan bahwa kita merujuk pada atribut milik *class* tersebut (bukan parameter).</li>
    <li><code>super(nama, hp)</code> di class <code>Warrior</code> berfungsi memanggil *constructor* milik *parent class* (<code>Character</code>) untuk menginisialisasi atribut dasar.</li>
    <li><code>super.nama</code> memanggil atribut dari *parent* secara eksplisit (walaupun bisa dipanggil langsung tanpa `super` jika tipenya `protected`).</li>
  </ul>
</div>

<!-- Kolom Kode -->
<div class="text-xs leading-tight">

```java
class Character {
    protected String nama;
    protected int hp;

    public Character(String nama, int hp) {
        // 'this' membedakan atribut milik class dengan parameter
        this.nama = nama; 
        this.hp = hp;
    }
}

class Warrior extends Character {
    private String tipePedang;

    public Warrior(String nama, int hp, String tipePedang) {
        // 'super' memanggil dan mengirim data ke constructor parent
        super(nama, hp); 
        this.tipePedang = tipePedang;
    }
    
    public void info() {
        System.out.println("Nama: " + super.nama);
        System.out.println("Senjata: " + this.tipePedang);
    }
}
```

</div>

</div>
