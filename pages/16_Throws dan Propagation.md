# Kata Kunci `throws` & Exception Propagation

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<div class="border-l-2 border-cyan-500 pl-4">
<h3 class="text-base font-bold text-cyan-400 mb-1">Keyword <code>throws</code></h3>
<p>Mekanisme untuk <strong>menandai sebuah method akan melempar exception</strong>, dan memberi tahu pemanggil:</p>
<blockquote class="mt-2 border-l-2 border-gray-500 pl-3 text-gray-300 italic">
"Tolong implementasikan <code>try-catch</code> pada program yang memanggil method ini, atau definisikan ulang <code>throws</code> di method yang memanggil."
</blockquote>
</div>

<div class="border-l-2 border-purple-500 pl-4">
<h3 class="text-base font-bold text-purple-400 mb-1">Exception Propagation</h3>
<p>Mekanisme di mana exception yang <strong>tidak langsung ditangani</strong> dilempar secara beruntun hingga berakhir di tempat yang dikhususkan untuk menanganinya.</p>
</div>

</div>

<div>

```java
public class Main {
    // Menandai method ini bisa melempar Exception
    public static String readFile(String path) throws IOException {
        return Files.readString(Path.of("src/main/resources", path));
    }

    public static void main(String[] args) {
        try {
            String isi = readFile("log.txt");
            System.out.println(isi);
        } catch (IOException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}
```

</div>

</div>
