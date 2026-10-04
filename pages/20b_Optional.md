# Trivia: Java Optional API

<div class="space-y-6 mt-8">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-gray-600">
<p class="text-sm text-yellow-300 leading-relaxed">Optional adalah class yang digunakan untuk menangani sebuah objek yang mungkin bernilai null. Meski pada praktiknya kita bisa mengembalikan dan/atau memeriksa jika objek bernilai null, pengguanaan Optional dapat menjadi kontrak yang mempertegas jika sebuah proses mungkin mengembalikan nilai null.</p>
</div>

<div>
<h4>Overview Penggunaan</h4>

```java
public Optional<User> findUserById(UUID id) {
  // misalnya proses query ke database untuk mencari record satu user
}

public void executor() {
  // Dalam bahasa manusia: "tolong execute findUserById(), kalau datanya ada simpan ke objek user,
  // atau kalau tidak lempar exception"
  Optional<User> user = findUserById("sembarang-uuid").orElseThrow(() -> new DataNotFoundException());
  System.out.println(user.getEmail());
}
```

</div>

</div>

---

# Method Umum yang Biasa Dipakai

<div class="space-y-6 mt-8 text-left">

<div class="grid grid-cols-2 gap-6">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-gray-600">
<h4 class="text-emerald-400 font-bold mb-2">1. Memeriksa Keberadaan Nilai</h4>
<ul class="text-sm text-gray-300 space-y-2 list-disc list-inside">
  <li><code>isPresent()</code>: Mengembalikan <i>true</i> jika ada isinya.</li>
  <li><code>isEmpty()</code>: Mengembalikan <i>true</i> jika kosong (null).</li>
  <li><code>ifPresent(action)</code>: Mengeksekusi blok kode <strong>hanya jika</strong> ada isinya.</li>
</ul>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-gray-600">
<h4 class="text-blue-400 font-bold mb-2">2. Mengekstrak Nilai</h4>
<ul class="text-sm text-gray-300 space-y-2 list-disc list-inside">
  <li><code>get()</code>: Mengambil nilai (bisa <i>crash</i> jika kosong).</li>
  <li><code>orElse(default)</code>: Mengambil nilai, atau pakai nilai <i>default</i> jika kosong.</li>
  <li><code>orElseThrow()</code>: Melempar exception spesifik jika kosong.</li>
</ul>
</div>

</div>

<div>
<h4 class="text-yellow-300 text-sm mb-2 font-bold">Contoh Penggunaan Bersih (Tanpa <i>if-else null</i>)</h4>

```java
Optional<User> optUser = findUserById(id);
// Hanya mencetak email jika usernya ditemukan (tidak peduli jika null)
optUser.ifPresent(user -> System.out.println(user.getEmail()));
```
</div>

</div>
