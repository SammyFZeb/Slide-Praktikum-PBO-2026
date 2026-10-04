# Trivia: Java Optional API

<div class="space-y-6 mt-8">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-gray-600">
<p class="text-sm text-yellow-300 leading-relaxed">Optional adalah class yang digunakan untuk menangani sebuah objek yang mungkin bernilai null. Meski pada praktiknya kita bisa mengembalikan dan/atau memeriksa jika objek bernilai null, pengguanaan Optional dapat menjadi kontrak yang mempertegas jika sebuah proses mungkin mengembalikan nilai null.</p>
</div>

<div>
<h4>Contoh Penggunaan (<span class="text-blue-400 font-mono text-base mb-2 font-bold">.orElseThrow()</span>)</h4>

```java
public Optional<User> findUserById(UUID id) {
  // misalnya proses query ke database untuk mencari record satu user
}

public void executor() {
  // Dalam bahasa manusia: "tolong execute findUserById(), kalau datanya ada simpan ke objek user,
  // atau kalau tidak, lempar exception"
  User user = findUserById("sembarang-uuid").orElseThrow(() -> new DataNotFoundException());
  System.out.println(user.getEmail());
}
```

</div>

</div>

---

<h1 class="text-left">Method Umum yang Biasa Dipakai</h1>

<div class="space-y-6 mt-8 text-left">

<div>
<h4 class="text-emerald-400 font-mono text-base mb-2 font-bold">orElse(T args)</h4>

```java
// Jika alamat tidak ada, gunakan alamat default
Address address = addressRepository.findByUserId(id).orElse(new Address("Jl. Perdatam VI", "Jakarta Selatan"));
```

</div>

<div>
<h4 class="text-blue-400 font-mono text-base mb-2 font-bold">orElseGet(Supplier&lt;? extends T&gt; other)</h4>

```java
// Jika user tidak ada di cache, ambil langsung dari database
User user = userCache.findById(id).orElseGet(() -> userRepository.findById(id));
```

</div>

<div>
<h4 class="text-yellow-400 font-mono text-base mb-2 font-bold">ifPresent(Consumer&lt;? super T&gt; action)</h4>

```java
// Jika user ada, kirim email
userRepository.findById(id).ifPresent(user -> emailService.send(user.getEmail()));
```

</div>

</div>
