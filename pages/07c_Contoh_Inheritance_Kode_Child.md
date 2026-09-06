---
layout: default
---

# Implementasi: Child Class (Warrior, Mage, Archer)

<div class="grid grid-cols-2 gap-8 items-start mt-2">

<!-- Kolom Kiri -->
<div class="text-[0.75rem] leading-tight space-y-4">
  <p class="text-sm">Dengan menggunakan keyword <code>extends</code>, class turunan secara otomatis mewarisi atribut dan <code>bergerak()</code> dari class Character, lalu menambahkan serangan spesifik mereka sendiri.</p>

```java
public class Warrior extends Character {
    public void tebasPedang() {
        System.out.println(nama + " menebas dengan pedang!");
    }
}
```

```java
public class Mage extends Character {
    public void lemparBolaApi() {
        System.out.println(nama + " melempar bola api!");
    }
}
```
</div>

<!-- Kolom Kanan -->
<div class="text-[0.75rem] leading-tight space-y-4 mt-16">

```java
public class Archer extends Character {
    public void tembakPanah() {
        System.out.println(nama + " menembakkan panah!");
    }
}
```
</div>

</div>
