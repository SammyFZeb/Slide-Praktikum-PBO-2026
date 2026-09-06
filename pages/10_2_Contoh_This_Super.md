---
layout: default
---

# Contoh this & super (Studi Kasus Game)

<!-- Kolom Kode -->
<div class="">

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
