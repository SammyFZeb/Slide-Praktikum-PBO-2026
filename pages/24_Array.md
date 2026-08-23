---
layout: default
---

# Array dalam Java

Array adalah struktur data untuk menyimpan sekumpulan data dengan tipe yang sama dalam satu variabel. Ukuran array di Java bersifat tetap (*fixed-size*) setelah diinisialisasi.

<div class="grid grid-cols-2 gap-8 items-start mt-4 text-sm">

<div>
<h3 class="text-base font-bold text-blue-400">1. Array Tipe Primitif</h3>

```java {all|2|5-6|all}
// Deklarasi array integer kapasitas 5
int[] angka = new int[5];

// Mengisi nilai pada index tertentu (dimulai dari 0)
angka[0] = 10;
angka[1] = 20;

System.out.println("Elemen pertama: " + angka[0]);
```
</div>

<div>
<h3 class="text-base font-bold text-emerald-400">2. Array dari Objek</h3>

```java {all|2|5|8-9|all}
// Deklarasi array of objects dengan kapasitas 20
Barang[] daftarBarang = new Barang[20];

// Membuat instansiasi objek baru
Barang item1 = new Barang();
item1.namaBarang = "Kopi";

// Memasukkan objek ke dalam array
daftarBarang[0] = item1;
```
</div>

</div>

<!-- Penjelasan Penting -->
<div class="bg-gray-800/60 p-3.5 rounded-lg border border-gray-700 mt-6 text-sm">
  <p class="m-0 text-gray-300">
    <strong class="text-amber-400">Penting:</strong> Saat Anda mendeklarasikan <code>new Barang[20]</code>, Anda baru menyiapkan "wadah" kosongnya saja. Anda tetap harus melakukan instansiasi <code>new Barang()</code> terlebih dahulu sebelum memasukkan objek tersebut ke dalam wadah (Array).
  </p>
</div>
