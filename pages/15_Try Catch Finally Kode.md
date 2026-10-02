# Contoh `try` — `catch` — `finally`

<div class="grid grid-cols-2 gap-6 mt-2 items-start">

<div>

```java {all|4-9|10-13|14-16|all}
import java.util.Scanner;

public class ContohTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Blok happy path
            System.out.print("Masukkan angka: ");
            int angka = Integer.parseInt(sc.nextLine());
            System.out.println("Hasil: " + (100 / angka));
        } catch (NumberFormatException e) {
            // Jika input bukan angka
            System.out.println("Error: Input bukan angka!");
        } catch (ArithmeticException e) {
            // Jika dibagi nol
            System.out.println("Error: Tidak bisa dibagi 0!");
        } finally {
            // Selalu dieksekusi
            System.out.println("Program selesai.");
            sc.close();
        }
    }
}
```

</div>

<div class="text-sm leading-relaxed space-y-4">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="font-semibold text-yellow-300 mb-2">💬 Dalam Bahasa Manusia:</p>
<p class="italic text-gray-300">"Tolong <strong>coba (try)</strong> jalankan mekanisme di blok try. Jika ada exception, <strong>lempar (throw)</strong> exceptionnya, lalu <strong>tangkap (catch)</strong> dan jalankan perlakuan khusus. Jika sudah selesai, panggil alur di blok <strong>finally</strong> sebagai penutup."</p>
</div>

<div v-click class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-blue-700">
<p class="font-semibold text-blue-300 mb-2">🤔 Bagaimana jika method hanya ingin melempar exception, tanpa menangani langsung?</p>
<p class="text-gray-300">Gunakan kata kunci <code class="text-cyan-400">throws</code> →</p>
</div>

</div>

</div>
