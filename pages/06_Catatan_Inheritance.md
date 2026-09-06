---
layout: default
---

# Catatan mengenai inheritance

<div class="text-left text-base leading-normal space-y-4">

<p>
Java hanya dapat mewarisi dari satu class saja, berbeda dengan C++ yang memungkinkan melakukan pewarisan dari dua atau lebih class. Namun, multi inheritance menimbulkan masalah baru, yaitu diamond problem.
</p>

<h3 class="text-base font-bold text-blue-400 mt-4">Batasan Inheritance:</h3>

<ul class="list-disc list-inside space-y-2">
  <li><b>Diamond Problem</b> -> permasalahan yang terjadi ketika child-class memiliki lebih dari 1 parent-class (multiple inheritance) dimana child-class meng-inherit properties dan methods dari 2 parent class yang memiliki method dengan nama dan parameter yang sama. Karena ada diamond problem ini, maka java tidak mengizinkan adanya Multiple Inheritance satu child-class dijava hanya boleh memiliki 1 parent-class.</li>
  <li>Harus <b>memperhatikan access modifier</b> dengan teliti sebelum menurunkan suatu class. Sebagai contoh jika di parent-class memiliki atribut dengan access modifier private, maka atribut tersebut tidak dapat diakses secara langsung.</li>
</ul>

</div>
