---
layout: default
---

# Kapan Inheritance digunakan?

<div class="text-left text-base leading-normal space-y-4">

<ol class="list-decimal list-inside space-y-2">
  <li><b>Kebutuhan untuk modifikasi incremental</b>, pada definisi dijelaskan jika konsep ini memungkinkan untuk mengembangkan fitur di class baru, adaptasi ini memungkinkan modifikasi dengan membuat definisi baru dan menjadi bagian sistem lama tidak rusak.</li>
  <li><b>Terdapat struktur taksonomi (is-a relationship)</b> pada sistem yang dikembangkan, kasus paling umum di mana inheritance digunakan ketika sebuah class memiliki hubungan representatif dengan class lain.</li>
  <li><b>Kebutuhan untuk code reusablity</b>, meski tidak memiliki hubungan konseptual yang nyata, inheritance dapat digunakan untuk code reuseablity jika sebuah class memiliki karakteristik yang mirip dengan class lain.</li>
</ol>

<h3 class="text-base font-bold text-blue-400 mt-4">Tujuannya apa sih:</h3>

<ul class="list-disc list-inside">
  <li>DRY (Don't Repeat Yourself)</li>
  <li>Code Reusability</li>
</ul>

<p>
Dengan adanya konsep ini lebih memudahkan programmer jika menghadapi situasi dimana ada 2 class berbeda yang memiliki behaviour yang sama sehingga method tidak perlu ditulis ulang dengan catatan kedua class tersebut memiliki hubungan is-a.
</p>

</div>
