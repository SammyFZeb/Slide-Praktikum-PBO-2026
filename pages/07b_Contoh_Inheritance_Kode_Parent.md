---
layout: default
---

# Implementasi: Parent Class (Character)

<div class="text-left text-base leading-normal space-y-4 mt-4">

<p>
Pertama, kita definisikan class <code>Character</code> yang bertindak sebagai fondasi utama. Class ini mendefinisikan atribut dan <i>method</i> dasar yang secara umum pasti dimiliki oleh setiap karakter di dalam game.
</p>

```java
// Parent Class
public class Character {
    public String nama;
    public int hp; // Health Point

    // Method umum yang bisa diwariskan
    public void bergerak() {
        System.out.println(nama + " bergerak maju.");
    }
}
```

</div>
