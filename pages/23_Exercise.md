---
layout: center
---

# Exercise <kbd><span class='text-teal'>Test.java</span></kbd>

<div class="grid grid-cols-2 gap-2">

<div class="text-sm">

<!-- Buat abstract class 'Shape' dengan tiga method abstrak yaitu 'rectangleArea' yang memiliki dua parameter, 'squareArea' dan 'circleArea' yang masing-masing memiliki satu parameter. Parameter dalam 'rectangleArea' adalah panjang dan lebar persegi panjang, 'squareArea' adalah sisi persegi, dan 'circleArea' adalah jari-jari lingkaran. Kemudian buat kelas 'Area' yang meng-extend kelas 'Shape' untuk mencetak luas persegi panjang, persegi dan lingkaran.  -->

Buatlah 7 buah class :
- `Rectangle`, class interface dengan 1 buah methods :
    - CalculateArea(double length, double width)
- `Square`, class interface dengan 1 buah methods :
    - CalculateArea(double side)
- `Circle`, class interface dengan 1 buah methods :
    - CalculateArea(double radius)
- `Area1`, class implementasi `Rectangle`
- `Area2`, class implementasi `Square`
- `Area3`, class implementasi `Circle`
- `GeometricObject`, parent class dari `Area1`, `Area2`, dan `Area3` (di extend) dengan 1 buah method : 
    - CalculateArea() yang mereturn 0

Buat kelas `Test.java` untuk membuat objek dari kelas `Area1`,`Area2`, dan `Area3` lalu panggil ketiga objek tersebut beserta methodnya.

</div>

<div class='mt-6 grid grid-cols-[0.2fr_1.5fr] items-center text-sm gap-3'>
<span class='text-xs text-white font-extrabold uppercase text-yellow'>Input</span>
<div class='flex flex-col mb-2'>
    <span>panjang & lebar persegi panjang, sisi persegi, jari-jari lingkaran</span>
</div>
<span class='text-xs text-white font-extrabold uppercase text-yellow'>Output</span>
<span>luas persegi panjang, persegi, dan lingkaran</span>
<span class='text-xs text-white font-extrabold uppercase text-yellow'>Contoh</span>
<div class='mt-4 flex flex-col mb-2 gap-0'>
Contoh Input & Output

```bash
Masukkan panjang persegi panjang: 2
Masukkan lebar persegi panjang: 3
Masukkan sisi persegi: 4
Masukkan jari-jari lingkaran: 5
```
```bash
Luas persegi panjang: 6.00
Luas persegi: 16.00
Luas lingkaran: 78.54
```

</div>
</div>
</div>