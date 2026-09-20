---
layout: default
---

# Recalling: Kata Kunci this & super

<div class="grid grid-cols-[40%_55%] gap-6">
<div>

**Kata Kunci `this`**:
Berfungsi untuk merepresentasikan (menunjuk) atribut atau *method* milik instansiasi objek dari kelas itu sendiri. Biasanya digunakan untuk membedakan antara variabel milik kelas dengan *parameter* lokal.

**Kata Kunci `super`**:
Berfungsi untuk merepresentasikan (menunjuk) atribut atau *method* dari *parent class*. Pada *constructor subclass*, `super()` digunakan untuk memanggil dan memberikan data ke *constructor parent*.

</div>
<div>

```java
public class Character {
    protected String name;
    
    public Character(String name) {
        // 'this' membedakan atribut dengan parameter lokal
        this.name = name; 
    }
}

public class Warrior extends Character {
    private double hp;
    
    public Warrior(String name, double hp) {
        // 'super' mengirim name ke constructor parent
        super(name);
        this.hp = hp;
    }
    
    public void printStats() {
        // 'super' juga bisa panggil method/atribut parent
        System.out.println("Nama: " + super.name); 
        System.out.println("HP  : " + this.hp);
    }
}
```

</div>
</div>