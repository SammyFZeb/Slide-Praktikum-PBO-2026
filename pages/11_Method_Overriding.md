---
layout: default
---

# Method Overriding

<div class="text-left text-base leading-normal space-y-4">

<h3 class="text-base font-bold text-purple-400">Definisi</h3>
<p>
Method overriding lebih kayak nulis ulang method yang udah ada sehingga memungkinkan subclass untuk menyediakan implementasi spesifik dari sebuah metode yang sudah didefinisikan di kelas induknya (parent class).
</p>

<p>
Pada contoh sebelumnya, dikatakan bahwa setiap karakter memiliki karakteristik serangan yang berbeda. Karakteristik yang berbeda dari class utama ini dapat diimplementasikan dengan konsep method overriding. 
</p>

<p>
Mekanismenya adalah mendefinisikan ulang method dengan nama, return type, dan parameter yang sama, tetapi penerapan di dalamnya berbeda. <b>Wajib tambahkan <code>@Override</code></b> agar Java tahu ada method yang ditimpa.
</p>

<h3 class="text-base font-bold text-blue-400 mt-4">Access modifier</h3>
<p>
Access modifier di sub-classnya tidak boleh lebih ketat dari parent class.
</p>

</div>
