---
layout: default
---

# Contoh this & super (Studi Kasus Game)

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
    Mari kita perhatikan bagaimana penggunaan <code>this</code> dan <code>super</code> di dalam *constructor* untuk karakter game kita:
  </p>
  <ul class="list-disc list-inside space-y-2">
    <li><code>this.name</code> dipakai di class <code>Character</code> untuk merujuk pada atribut *class* (bukan parameter).</li>
    <li><code>super(name, currentLevel)</code> di class <code>Warrior</code> berfungsi mengirim data ke *constructor parent* (<code>Character</code>) agar atribut dasarnya terinisialisasi.</li>
  </ul>
</div>

<!-- Kolom Kode -->
<div class="text-[0.65rem] leading-tight">

```java
public class Character {
    protected String name;
    protected int currentLevel;

    public Character(String name, int currentLevel) {
        // 'this' membedakan atribut milik class dengan parameter
        this.name = name; 
        this.currentLevel = currentLevel;
    }
}

public class Warrior extends Character {
    private double healthPoint;
    public Warrior(String name, int currentLevel) {
        // 'super' memanggil dan mengirim data ke constructor parent
        super(name, currentLevel); 
    }
    
    // Constructor Warrior yang memiliki parameter lebih lengkap
    public Warrior(String name, int currentLevel, double healthPoint/) {
        super(name, currentLevel);
        this.healthPoint = healthPoint;
    }
}
```

</div>

</div>
