# Class `Throwable` & Jenis Exception

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<div class="border-l-2 border-purple-500 pl-4">
<h3 class="text-base font-bold text-purple-400 mb-1">Class Throwable</h3>
<p>
Java memiliki class <code>Throwable</code>, yang artinya seluruh object dari class <code>Throwable</code> atau turunannya dapat <strong>"dilempar"</strong> menggunakan keyword <code>throw</code>.
</p>
<p class="mt-2">
Keyword <code>throw</code> digunakan untuk melempar sinyal bahwa ada <strong>exception / kesalahan</strong> ketika runtime.
</p>
</div>

<div class="border-l-2 border-blue-500 pl-4">
<h3 class="text-base font-bold text-blue-400 mb-1">Dua Jenis Exception</h3>
<p>Java memiliki dua jenis exception yang lumrah dibahas:</p>
<ul class="mt-1 space-y-1">
  <li><span class="text-cyan-400 font-semibold">Checked Exception</span></li>
  <li><span class="text-orange-400 font-semibold">Unchecked Exception</span></li>
</ul>
<p class="mt-2">Keduanya terjadi di <strong>level runtime</strong>. Perbedaannya adalah bagaimana Java memperlakukan keduanya.</p>
</div>

</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-5 border border-gray-600 text-sm leading-relaxed">

<p class="text-center font-bold text-yellow-300 mb-3">Contoh: melempar exception secara eksplisit</p>

```java
throw new RuntimeException("Ada yang salah!");
```

<p class="mt-4 text-gray-300">Baik exception yang muncul karena <em>error</em> maupun yang <em>sengaja dilempar</em>, keduanya tetap perlu <strong>penanganan khusus</strong>.</p>

</div>

</div>
