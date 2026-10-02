# Kata Kunci `throws` & Exception Propagation

<div class="grid grid-cols-2 gap-8 mt-3 text-sm">

<div class="leading-relaxed space-y-4">

<div class="border-l-2 border-cyan-500 pl-4">
<h3 class="text-base font-bold text-cyan-400 mb-1">Keyword <code>throws</code></h3>
<p><code>throws</code> (berbeda dengan <code>throw</code>) adalah mekanisme untuk <strong>menandai sebuah method akan melempar exception</strong>, dan memberi tahu:</p>
<blockquote class="mt-2 border-l-2 border-gray-500 pl-3 text-gray-300 italic">
"Tolong implementasikan <code>try-catch</code> pada program yang memanggil method ini. Kalau pun tidak, definisikan ulang kata kunci <code>throws</code> di method terkait."
</blockquote>
</div>

<div v-click class="border-l-2 border-purple-500 pl-4">
<h3 class="text-base font-bold text-purple-400 mb-1">Exception Propagation</h3>
<p>Mekanisme di mana exception yang <strong>tidak langsung ditangani</strong> dilempar secara beruntun hingga berakhir di tempat yang dikhususkan untuk menanganinya.</p>
</div>

</div>

<div v-click>

```java {all|2|8|13-17|all}
public class FileProcessor {

    // Menandai: method ini bisa melempar IOException
    public static String bacaFile(String path)
            throws IOException {
        return Files.readString(Path.of(path));
    }

    // Pemanggil WAJIB menangani atau melempar lagi
    public static void main(String[] args) {
        try {
            String isi = bacaFile("data.txt");
            System.out.println(isi);
        } catch (IOException e) {
            System.out.println(
                "Gagal membaca: " + e.getMessage()
            );
        }
    }
}
```

</div>

</div>
